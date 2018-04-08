-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.72-community


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema tms
--

CREATE DATABASE IF NOT EXISTS tms;
USE tms;

--
-- Definition of table `product`
--

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `product_code` varchar(45) DEFAULT NULL,
  `unitPrice` int(11) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `totalPrice` int(11) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `purchase_date` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `product`
--

/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` (`id`,`name`,`product_code`,`unitPrice`,`qty`,`totalPrice`,`category`,`purchase_date`) VALUES 
 (4,'Nokia','nokia1100',1200,20,24000,'Nokia','22-11-2017');
/*!40000 ALTER TABLE `product` ENABLE KEYS */;


--
-- Definition of table `productsummary`
--

DROP TABLE IF EXISTS `productsummary`;
CREATE TABLE `productsummary` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_code` varchar(45) DEFAULT NULL,
  `purchase_qty` int(11) DEFAULT NULL,
  `sold_qty` int(11) DEFAULT NULL,
  `avilable_qty` int(11) DEFAULT NULL,
  `product_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `productsummary`
--

/*!40000 ALTER TABLE `productsummary` DISABLE KEYS */;
INSERT INTO `productsummary` (`id`,`product_code`,`purchase_qty`,`sold_qty`,`avilable_qty`,`product_name`) VALUES 
 (2,'nokia1100',25,5,20,'Nokia');
/*!40000 ALTER TABLE `productsummary` ENABLE KEYS */;


--
-- Definition of table `sales_details`
--

DROP TABLE IF EXISTS `sales_details`;
CREATE TABLE `sales_details` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `product_name` varchar(45) DEFAULT NULL,
  `product_code` varchar(45) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `unit_price` int(11) DEFAULT NULL,
  `total_price` varchar(45) DEFAULT NULL,
  `category` varchar(45) DEFAULT NULL,
  `sales_date` varchar(45) DEFAULT NULL,
  `customer_name` varchar(45) DEFAULT NULL,
  `customer_mobile` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `sales_details`
--

/*!40000 ALTER TABLE `sales_details` DISABLE KEYS */;
INSERT INTO `sales_details` (`id`,`product_name`,`product_code`,`qty`,`unit_price`,`total_price`,`category`,`sales_date`,`customer_name`,`customer_mobile`) VALUES 
 (4,'Nokia','nokia1100',2,1500,'3000','','23-11-2017','Rahim','54656546');
/*!40000 ALTER TABLE `sales_details` ENABLE KEYS */;


--
-- Definition of table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `mobile` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `user_type` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `user`
--

/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` (`id`,`name`,`email`,`mobile`,`username`,`password`,`user_type`) VALUES 
 (1,'Parvez','parvez@gmail.com','54878','parvez','parvez','admin');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
