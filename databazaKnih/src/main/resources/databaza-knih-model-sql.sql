-- MySQL Workbench Synchronization
-- Generated: 2016-11-18 22:06
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: Peťo Chomič

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `evidencia` ;

CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;

CREATE SCHEMA IF NOT EXISTS `databaza-knih` DEFAULT CHARACTER SET utf8 ;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`author` (
  `idauthor` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `birth` DATE NULL DEFAULT NULL,
  `death` DATE NULL DEFAULT NULL,
  `nationality` CHAR(3) NULL DEFAULT NULL,
  `sex` CHAR(1) NULL DEFAULT NULL,
  `biography` VARCHAR(500) NULL DEFAULT NULL,
  `verificationStatus` BINARY(1) NULL DEFAULT NULL,
  `lifeStatus` BINARY(1) NULL DEFAULT NULL,
  `book_idbook` INT(11) NOT NULL,
  `authorreview_idauthorreview` INT(11) NOT NULL,
  PRIMARY KEY (`idauthor`),
  INDEX `fk_author_book1_idx` (`book_idbook` ASC),
  INDEX `fk_author_authorreview1_idx` (`authorreview_idauthorreview` ASC),
  CONSTRAINT `fk_author_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_author_authorreview1`
    FOREIGN KEY (`authorreview_idauthorreview`)
    REFERENCES `databaza-knih`.`authorreview` (`idauthorreview`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`authorreview` (
  `idauthorreview` INT(11) NOT NULL AUTO_INCREMENT,
  `rating` INT(1) NULL DEFAULT NULL,
  `review` VARCHAR(500) NULL DEFAULT NULL,
  `author_idauthor` INT(11) NOT NULL,
  `user_iduser` INT(11) NOT NULL,
  PRIMARY KEY (`idauthorreview`, `user_iduser`),
  INDEX `fk_authorreview_author1_idx` (`author_idauthor` ASC),
  INDEX `fk_authorreview_user1_idx` (`user_iduser` ASC),
  CONSTRAINT `fk_authorreview_author1`
    FOREIGN KEY (`author_idauthor`)
    REFERENCES `databaza-knih`.`author` (`idauthor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_authorreview_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `databaza-knih`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`book` (
  `idbook` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `year` INT(11) NULL DEFAULT NULL,
  `genres` VARCHAR(150) NULL DEFAULT NULL,
  `numberOfPages` INT(11) NULL DEFAULT NULL,
  `ISBN` INT(11) NULL DEFAULT NULL,
  `description` VARCHAR(500) NULL DEFAULT NULL,
  `numberOfReviews` INT(11) NULL DEFAULT NULL,
  `averageOfReviews` INT(11) NULL DEFAULT NULL,
  `verificationStatus` BINARY(1) NULL DEFAULT NULL,
  `numberInChart` INT(11) NULL DEFAULT NULL,
  `bayesianAverage` INT(11) NULL DEFAULT NULL,
  `author_idauthor` INT(11) NOT NULL,
  `bookreview_idbookreview` INT(11) NOT NULL,
  PRIMARY KEY (`idbook`),
  INDEX `fk_book_author1_idx` (`author_idauthor` ASC),
  INDEX `fk_book_bookreview1_idx` (`bookreview_idbookreview` ASC),
  CONSTRAINT `fk_book_author1`
    FOREIGN KEY (`author_idauthor`)
    REFERENCES `databaza-knih`.`author` (`idauthor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_bookreview1`
    FOREIGN KEY (`bookreview_idbookreview`)
    REFERENCES `databaza-knih`.`bookreview` (`idbookreview`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`bookreview` (
  `idbookreview` INT(11) NOT NULL AUTO_INCREMENT,
  `rating` INT(1) NULL DEFAULT NULL,
  `review` VARCHAR(500) NULL DEFAULT NULL,
  `book_idbook` INT(11) NOT NULL,
  `user_iduser` INT(11) NOT NULL,
  PRIMARY KEY (`idbookreview`),
  INDEX `fk_bookreview_book1_idx` (`book_idbook` ASC),
  INDEX `fk_bookreview_user1_idx` (`user_iduser` ASC),
  CONSTRAINT `fk_bookreview_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_bookreview_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `databaza-knih`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`genre` (
  `idgenre` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idgenre`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`request` (
  `idrequest` INT(11) NOT NULL AUTO_INCREMENT,
  `content` VARCHAR(200) NULL DEFAULT NULL,
  `book_idbook` INT(11) NOT NULL,
  `author_idauthor` INT(11) NOT NULL,
  PRIMARY KEY (`idrequest`, `book_idbook`),
  INDEX `fk_request_book1_idx` (`book_idbook` ASC),
  INDEX `fk_request_author1_idx` (`author_idauthor` ASC),
  CONSTRAINT `fk_request_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_request_author1`
    FOREIGN KEY (`author_idauthor`)
    REFERENCES `databaza-knih`.`author` (`idauthor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`tag` (
  `idtag` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`idtag`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`user` (
  `iduser` INT(11) NOT NULL AUTO_INCREMENT,
  `userName` VARCHAR(45) NULL DEFAULT NULL,
  `passwordHash` VARCHAR(90) NULL DEFAULT NULL,
  `mail` VARCHAR(45) NULL DEFAULT NULL,
  `name` VARCHAR(45) NULL DEFAULT NULL,
  `surname` VARCHAR(45) NULL DEFAULT NULL,
  `lastLogin` DATETIME NULL DEFAULT NULL,
  `salt` VARCHAR(45) NULL DEFAULT NULL,
  `isAdmin` BINARY(1) NULL DEFAULT NULL,
  `frienduser_iduser` INT(11) NOT NULL,
  `favoriteuser_iduse1r` INT(11) NOT NULL,
  `bookreview_idbookreview` INT(11) NOT NULL,
  `authorreview_idauthorreview` INT(11) NOT NULL,
  `readbook_idbook1` INT(11) NOT NULL,
  `favoritebook_idbook` INT(11) NOT NULL,
  `wantedbook_idbook` INT(11) NOT NULL,
  `favoriteauthor_idauthor` INT(11) NOT NULL,
  PRIMARY KEY (`iduser`, `bookreview_idbookreview`),
  INDEX `fk_user_user1_idx` (`frienduser_iduser` ASC),
  INDEX `fk_user_user2_idx` (`favoriteuser_iduse1r` ASC),
  INDEX `fk_user_bookreview1_idx` (`bookreview_idbookreview` ASC),
  INDEX `fk_user_authorreview1_idx` (`authorreview_idauthorreview` ASC),
  INDEX `fk_user_book1_idx` (`readbook_idbook1` ASC),
  INDEX `fk_user_book2_idx` (`favoritebook_idbook` ASC),
  INDEX `fk_user_book3_idx` (`wantedbook_idbook` ASC),
  INDEX `fk_user_author1_idx` (`favoriteauthor_idauthor` ASC),
  CONSTRAINT `fk_user_user1`
    FOREIGN KEY (`frienduser_iduser`)
    REFERENCES `databaza-knih`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_user2`
    FOREIGN KEY (`favoriteuser_iduse1r`)
    REFERENCES `databaza-knih`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_bookreview1`
    FOREIGN KEY (`bookreview_idbookreview`)
    REFERENCES `databaza-knih`.`bookreview` (`idbookreview`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_authorreview1`
    FOREIGN KEY (`authorreview_idauthorreview`)
    REFERENCES `databaza-knih`.`authorreview` (`idauthorreview`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_book1`
    FOREIGN KEY (`readbook_idbook1`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_book2`
    FOREIGN KEY (`favoritebook_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_book3`
    FOREIGN KEY (`wantedbook_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_author1`
    FOREIGN KEY (`favoriteauthor_idauthor`)
    REFERENCES `databaza-knih`.`author` (`idauthor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`tagofbook` (
  `book_idbook` INT(11) NOT NULL,
  `tag_idtag` INT(11) NOT NULL,
  PRIMARY KEY (`book_idbook`, `tag_idtag`),
  INDEX `fk_book_has_tag_tag1_idx` (`tag_idtag` ASC),
  INDEX `fk_book_has_tag_book_idx` (`book_idbook` ASC),
  CONSTRAINT `fk_book_has_tag_book`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_tag_tag1`
    FOREIGN KEY (`tag_idtag`)
    REFERENCES `databaza-knih`.`tag` (`idtag`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`bookoftag` (
  `tag_idtag` INT(11) NOT NULL,
  `book_idbook` INT(11) NOT NULL,
  PRIMARY KEY (`tag_idtag`, `book_idbook`),
  INDEX `fk_tag_has_book_book1_idx` (`book_idbook` ASC),
  INDEX `fk_tag_has_book_tag1_idx` (`tag_idtag` ASC),
  CONSTRAINT `fk_tag_has_book_tag1`
    FOREIGN KEY (`tag_idtag`)
    REFERENCES `databaza-knih`.`tag` (`idtag`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_tag_has_book_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`bookofgenre` (
  `genre_idgenre` INT(11) NOT NULL,
  `book_idbook` INT(11) NOT NULL,
  PRIMARY KEY (`genre_idgenre`, `book_idbook`),
  INDEX `fk_genre_has_book_book1_idx` (`book_idbook` ASC),
  INDEX `fk_genre_has_book_genre1_idx` (`genre_idgenre` ASC),
  CONSTRAINT `fk_genre_has_book_genre1`
    FOREIGN KEY (`genre_idgenre`)
    REFERENCES `databaza-knih`.`genre` (`idgenre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_genre_has_book_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`genreofbook` (
  `book_idbook` INT(11) NOT NULL,
  `genre_idgenre` INT(11) NOT NULL,
  PRIMARY KEY (`book_idbook`, `genre_idgenre`),
  INDEX `fk_book_has_genre_genre1_idx` (`genre_idgenre` ASC),
  INDEX `fk_book_has_genre_book1_idx` (`book_idbook` ASC),
  CONSTRAINT `fk_book_has_genre_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_book_has_genre_genre1`
    FOREIGN KEY (`genre_idgenre`)
    REFERENCES `databaza-knih`.`genre` (`idgenre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`genreofauthor` (
  `author_idauthor` INT(11) NOT NULL,
  `genre_idgenre` INT(11) NOT NULL,
  PRIMARY KEY (`author_idauthor`, `genre_idgenre`),
  INDEX `fk_author_has_genre_genre1_idx` (`genre_idgenre` ASC),
  INDEX `fk_author_has_genre_author1_idx` (`author_idauthor` ASC),
  CONSTRAINT `fk_author_has_genre_author1`
    FOREIGN KEY (`author_idauthor`)
    REFERENCES `databaza-knih`.`author` (`idauthor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_author_has_genre_genre1`
    FOREIGN KEY (`genre_idgenre`)
    REFERENCES `databaza-knih`.`genre` (`idgenre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`authorofgenre` (
  `genre_idgenre` INT(11) NOT NULL,
  `author_idauthor` INT(11) NOT NULL,
  PRIMARY KEY (`genre_idgenre`, `author_idauthor`),
  INDEX `fk_genre_has_author_author1_idx` (`author_idauthor` ASC),
  INDEX `fk_genre_has_author_genre1_idx` (`genre_idgenre` ASC),
  CONSTRAINT `fk_genre_has_author_genre1`
    FOREIGN KEY (`genre_idgenre`)
    REFERENCES `databaza-knih`.`genre` (`idgenre`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_genre_has_author_author1`
    FOREIGN KEY (`author_idauthor`)
    REFERENCES `databaza-knih`.`author` (`idauthor`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`readingbook` (
  `user_iduser` INT(11) NOT NULL,
  `book_idbook` INT(11) NOT NULL,
  `pocetStran` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`user_iduser`, `book_idbook`),
  INDEX `fk_user_has_book_book1_idx` (`book_idbook` ASC),
  INDEX `fk_user_has_book_user1_idx` (`user_iduser` ASC),
  CONSTRAINT `fk_user_has_book_user1`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `databaza-knih`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_book_book1`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

CREATE TABLE IF NOT EXISTS `databaza-knih`.`booknote` (
  `user_iduser` INT(11) NOT NULL,
  `book_idbook` INT(11) NOT NULL,
  `note` VARCHAR(500) NULL DEFAULT NULL,
  PRIMARY KEY (`user_iduser`, `book_idbook`),
  INDEX `fk_user_has_book_book2_idx` (`book_idbook` ASC),
  INDEX `fk_user_has_book_user2_idx` (`user_iduser` ASC),
  CONSTRAINT `fk_user_has_book_user2`
    FOREIGN KEY (`user_iduser`)
    REFERENCES `databaza-knih`.`user` (`iduser`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_user_has_book_book2`
    FOREIGN KEY (`book_idbook`)
    REFERENCES `databaza-knih`.`book` (`idbook`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
