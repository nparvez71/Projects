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
-- Create schema pms
--

CREATE DATABASE IF NOT EXISTS pms;
USE pms;

--
-- Definition of table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `hibernate_sequence`
--

/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_val`) VALUES 
 (4),
 (4),
 (4),
 (4),
 (4);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;


--
-- Definition of table `p_category`
--

DROP TABLE IF EXISTS `p_category`;
CREATE TABLE `p_category` (
  `id` int(11) NOT NULL,
  `c_name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `p_category`
--

/*!40000 ALTER TABLE `p_category` DISABLE KEYS */;
INSERT INTO `p_category` (`id`,`c_name`,`note`) VALUES 
 (1,'Mobile','abc');
/*!40000 ALTER TABLE `p_category` ENABLE KEYS */;


--
-- Definition of table `p_purchase`
--

DROP TABLE IF EXISTS `p_purchase`;
CREATE TABLE `p_purchase` (
  `id` int(11) NOT NULL,
  `note` varchar(255) DEFAULT NULL,
  `p_code` varchar(255) DEFAULT NULL,
  `p_name` varchar(255) DEFAULT NULL,
  `purchase_date` date DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `t_price` double DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `category_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpywhnubhfqhnbbqioor9ti1tx` (`category_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `p_purchase`
--

/*!40000 ALTER TABLE `p_purchase` DISABLE KEYS */;
INSERT INTO `p_purchase` (`id`,`note`,`p_code`,`p_name`,`purchase_date`,`qty`,`t_price`,`unit_price`,`category_id`) VALUES 
 (2,'good','2020','Htc','2018-04-08',3,45000,15000,1);
/*!40000 ALTER TABLE `p_purchase` ENABLE KEYS */;


--
-- Definition of table `p_sales`
--

DROP TABLE IF EXISTS `p_sales`;
CREATE TABLE `p_sales` (
  `id` int(11) NOT NULL,
  `customer_mobile` varchar(255) DEFAULT NULL,
  `customer_name` varchar(255) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `sales_date` date DEFAULT NULL,
  `total_price` double DEFAULT NULL,
  `unit_price` double DEFAULT NULL,
  `product_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK7o6983rx5qen86b3lpis7hdc9` (`product_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `p_sales`
--

/*!40000 ALTER TABLE `p_sales` DISABLE KEYS */;
/*!40000 ALTER TABLE `p_sales` ENABLE KEYS */;


--
-- Definition of table `p_summary`
--

DROP TABLE IF EXISTS `p_summary`;
CREATE TABLE `p_summary` (
  `id` int(11) NOT NULL,
  `avilable_qty` int(11) DEFAULT NULL,
  `product_code` varchar(255) DEFAULT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `purchase_qty` int(11) DEFAULT NULL,
  `sold_qty` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `p_summary`
--

/*!40000 ALTER TABLE `p_summary` DISABLE KEYS */;
INSERT INTO `p_summary` (`id`,`avilable_qty`,`product_code`,`product_name`,`purchase_qty`,`sold_qty`) VALUES 
 (3,3,'2020','Htc',3,0);
/*!40000 ALTER TABLE `p_summary` ENABLE KEYS */;


--
-- Definition of table `p_user`
--

DROP TABLE IF EXISTS `p_user`;
CREATE TABLE `p_user` (
  `id` int(11) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `mobile` varchar(255) DEFAULT NULL,
  `p_name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `user_type` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `p_user`
--

/*!40000 ALTER TABLE `p_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `p_user` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
