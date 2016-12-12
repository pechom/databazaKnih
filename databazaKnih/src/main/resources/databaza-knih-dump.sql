-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: databaza-knih
-- ------------------------------------------------------
-- Server version	5.7.15-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `author`
--

DROP TABLE IF EXISTS `author`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `author` (
  `idauthor` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `birth` int(11) DEFAULT '0',
  `death` int(11) DEFAULT '0',
  `nationality` char(3) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `biography` varchar(500) DEFAULT NULL,
  `verificationStatus` bit(1) DEFAULT b'0',
  `lifeStatus` bit(1) DEFAULT b'0',
  `isActive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`idauthor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `author`
--

LOCK TABLES `author` WRITE;
/*!40000 ALTER TABLE `author` DISABLE KEYS */;
/*!40000 ALTER TABLE `author` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authorofbook`
--

DROP TABLE IF EXISTS `authorofbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorofbook` (
  `book_idbook` int(11) NOT NULL,
  `author_idauthor` int(11) NOT NULL,
  PRIMARY KEY (`book_idbook`,`author_idauthor`),
  KEY `fk_authorofbook_author1_idx` (`author_idauthor`),
  CONSTRAINT `fk_authorofbook_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_authorofbook_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorofbook`
--

LOCK TABLES `authorofbook` WRITE;
/*!40000 ALTER TABLE `authorofbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `authorofbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authorreview`
--

DROP TABLE IF EXISTS `authorreview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorreview` (
  `idauthorreview` int(11) NOT NULL AUTO_INCREMENT,
  `rating` int(1) DEFAULT '0',
  `review` varchar(500) DEFAULT NULL,
  `isActive` bit(1) DEFAULT b'0',
  `author_idauthor` int(11) NOT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idauthorreview`,`author_idauthor`,`user_iduser`),
  KEY `fk_authorreview_author1_idx` (`author_idauthor`),
  KEY `fk_authorreview_user1_idx` (`user_iduser`),
  CONSTRAINT `fk_authorreview_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_authorreview_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorreview`
--

LOCK TABLES `authorreview` WRITE;
/*!40000 ALTER TABLE `authorreview` DISABLE KEYS */;
/*!40000 ALTER TABLE `authorreview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `book`
--

DROP TABLE IF EXISTS `book`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `book` (
  `idbook` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `year` int(11) DEFAULT '0',
  `numberOfPages` int(11) DEFAULT '0',
  `ISBN` int(11) DEFAULT '0',
  `description` varchar(500) DEFAULT NULL,
  `numberOfReviews` int(11) DEFAULT NULL,
  `averageOfReviews` float DEFAULT '0',
  `verificationStatus` bit(1) DEFAULT b'0',
  `numberInChart` int(11) DEFAULT NULL,
  `bayesianAverage` float DEFAULT '0',
  `isActive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`idbook`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `book`
--

LOCK TABLES `book` WRITE;
/*!40000 ALTER TABLE `book` DISABLE KEYS */;
/*!40000 ALTER TABLE `book` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `booknote`
--

DROP TABLE IF EXISTS `booknote`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `booknote` (
  `user_iduser` int(11) NOT NULL,
  `booknote_idbook` int(11) NOT NULL,
  `note` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`user_iduser`,`booknote_idbook`),
  KEY `fk_user_has_book_book2_idx` (`booknote_idbook`),
  KEY `fk_user_has_book_user2_idx` (`user_iduser`),
  CONSTRAINT `fk_user_has_book_book2` FOREIGN KEY (`booknote_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_user_has_book_user2` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `booknote`
--

LOCK TABLES `booknote` WRITE;
/*!40000 ALTER TABLE `booknote` DISABLE KEYS */;
/*!40000 ALTER TABLE `booknote` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookreview`
--

DROP TABLE IF EXISTS `bookreview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookreview` (
  `idbookreview` int(11) NOT NULL AUTO_INCREMENT,
  `rating` int(1) DEFAULT '0',
  `review` varchar(450) DEFAULT NULL,
  `isActive` bit(1) DEFAULT b'0',
  `user_iduser` int(11) NOT NULL,
  `book_idbook` int(11) NOT NULL,
  PRIMARY KEY (`idbookreview`,`user_iduser`,`book_idbook`),
  KEY `fk_bookreview_user1_idx` (`user_iduser`),
  KEY `fk_bookreview_book1_idx` (`book_idbook`),
  CONSTRAINT `fk_bookreview_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_bookreview_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookreview`
--

LOCK TABLES `bookreview` WRITE;
/*!40000 ALTER TABLE `bookreview` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookreview` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favoriteauthor`
--

DROP TABLE IF EXISTS `favoriteauthor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favoriteauthor` (
  `user_iduser` int(11) NOT NULL,
  `favoriteauthor_idauthor` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`favoriteauthor_idauthor`),
  KEY `fk_table1_author1_idx` (`favoriteauthor_idauthor`),
  CONSTRAINT `fk_table1_author1` FOREIGN KEY (`favoriteauthor_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_table1_user5` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favoriteauthor`
--

LOCK TABLES `favoriteauthor` WRITE;
/*!40000 ALTER TABLE `favoriteauthor` DISABLE KEYS */;
/*!40000 ALTER TABLE `favoriteauthor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favoritebook`
--

DROP TABLE IF EXISTS `favoritebook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favoritebook` (
  `user_iduser` int(11) NOT NULL,
  `favoritebook_idbook` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`favoritebook_idbook`),
  KEY `fk_table1_book1_idx` (`favoritebook_idbook`),
  CONSTRAINT `fk_table1_book1` FOREIGN KEY (`favoritebook_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_table1_user3` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favoritebook`
--

LOCK TABLES `favoritebook` WRITE;
/*!40000 ALTER TABLE `favoritebook` DISABLE KEYS */;
/*!40000 ALTER TABLE `favoritebook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `favoriteuser`
--

DROP TABLE IF EXISTS `favoriteuser`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `favoriteuser` (
  `user_iduser` int(11) NOT NULL,
  `favoriteuser` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`favoriteuser`),
  KEY `fk_favoriteuserofuser_user1_idx` (`favoriteuser`),
  CONSTRAINT `fk_favoriteuserofuser_user1` FOREIGN KEY (`favoriteuser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_table1_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `favoriteuser`
--

LOCK TABLES `favoriteuser` WRITE;
/*!40000 ALTER TABLE `favoriteuser` DISABLE KEYS */;
/*!40000 ALTER TABLE `favoriteuser` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `friend`
--

DROP TABLE IF EXISTS `friend`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `friend` (
  `user_iduser` int(11) NOT NULL,
  `friend` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`friend`),
  KEY `fk_friendofuser_user2_idx` (`friend`),
  CONSTRAINT `fk_friendofuser_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_friendofuser_user2` FOREIGN KEY (`friend`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `friend`
--

LOCK TABLES `friend` WRITE;
/*!40000 ALTER TABLE `friend` DISABLE KEYS */;
/*!40000 ALTER TABLE `friend` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genre` (
  `idgenre` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `isActive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`idgenre`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genre`
--

LOCK TABLES `genre` WRITE;
/*!40000 ALTER TABLE `genre` DISABLE KEYS */;
/*!40000 ALTER TABLE `genre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genreofauthor`
--

DROP TABLE IF EXISTS `genreofauthor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genreofauthor` (
  `genre_idgenre` int(11) NOT NULL,
  `author_idauthor` int(11) NOT NULL,
  PRIMARY KEY (`genre_idgenre`,`author_idauthor`),
  KEY `fk_author_has_genre_genre1_idx` (`genre_idgenre`),
  KEY `fk_genreofauthor_author1_idx` (`author_idauthor`),
  CONSTRAINT `fk_author_has_genre_genre1` FOREIGN KEY (`genre_idgenre`) REFERENCES `genre` (`idgenre`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_genreofauthor_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genreofauthor`
--

LOCK TABLES `genreofauthor` WRITE;
/*!40000 ALTER TABLE `genreofauthor` DISABLE KEYS */;
/*!40000 ALTER TABLE `genreofauthor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `genreofbook`
--

DROP TABLE IF EXISTS `genreofbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genreofbook` (
  `book_idbook` int(11) NOT NULL,
  `genre_idgenre` int(11) NOT NULL,
  PRIMARY KEY (`book_idbook`,`genre_idgenre`),
  KEY `fk_book_has_genre_genre1_idx` (`genre_idgenre`),
  KEY `fk_book_has_genre_book1_idx` (`book_idbook`),
  CONSTRAINT `fk_book_has_genre_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_book_has_genre_genre1` FOREIGN KEY (`genre_idgenre`) REFERENCES `genre` (`idgenre`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `genreofbook`
--

LOCK TABLES `genreofbook` WRITE;
/*!40000 ALTER TABLE `genreofbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `genreofbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `readbook`
--

DROP TABLE IF EXISTS `readbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `readbook` (
  `user_iduser` int(11) NOT NULL,
  `readbook_idbook` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`readbook_idbook`),
  KEY `fk_readbookofuser_book1_idx` (`readbook_idbook`),
  CONSTRAINT `fk_readbookofuser_book1` FOREIGN KEY (`readbook_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_table1_user2` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `readbook`
--

LOCK TABLES `readbook` WRITE;
/*!40000 ALTER TABLE `readbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `readbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `readingbook`
--

DROP TABLE IF EXISTS `readingbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `readingbook` (
  `user_iduser` int(11) NOT NULL,
  `readingbook_idbook` int(11) NOT NULL,
  `numberOfPages` int(4) DEFAULT '0',
  PRIMARY KEY (`user_iduser`,`readingbook_idbook`),
  KEY `fk_user_has_book_book1_idx` (`readingbook_idbook`),
  KEY `fk_user_has_book_user1_idx` (`user_iduser`),
  CONSTRAINT `fk_user_has_book_book1` FOREIGN KEY (`readingbook_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_user_has_book_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `readingbook`
--

LOCK TABLES `readingbook` WRITE;
/*!40000 ALTER TABLE `readingbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `readingbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `request`
--

DROP TABLE IF EXISTS `request`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `request` (
  `idrequest` int(11) NOT NULL AUTO_INCREMENT,
  `content` varchar(200) DEFAULT NULL,
  `isActive` bit(1) DEFAULT b'0',
  `user_iduser` int(11) DEFAULT NULL,
  `book_idbook` int(11) DEFAULT NULL,
  `author_idauthor` int(11) DEFAULT NULL,
  PRIMARY KEY (`idrequest`),
  UNIQUE KEY `user_iduser_UNIQUE` (`user_iduser`),
  UNIQUE KEY `book_idbook_UNIQUE` (`book_idbook`),
  UNIQUE KEY `author_idauthor_UNIQUE` (`author_idauthor`),
  KEY `fk_request_user1_idx` (`user_iduser`),
  KEY `fk_request_book1_idx` (`book_idbook`),
  KEY `fk_request_author1_idx` (`author_idauthor`),
  CONSTRAINT `fk_request_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_request_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_request_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `request`
--

LOCK TABLES `request` WRITE;
/*!40000 ALTER TABLE `request` DISABLE KEYS */;
/*!40000 ALTER TABLE `request` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tag`
--

DROP TABLE IF EXISTS `tag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tag` (
  `idtag` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `isActive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`idtag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tag`
--

LOCK TABLES `tag` WRITE;
/*!40000 ALTER TABLE `tag` DISABLE KEYS */;
/*!40000 ALTER TABLE `tag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tagofbook`
--

DROP TABLE IF EXISTS `tagofbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tagofbook` (
  `tag_idtag` int(11) NOT NULL,
  `book_idbook` int(11) NOT NULL,
  PRIMARY KEY (`tag_idtag`,`book_idbook`),
  KEY `fk_book_has_tag_tag1_idx` (`tag_idtag`),
  KEY `fk_tagofbook_book1_idx` (`book_idbook`),
  CONSTRAINT `fk_book_has_tag_tag1` FOREIGN KEY (`tag_idtag`) REFERENCES `tag` (`idtag`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_tagofbook_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tagofbook`
--

LOCK TABLES `tagofbook` WRITE;
/*!40000 ALTER TABLE `tagofbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `tagofbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `iduser` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(45) DEFAULT NULL,
  `passwordHash` varchar(90) DEFAULT NULL,
  `mail` varchar(45) DEFAULT NULL,
  `name` varchar(45) DEFAULT NULL,
  `surname` varchar(45) DEFAULT NULL,
  `lastLogin` datetime DEFAULT NULL,
  `salt` varchar(45) DEFAULT NULL,
  `isAdmin` bit(1) DEFAULT b'0',
  `isActive` bit(1) DEFAULT b'0',
  PRIMARY KEY (`iduser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `wantedbook`
--

DROP TABLE IF EXISTS `wantedbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `wantedbook` (
  `user_iduser` int(11) NOT NULL,
  `wantedbook_idbook` int(11) NOT NULL,
  PRIMARY KEY (`user_iduser`,`wantedbook_idbook`),
  KEY `fk_table1_book2_idx` (`wantedbook_idbook`),
  CONSTRAINT `fk_table1_book2` FOREIGN KEY (`wantedbook_idbook`) REFERENCES `book` (`idbook`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_table1_user4` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `wantedbook`
--

LOCK TABLES `wantedbook` WRITE;
/*!40000 ALTER TABLE `wantedbook` DISABLE KEYS */;
/*!40000 ALTER TABLE `wantedbook` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'databaza-knih'
--

--
-- Dumping routines for database 'databaza-knih'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2016-12-12 20:36:43
