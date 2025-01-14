package com.bookManagement.crud.service;

import com.bookManagement.crud.entity.Book;

import java.util.List;

public interface BookService {

    // same methods used in the DAO Layer
    List<Book> findAll();

    Book save(Book theBook);

    Book findById(int theBookId);

    public void deleteById(int theBookId);

}
