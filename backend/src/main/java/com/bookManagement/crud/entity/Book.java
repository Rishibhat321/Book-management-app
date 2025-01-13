package com.bookManagement.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="book_id")
    private int book_Id;

    @Column(name="Title")
    private String title;

    @Column(name="Author_Name")
    private String author_name;

    @Column(name="Genre")
    private String genre;

    @Column(name="Book_Price")
    private double price;

    @Column(name="Publication_Date")
    private String publication_date;

    // define constructors
    public Book() {

    }

    public Book(String title, String author_name, String genre, double price, String publication_date) {
        this.title=title;
        this.author_name=author_name;
        this.genre=genre;
        this.price=price;
        this.publication_date=publication_date;
    }

    // define getters/setters

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getBook_Id() {
        return book_Id;
    }

    public void setBook_Id(int book_Id) {
        this.book_Id = book_Id;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(String publication_date) {
        this.publication_date = publication_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // define toString method

    @Override
    public String toString() {
        return "Book{" +
                "author_name='" + author_name + '\'' +
                ", book_Id=" + book_Id +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", publication_date='" + publication_date + '\'' +
                '}';
    }


}
