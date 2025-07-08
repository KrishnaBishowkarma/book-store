CREATE DATABASE  IF NOT EXISTS `book_store`;
USE `book_store`;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `isbn` varchar(45) DEFAULT NULL,
  `publish_date` DATETIME DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;

--
-- Data for table `employee`
--

INSERT INTO `book` VALUES
	(1,'Atomic Habits','James Clear','9781847941831', '2018-12-30'),
	(2, 'The Psychology of Money', 'Morgan Hausel', '978-93-90166-26-8', '2021-01-12'),
	('3', 'The Art of War', 'Sun Tzu', '978-81-95275-82-3', '2021-01-12');

