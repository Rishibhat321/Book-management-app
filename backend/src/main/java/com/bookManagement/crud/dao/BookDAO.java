package com.bookManagement.crud.dao;

import com.bookManagement.crud.entity.Book;

import java.util.List;

public interface BookDAO {

    List<Book> findAll();

    Book save(Book theBook);
}
