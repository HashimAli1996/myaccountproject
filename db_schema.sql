CREATE DATABASE  IF NOT EXISTS`accountdb`;
USE `accountdb`;

--
-- Table structure for table "accounts"
--

DROP TABLE IF EXISTS `accounts`;

CREATE TABLE `accounts` (
  `acc_id` int(11) NOT NULL AUTO_INCREMENT,
  `forename` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `account_number` int(11) NOT NULL,
  PRIMARY KEY (`acc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

