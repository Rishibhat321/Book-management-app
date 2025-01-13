-- Create the database
CREATE DATABASE IF NOT EXISTS book_directory;

-- Use the database
USE book_directory;

DROP TABLE IF EXISTS `book`;

-- Create the book table
CREATE TABLE IF NOT EXISTS book (
    book_id INT NOT NULL AUTO_INCREMENT,
    Title VARCHAR(255) default NULL,
    Author_Name VARCHAR(255) default NULL,
    Genre VARCHAR(100) default NULL,
    Book_Price DOUBLE default NULL,
    Publication_Date DATE default NULL,
     PRIMARY KEY (`book_id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Insert sample data
INSERT INTO book (Title, Author_Name, Genre, Book_Price, Publication_Date) VALUES
('To Kill a Mockingbird', 'Harper Lee', 'Fiction', 10.99, '1960-07-11'),
('1984', 'George Orwell', 'Dystopian', 15.50, '1949-06-08'),
('The Great Gatsby', 'F. Scott Fitzgerald', 'Classic', 12.75, '1925-04-10'),
('Pride and Prejudice', 'Jane Austen', 'Romance', 8.99, '1813-01-28'),
('The Catcher in the Rye', 'J.D. Salinger', 'Fiction', 14.95, '1951-07-16');