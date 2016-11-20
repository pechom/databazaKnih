CREATE DATABASE  IF NOT EXISTS `databaza-knih` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `databaza-knih`;
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
  `birth` date DEFAULT NULL,
  `death` date DEFAULT NULL,
  `nationality` char(3) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `biography` varchar(500) DEFAULT NULL,
  `verificationStatus` binary(1) DEFAULT NULL,
  `lifeStatus` binary(1) DEFAULT NULL,
  `book_idbook` int(11) NOT NULL,
  `authorreview_idauthorreview` int(11) NOT NULL,
  PRIMARY KEY (`idauthor`),
  KEY `fk_author_book1_idx` (`book_idbook`),
  KEY `fk_author_authorreview1_idx` (`authorreview_idauthorreview`),
  CONSTRAINT `fk_author_authorreview1` FOREIGN KEY (`authorreview_idauthorreview`) REFERENCES `authorreview` (`idauthorreview`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_author_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `authorofgenre`
--

DROP TABLE IF EXISTS `authorofgenre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorofgenre` (
  `genre_idgenre` int(11) NOT NULL,
  `author_idauthor` int(11) NOT NULL,
  PRIMARY KEY (`genre_idgenre`,`author_idauthor`),
  KEY `fk_genre_has_author_author1_idx` (`author_idauthor`),
  KEY `fk_genre_has_author_genre1_idx` (`genre_idgenre`),
  CONSTRAINT `fk_genre_has_author_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_genre_has_author_genre1` FOREIGN KEY (`genre_idgenre`) REFERENCES `genre` (`idgenre`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `authorofgenre`
--

LOCK TABLES `authorofgenre` WRITE;
/*!40000 ALTER TABLE `authorofgenre` DISABLE KEYS */;
/*!40000 ALTER TABLE `authorofgenre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `authorreview`
--

DROP TABLE IF EXISTS `authorreview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `authorreview` (
  `idauthorreview` int(11) NOT NULL AUTO_INCREMENT,
  `rating` int(1) DEFAULT NULL,
  `review` varchar(500) DEFAULT NULL,
  `author_idauthor` int(11) NOT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idauthorreview`,`user_iduser`),
  KEY `fk_authorreview_author1_idx` (`author_idauthor`),
  KEY `fk_authorreview_user1_idx` (`user_iduser`),
  CONSTRAINT `fk_authorreview_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_authorreview_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `year` int(11) DEFAULT NULL,
  `numberOfPages` int(11) DEFAULT NULL,
  `ISBN` int(11) DEFAULT NULL,
  `description` varchar(500) DEFAULT NULL,
  `numberOfReviews` int(11) DEFAULT NULL,
  `averageOfReviews` int(11) DEFAULT NULL,
  `verificationStatus` binary(1) DEFAULT NULL,
  `numberInChart` int(11) DEFAULT NULL,
  `bayesianAverage` int(11) DEFAULT NULL,
  `author_idauthor` int(11) NOT NULL,
  `bookreview_idbookreview` int(11) NOT NULL,
  PRIMARY KEY (`idbook`),
  KEY `fk_book_author1_idx` (`author_idauthor`),
  KEY `fk_book_bookreview1_idx` (`bookreview_idbookreview`),
  CONSTRAINT `fk_book_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_bookreview1` FOREIGN KEY (`bookreview_idbookreview`) REFERENCES `bookreview` (`idbookreview`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `book_idbook` int(11) NOT NULL,
  `note` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`user_iduser`,`book_idbook`),
  KEY `fk_user_has_book_book2_idx` (`book_idbook`),
  KEY `fk_user_has_book_user2_idx` (`user_iduser`),
  CONSTRAINT `fk_user_has_book_book2` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_book_user2` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `bookofgenre`
--

DROP TABLE IF EXISTS `bookofgenre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookofgenre` (
  `genre_idgenre` int(11) NOT NULL,
  `book_idbook` int(11) NOT NULL,
  PRIMARY KEY (`genre_idgenre`,`book_idbook`),
  KEY `fk_genre_has_book_book1_idx` (`book_idbook`),
  KEY `fk_genre_has_book_genre1_idx` (`genre_idgenre`),
  CONSTRAINT `fk_genre_has_book_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_genre_has_book_genre1` FOREIGN KEY (`genre_idgenre`) REFERENCES `genre` (`idgenre`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookofgenre`
--

LOCK TABLES `bookofgenre` WRITE;
/*!40000 ALTER TABLE `bookofgenre` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookofgenre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookoftag`
--

DROP TABLE IF EXISTS `bookoftag`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookoftag` (
  `tag_idtag` int(11) NOT NULL,
  `book_idbook` int(11) NOT NULL,
  PRIMARY KEY (`tag_idtag`,`book_idbook`),
  KEY `fk_tag_has_book_book1_idx` (`book_idbook`),
  KEY `fk_tag_has_book_tag1_idx` (`tag_idtag`),
  CONSTRAINT `fk_tag_has_book_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_tag_has_book_tag1` FOREIGN KEY (`tag_idtag`) REFERENCES `tag` (`idtag`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bookoftag`
--

LOCK TABLES `bookoftag` WRITE;
/*!40000 ALTER TABLE `bookoftag` DISABLE KEYS */;
/*!40000 ALTER TABLE `bookoftag` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `bookreview`
--

DROP TABLE IF EXISTS `bookreview`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bookreview` (
  `idbookreview` int(11) NOT NULL AUTO_INCREMENT,
  `rating` int(1) DEFAULT NULL,
  `review` varchar(500) DEFAULT NULL,
  `book_idbook` int(11) NOT NULL,
  `user_iduser` int(11) NOT NULL,
  PRIMARY KEY (`idbookreview`),
  KEY `fk_bookreview_book1_idx` (`book_idbook`),
  KEY `fk_bookreview_user1_idx` (`user_iduser`),
  CONSTRAINT `fk_bookreview_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_bookreview_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `genre`
--

DROP TABLE IF EXISTS `genre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `genre` (
  `idgenre` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
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
  `author_idauthor` int(11) NOT NULL,
  `genre_idgenre` int(11) NOT NULL,
  PRIMARY KEY (`author_idauthor`,`genre_idgenre`),
  KEY `fk_author_has_genre_genre1_idx` (`genre_idgenre`),
  KEY `fk_author_has_genre_author1_idx` (`author_idauthor`),
  CONSTRAINT `fk_author_has_genre_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_author_has_genre_genre1` FOREIGN KEY (`genre_idgenre`) REFERENCES `genre` (`idgenre`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  CONSTRAINT `fk_book_has_genre_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_genre_genre1` FOREIGN KEY (`genre_idgenre`) REFERENCES `genre` (`idgenre`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
-- Table structure for table `readingbook`
--

DROP TABLE IF EXISTS `readingbook`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `readingbook` (
  `user_iduser` int(11) NOT NULL,
  `book_idbook` int(11) NOT NULL,
  `pocetStran` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_iduser`,`book_idbook`),
  KEY `fk_user_has_book_book1_idx` (`book_idbook`),
  KEY `fk_user_has_book_user1_idx` (`user_iduser`),
  CONSTRAINT `fk_user_has_book_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_book_user1` FOREIGN KEY (`user_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `book_idbook` int(11) NOT NULL,
  `author_idauthor` int(11) NOT NULL,
  PRIMARY KEY (`idrequest`,`book_idbook`),
  KEY `fk_request_book1_idx` (`book_idbook`),
  KEY `fk_request_author1_idx` (`author_idauthor`),
  CONSTRAINT `fk_request_author1` FOREIGN KEY (`author_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_request_book1` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `book_idbook` int(11) NOT NULL,
  `tag_idtag` int(11) NOT NULL,
  PRIMARY KEY (`book_idbook`,`tag_idtag`),
  KEY `fk_book_has_tag_tag1_idx` (`tag_idtag`),
  KEY `fk_book_has_tag_book_idx` (`book_idbook`),
  CONSTRAINT `fk_book_has_tag_book` FOREIGN KEY (`book_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_tag_tag1` FOREIGN KEY (`tag_idtag`) REFERENCES `tag` (`idtag`) ON DELETE NO ACTION ON UPDATE NO ACTION
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
  `isAdmin` binary(1) DEFAULT NULL,
  `frienduser_iduser` int(11) NOT NULL,
  `favoriteuser_iduser` int(11) NOT NULL,
  `bookreview_idbookreview` int(11) NOT NULL,
  `authorreview_idauthorreview` int(11) NOT NULL,
  `readbook_idbook1` int(11) NOT NULL,
  `favoritebook_idbook` int(11) NOT NULL,
  `wantedbook_idbook` int(11) NOT NULL,
  `favoriteauthor_idauthor` int(11) NOT NULL,
  PRIMARY KEY (`iduser`,`bookreview_idbookreview`),
  KEY `fk_user_user1_idx` (`frienduser_iduser`),
  KEY `fk_user_user2_idx` (`favoriteuser_iduser`),
  KEY `fk_user_bookreview1_idx` (`bookreview_idbookreview`),
  KEY `fk_user_authorreview1_idx` (`authorreview_idauthorreview`),
  KEY `fk_user_book1_idx` (`readbook_idbook1`),
  KEY `fk_user_book2_idx` (`favoritebook_idbook`),
  KEY `fk_user_book3_idx` (`wantedbook_idbook`),
  KEY `fk_user_author1_idx` (`favoriteauthor_idauthor`),
  CONSTRAINT `fk_user_author1` FOREIGN KEY (`favoriteauthor_idauthor`) REFERENCES `author` (`idauthor`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_authorreview1` FOREIGN KEY (`authorreview_idauthorreview`) REFERENCES `authorreview` (`idauthorreview`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_book1` FOREIGN KEY (`readbook_idbook1`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_book2` FOREIGN KEY (`favoritebook_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_book3` FOREIGN KEY (`wantedbook_idbook`) REFERENCES `book` (`idbook`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_bookreview1` FOREIGN KEY (`bookreview_idbookreview`) REFERENCES `bookreview` (`idbookreview`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_user1` FOREIGN KEY (`frienduser_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_user2` FOREIGN KEY (`favoriteuser_iduser`) REFERENCES `user` (`iduser`) ON DELETE NO ACTION ON UPDATE NO ACTION
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

-- Dump completed on 2016-11-20 23:02:59
