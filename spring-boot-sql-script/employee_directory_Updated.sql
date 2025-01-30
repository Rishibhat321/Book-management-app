CREATE DATABASE  IF NOT EXISTS `employee_directory`;
USE `employee_directory`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `emp_id` int NOT NULL AUTO_INCREMENT,
  `First_Name` varchar(45) DEFAULT NULL,
  `Last_Name` varchar(45) DEFAULT NULL,
  `Email` varchar(45) DEFAULT NULL,
  `Department` varchar(45) DEFAULT NULL,
  `Designation` varchar(45) DEFAULT NULL,
  `salary` DOUBLE default NULL,
  `Location` varchar(255) DEFAULT NULL,
  `Reporting_Manager` varchar(45) DEFAULT NULL,
  `Joining_Date` DATE default NULL,
  `Mobile_Number` varchar(15) default NULL,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `employee` (`First_Name`, `Last_Name`, `Email`, `Department`, `Designation`, `salary`, `Location`, `Reporting_Manager`, `Joining_Date`, `Mobile_Number`)
VALUES
('John', 'Doe', 'john.doe@example.com', 'IT', 'Software Engineer', 65000, 'New York, USA', 'Jane Smith', '2023-01-15', '1234567890'),
('Jane', 'Smith', 'jane.smith@example.com', 'IT', 'Manager', 85000, 'San Francisco, USA', 'Robert Brown', '2022-03-10', '1234567891'),
('Emily', 'Johnson', 'emily.johnson@example.com', 'HR', 'HR Specialist', 45000, 'Los Angeles, USA', 'Michael Taylor', '2021-08-25', '1234567892'),
('Michael', 'Taylor', 'michael.taylor@example.com', 'HR', 'Manager', 78000, 'Chicago, USA', 'Robert Brown', '2020-07-30', '1234567893'),
('Chris', 'Evans', 'chris.evans@example.com', 'Finance', 'Financial Analyst', 58000, 'Boston, USA', 'Susan Wilson', '2019-12-01', '1234567894'),
('Susan', 'Wilson', 'susan.wilson@example.com', 'Finance', 'Manager', 92000, 'Houston, USA', 'Robert Brown', '2018-05-15', '1234567895'),
('Anna', 'Davis', 'anna.davis@example.com', 'Marketing', 'Marketing Executive', 52000, 'Seattle, USA', 'Rachel Green', '2023-06-20', '1234567896'),
('Rachel', 'Green', 'rachel.green@example.com', 'Marketing', 'Manager', 79000, 'Denver, USA', 'Robert Brown', '2021-11-18', '1234567897');

-- Sample data inserted successfully
