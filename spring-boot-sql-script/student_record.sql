-- Create the database
CREATE DATABASE IF NOT EXISTS student_directory;

-- Use the database
USE student_directory;

DROP TABLE IF EXISTS `student`;

-- Create the book table
CREATE TABLE IF NOT EXISTS student (
    s_id INT NOT NULL AUTO_INCREMENT,
    s_course VARCHAR(255) default NULL,
    s_name VARCHAR(255) default NULL,
    s_email VARCHAR(100) default NULL,
    age INT default NULL,
    Enrollment_Date DATE default NULL,
     PRIMARY KEY (`s_id`)
)ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

-- Insert sample data
INSERT INTO student (s_id, s_name, s_course, s_email, age, Enrollment_Date) VALUES
(1,'Rishita Bhatnagar', 'Java', 'rishita@gmail.com', 20, '2022-11-29'),
(2,'Aditya Raj', 'Python', 'aditya@gmail.com', 19, '2022-12-08'),
(3,'Riya Karki', 'Cpp', 'riya@gmail.com', 21, '2022-11-10'),
(4,'Rohit Negi', 'CProgramming', 'rohit@gmail.com', 20, '2022-11-28'),
(5,'Yash Garg', 'JavaScript', 'yash@gmail.com', 22, '2021-09-16');