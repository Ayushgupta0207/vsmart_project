-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 19, 2021 at 12:49 PM
-- Server version: 10.4.20-MariaDB
-- PHP Version: 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `employee`
--

-- --------------------------------------------------------

--
-- Table structure for table `contact`
--

CREATE TABLE `contact` (
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `country` varchar(30) NOT NULL,
  `subject` varchar(300) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `contact`
--

INSERT INTO `contact` (`first_name`, `last_name`, `country`, `subject`) VALUES
('Harsh', 'Gupta', 'india', 'Unable to update my stock details.\r\nplease help me.'),
('Abhishek', 'yadav', 'canada', '');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` varchar(30) NOT NULL,
  `password2` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `email`, `password`, `password2`) VALUES
('Ansh Saxena', 'ansh562000@gmail.com', '1234', '1234'),
('Ayush Gupta', 'ayush@gmail.com', 'ayush', 'ayush'),
('Anjali', 'anjali@gmail.com', '1234', '1234'),
('Pravendra Singh', 'Pravendra@gmail.com', '1234', '1234');

-- --------------------------------------------------------

--
-- Table structure for table `stock`
--

CREATE TABLE `stock` (
  `Id` varchar(20) NOT NULL,
  `pc` varchar(40) NOT NULL,
  `pn` varchar(40) NOT NULL,
  `md` varchar(20) NOT NULL,
  `ed` varchar(40) NOT NULL,
  `seller` varchar(40) NOT NULL,
  `total_stock` varchar(20) NOT NULL,
  `stock_left` varchar(20) NOT NULL,
  `price` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `stock`
--

INSERT INTO `stock` (`Id`, `pc`, `pn`, `md`, `ed`, `seller`, `total_stock`, `stock_left`, `price`) VALUES
('1', 'Daily Products', 'Tea', '01-07-21', 'Best Before 6 Month', 'Taj Mahal', '800', '212', '55'),
('2', 'Daily Products', 'Bread', '01-07-21', 'best before one month', 'Good Morning', '780', '225', '45'),
('3', 'Grocery', 'Broccoli', '01-07-21', 'Best Before 2 Days', 'Modern Farms', '700', '350', '80'),
('5', 'Covid Essentials', 'Mask', '23/2/21', 'Best before 1 year', 'Savlon', '12000', '6530', '70/mask');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `stock`
--
ALTER TABLE `stock`
  ADD PRIMARY KEY (`Id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
