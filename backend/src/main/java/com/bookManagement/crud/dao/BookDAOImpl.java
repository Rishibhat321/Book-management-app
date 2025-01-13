package com.bookManagement.crud.dao;

import com.bookManagement.crud.entity.Book;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDAOImpl implements BookDAO{

    // define field for entitymanager

    private EntityManager entityManager;

    // set up constructor injection
    @Autowired
    public BookDAOImpl(EntityManager theEntityManager) {
        this.entityManager=theEntityManager;
    }


    @Override
    public List<Book> findAll() {

        // create a query
        TypedQuery<Book> theQuery = entityManager.createQuery("FROM Book",
                Book.class);

        List<Book> books = theQuery.getResultList();

        return books;

    }

    @Override
    public Book save(Book theBook) {
        Book newBook = entityManager.merge(theBook);

        return newBook;
    }
}
