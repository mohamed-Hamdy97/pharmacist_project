-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Aug 08, 2018 at 03:17 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `myuserdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `uers`
--

CREATE TABLE `uers` (
  `id` int(11) NOT NULL,
  `name` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `year` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `uers`
--

INSERT INTO `uers` (`id`, `name`, `age`, `year`) VALUES
(11, 'hjfh', '7', '7'),
(13, 'slkhdkjsdh', '67', '86'),
(14, 'fg', '4', '43'),
(17, 'ds', 'sdf', 'sdfg'),
(18, 'illness meet worm', 'septazoool', 'hidd '),
(19, 'illness meet worm', 'septazoool', 'hidd '),
(20, '32', '3', '2'),
(21, 'wd', 'sd', 'd'),
(24, 'بسي', 'تنل', 'تنعغت');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `uers`
--
ALTER TABLE `uers`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `uers`
--
ALTER TABLE `uers`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
