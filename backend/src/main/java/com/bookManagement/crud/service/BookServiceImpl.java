package com.bookManagement.crud.service;

import com.bookManagement.crud.dao.BookDAO;
import com.bookManagement.crud.entity.Book;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private BookDAO bookDAO;

    @Autowired
    public BookServiceImpl(BookDAO theBookDAO) {
        this.bookDAO=theBookDAO;
    }

    @Override
    public List<Book> findAll() {
        return bookDAO.findAll();
    }

    @Override
    @Transactional
    public Book save(Book theBook) {
        return bookDAO.save(theBook);
    }

    @Override
    public Book findById(int theBookId) {
        return bookDAO.findById(theBookId);
    }

    @Override
    @Transactional
    public void deleteById(int theBookId) {
        bookDAO.deleteById(theBookId);

    }

}
