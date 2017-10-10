-- phpMyAdmin SQL Dump
-- version 4.2.11
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 19, 2017 at 02:09 PM
-- Server version: 5.6.21
-- PHP Version: 5.6.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `edu_java_hibernate`
--

-- --------------------------------------------------------

--
-- Table structure for table `ROLE`
--

CREATE TABLE IF NOT EXISTS `ROLE` (
`ROLE_ID` int(11) NOT NULL,
  `ROLE_NAME` varchar(20) CHARACTER SET utf8 DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `ROLE`
--

INSERT INTO `ROLE` (`ROLE_ID`, `ROLE_NAME`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `USERS`
--

CREATE TABLE IF NOT EXISTS `USERS` (
`ID` int(11) NOT NULL,
  `VERSION` int(11) NOT NULL,
  `USERNAME` varchar(255) NOT NULL,
  `NAME` varchar(255) NOT NULL,
  `PASSWORD` varchar(255) NOT NULL,
  `MOBILE` varchar(255) NOT NULL,
  `EMAIL` varchar(255) NOT NULL,
  `ADDRESS` varchar(255) NOT NULL,
  `ROLE` varchar(100) NOT NULL,
  `ROLE_ID` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `USERS`
--

INSERT INTO `USERS` (`ID`, `VERSION`, `USERNAME`, `NAME`, `PASSWORD`, `MOBILE`, `EMAIL`, `ADDRESS`, `ROLE`, `ROLE_ID`) VALUES
(1, 1, 'haopv', 'Pham Van Hao', 'e10adc3949ba59abbe56e057f20f883e', '0985258494', 'haopv525@gmail.com', 'HN', 'ADMIN', 1),
(2, 1, 'hao', 'Pham Van Hao 2', 'e10adc3949ba59abbe56e057f20f883e', '0985258494', 'haopv5252@gmail.com', 'HN', 'USER', 2),
(3, 1, 'admin', 'admin', 'e10adc3949ba59abbe56e057f20f883e', '0985258494', 'haopv5253@gmail.com', 'HN', 'ADMIN', 1),
(5, 1, 'user', 'user', 'e10adc3949ba59abbe56e057f20f883e', '0985258494', 'haopv5254@gmail.com', 'HN', 'USER', 2);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ROLE`
--
ALTER TABLE `ROLE`
 ADD PRIMARY KEY (`ROLE_ID`);

--
-- Indexes for table `USERS`
--
ALTER TABLE `USERS`
 ADD PRIMARY KEY (`ID`), ADD UNIQUE KEY `ID` (`ID`), ADD UNIQUE KEY `USERNAME` (`USERNAME`), ADD UNIQUE KEY `EMAIL` (`EMAIL`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ROLE`
--
ALTER TABLE `ROLE`
MODIFY `ROLE_ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `USERS`
--
ALTER TABLE `USERS`
MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
