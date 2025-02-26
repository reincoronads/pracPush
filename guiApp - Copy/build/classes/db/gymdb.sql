-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2025 at 06:50 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gymdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `client_tbl`
--

CREATE TABLE `client_tbl` (
  `client_id` int(11) NOT NULL,
  `client_Fname` varchar(50) NOT NULL,
  `client_Lname` varchar(50) NOT NULL,
  `client_Address` varchar(50) NOT NULL,
  `client_Email` varchar(50) NOT NULL,
  `client_Phone` varchar(50) NOT NULL,
  `client_user` varchar(50) NOT NULL,
  `client_pass` varchar(50) NOT NULL,
  `client_status` varchar(50) NOT NULL,
  `client_type` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `client_tbl`
--

INSERT INTO `client_tbl` (`client_id`, `client_Fname`, `client_Lname`, `client_Address`, `client_Email`, `client_Phone`, `client_user`, `client_pass`, `client_status`, `client_type`) VALUES
(7, 'Mabs', 'Gabs', 'To-Block', 'maby@example.com', '09885511144', 'mabymego', '123456', 'Active', 'User');

-- --------------------------------------------------------

--
-- Table structure for table `coach_tbl`
--

CREATE TABLE `coach_tbl` (
  `coach_id` int(11) NOT NULL,
  `coach_Fname` int(11) NOT NULL,
  `coach_Lname` int(11) NOT NULL,
  `coach_Phone` int(11) NOT NULL,
  `coach_Email` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `client_tbl`
--
ALTER TABLE `client_tbl`
  ADD PRIMARY KEY (`client_id`);

--
-- Indexes for table `coach_tbl`
--
ALTER TABLE `coach_tbl`
  ADD PRIMARY KEY (`coach_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `client_tbl`
--
ALTER TABLE `client_tbl`
  MODIFY `client_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
