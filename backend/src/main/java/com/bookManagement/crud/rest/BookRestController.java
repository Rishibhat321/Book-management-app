package com.bookManagement.crud.rest;

import com.bookManagement.crud.entity.Book;
import com.bookManagement.crud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookRestController {

    private BookService bookService;

    @Autowired
    public BookRestController(BookService theBookService) {
        this.bookService=theBookService;
    }

    // avoid using crud operation names in the url
    @GetMapping("/books")
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @PostMapping("/books")
    public Book addBook(@RequestBody Book theBook) {

        theBook.setBook_Id(0);

        Book dbBook = bookService.save(theBook);

        return dbBook;
    }


    @PutMapping("/books")
    public Book UpdateBook(@RequestBody Book theBook) {
        Book dbBook = bookService.save(theBook);

        return dbBook;
    }

    @DeleteMapping("/books/{theBookId}")
    public String deleteBook(@PathVariable int theBookId) {

        Book theBook = bookService.findById(theBookId);

        if(theBook==null) {
            throw new RuntimeException("Book id not found: " + theBookId);
        }

        bookService.deleteById(theBookId);

        return "Deleted Book id - " + theBookId;

    }



}
