-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: bncc
-- ------------------------------------------------------
-- Server version	5.7.16-log

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
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `admin` (
  `ID` int(11) NOT NULL,
  `PassWord` varchar(45) NOT NULL,
  `Rank` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `Remarks` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `exam`
--

DROP TABLE IF EXISTS `exam`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `exam` (
  `ExamID` int(11) NOT NULL AUTO_INCREMENT,
  `PSID` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `UID` varchar(45) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `PhoneNo` varchar(45) NOT NULL,
  `Year` varchar(45) DEFAULT NULL,
  `Attendence` varchar(45) DEFAULT NULL,
  `Written` varchar(45) DEFAULT NULL,
  `Weight` varchar(45) DEFAULT NULL,
  `Height` varchar(45) DEFAULT NULL,
  `Chest` varchar(45) DEFAULT NULL,
  `BMI` varchar(45) DEFAULT NULL,
  `KnockKnee` varchar(45) DEFAULT NULL,
  `Eye` varchar(45) DEFAULT NULL,
  `BloodGroup` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  `Remarks` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`ExamID`,`PSID`),
  UNIQUE KEY `PSID_UNIQUE` (`PSID`),
  KEY `fk_exam_primaryselection1_idx` (`PSID`),
  CONSTRAINT `fk_exam_primaryselection1` FOREIGN KEY (`PSID`) REFERENCES `primaryselection` (`PSID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `exam`
--

LOCK TABLES `exam` WRITE;
/*!40000 ALTER TABLE `exam` DISABLE KEYS */;
INSERT INTO `exam` VALUES (53,8,'fdgdfg','fsdgvbdb','Department of Tourism & Hospitality Management','Male','653453','2017','true',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(54,9,'dWDASDFASDFD','5654','Department of Innovation & Entrepreneurship','Male','546','2017','true',NULL,'50','60','32-34','Normal','Positive','6/6','AB+','Selected','You are good.'),(55,10,'jkhhghfghdghd','5636','Department of Tourism & Hospitality Management','Male','54546645','2017','true',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(56,12,'jhjgfj','djdhjdghj','Department of Business Studies','Female','4563456','2017','true',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(57,13,'7895895959','769869','Department of Business Studies','Female','789789789','2017','false',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL),(58,25,'bxfgb','xfb','xfbx','bxb','xbgfg','2017','false',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `exam` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `finalselection`
--

DROP TABLE IF EXISTS `finalselection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `finalselection` (
  `ProvesionalID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `ExamID` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `UID` varchar(45) NOT NULL,
  `Department` varchar(45) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `PhoneNo` varchar(45) NOT NULL,
  `Year` varchar(45) NOT NULL,
  `Status` varchar(45) NOT NULL,
  PRIMARY KEY (`ProvesionalID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `finalselection`
--

LOCK TABLES `finalselection` WRITE;
/*!40000 ALTER TABLE `finalselection` DISABLE KEYS */;
INSERT INTO `finalselection` VALUES (1,54,'dWDASDFASDFD','5654','Department of Innovation & Entrepreneurship','Male','546','2017','Selected');
/*!40000 ALTER TABLE `finalselection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `primaryrejection`
--

DROP TABLE IF EXISTS `primaryrejection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `primaryrejection` (
  `PSID` int(11) NOT NULL AUTO_INCREMENT,
  `RegistrationID` int(11) NOT NULL,
  `FormNo` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `UID` varchar(45) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `PhoneNoPersonal` varchar(45) NOT NULL,
  `PhoneNoParents` varchar(45) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Year` varchar(45) NOT NULL,
  PRIMARY KEY (`PSID`,`RegistrationID`),
  KEY `fk_primaryselection_registration_idx` (`RegistrationID`),
  CONSTRAINT `fk_primaryselection_registration0` FOREIGN KEY (`RegistrationID`) REFERENCES `registration` (`RegistrationID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `primaryrejection`
--

LOCK TABLES `primaryrejection` WRITE;
/*!40000 ALTER TABLE `primaryrejection` DISABLE KEYS */;
INSERT INTO `primaryrejection` VALUES (4,11,1002,'ghghvbcv','365356','Department of Business Studies','Female','35435463','45345','543453','2017'),(5,12,1013,'fdgdfgfd','522325','Department of Real Estate','Male','5353','54354354','453453','2017'),(7,14,1015,'gfhfghfgh','fghfghfghfg','Department of Real Estate','Male','90870970','80890890','8080','2017'),(11,18,1019,'fghfghg','553265353','Department of Business Studies','Female','6536536','5636536653','563653653','2017');
/*!40000 ALTER TABLE `primaryrejection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `primaryselection`
--

DROP TABLE IF EXISTS `primaryselection`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `primaryselection` (
  `PSID` int(11) NOT NULL AUTO_INCREMENT,
  `RegistrationID` int(11) NOT NULL,
  `FormNo` int(11) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `UID` varchar(45) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `PhoneNoPersonal` varchar(45) NOT NULL,
  `PhoneNoParents` varchar(45) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Year` varchar(45) NOT NULL,
  PRIMARY KEY (`PSID`,`RegistrationID`),
  KEY `fk_primaryselection_registration_idx` (`RegistrationID`),
  CONSTRAINT `fk_primaryselection_registration` FOREIGN KEY (`RegistrationID`) REFERENCES `registration` (`RegistrationID`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=26 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `primaryselection`
--

LOCK TABLES `primaryselection` WRITE;
/*!40000 ALTER TABLE `primaryselection` DISABLE KEYS */;
INSERT INTO `primaryselection` VALUES (2,9,1000,'Mehedi Hasan Hemel','1244656515','Department of Computer Science and Engineering','Male','01916961199','01719761925','hjsahdhsd','2018'),(3,10,1001,';lkjhgfds','mjnhbn','Department of Real Estate','Female','5252','82852','rthrthrth','2018'),(6,13,1022,'dfdgfg','635653','Department of Tourism & Hospitality Management','Female','535','5353','fhjnfhjhfj','2015'),(8,15,1016,'fdgdfg','fsdgvbdb','Department of Tourism & Hospitality Management','Male','653453','8786989','fgnhgnxgn','2017'),(9,16,1017,'dWDASDFASDFD','5654','Department of Innovation & Entrepreneurship','Male','546','346356','fgbfbfgb','2017'),(10,17,1018,'jkhhghfghdghd','5636','Department of Tourism & Hospitality Management','Male','54546645','456546456666','fghfhfghhhhhhh','2017'),(12,19,1020,'jhjgfj','djdhjdghj','Department of Business Studies','Female','4563456','46456','46456456','2017'),(13,20,1021,'7895895959','769869','Department of Business Studies','Female','789789789','897689797','57957895789','2017'),(17,25,1031,'Zobaer','hkkfgk','gfjhf','dfjhfgj','fgjhgh','dfsg','dsfgsd','fg'),(18,45,4566,'78','6678','678','678','678','678676','8','678'),(25,25,54656,'bxfgb','xfb','xfbx','bxb','xbgfg','xgfbg','xgfb','2017');
/*!40000 ALTER TABLE `primaryselection` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registration`
--

DROP TABLE IF EXISTS `registration`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `registration` (
  `RegistrationID` int(11) NOT NULL AUTO_INCREMENT,
  `FormNo` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `UID` varchar(45) NOT NULL,
  `Department` varchar(100) NOT NULL,
  `Gender` varchar(45) NOT NULL,
  `PhoneNoPersonal` varchar(45) NOT NULL,
  `PhoneNoParents` varchar(45) NOT NULL,
  `EmailAddress` varchar(100) NOT NULL,
  `Year` varchar(45) NOT NULL,
  `Photo` varchar(45) DEFAULT NULL,
  `IDCardCopy` varchar(45) DEFAULT NULL,
  `RegistrationFee` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`RegistrationID`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registration`
--

LOCK TABLES `registration` WRITE;
/*!40000 ALTER TABLE `registration` DISABLE KEYS */;
INSERT INTO `registration` VALUES (9,'1000','Mehedi Hasan Hemel','1244656515','Department of Computer Science and Engineering','Male','01916961199','01719761925','hjsahdhsd','2018','','OK','OK'),(10,'1001',';lkjhgfds','mjnhbn','Department of Real Estate','Female','5252','82852','rthrthrth','2018','OK','OK','OK'),(11,'1002','ghghvbcv','365356','Department of Business Studies','Female','35435463','45345','543453','2017','OK','OK',''),(12,'1013','fdgdfgfd','522325','Department of Real Estate','Male','5353','54354354','453453','2017','OK','OK',''),(13,'1022','dfdgfg','635653','Department of Tourism & Hospitality Management','Female','535','5353','fhjnfhjhfj','2015','','OK','OK'),(14,'1015','gfhfghfgh','fghfghfghfg','Department of Real Estate','Male','90870970','80890890','8080','2017','OK','OK',''),(15,'1016','fdgdfg','fsdgvbdb','Department of Tourism & Hospitality Management','Male','653453','8786989','fgnhgnxgn','2017','','','OK'),(16,'1017','dWDASDFASDFD','5654','Department of Innovation & Entrepreneurship','Male','546','346356','fgbfbfgb','2017','','OK',''),(17,'1018','jkhhghfghdghd','5636','Department of Tourism & Hospitality Management','Male','54546645','456546456666','fghfhfghhhhhhh','2017','','OK',''),(18,'1019','fghfghg','553265353','Department of Business Studies','Female','6536536','5636536653','563653653','2017','','','OK'),(19,'1020','jhjgfj','djdhjdghj','Department of Business Studies','Female','4563456','46456','46456456','2017','OK','',''),(20,'1021','7895895959','769869','Department of Business Studies','Female','789789789','897689797','57957895789','2017','','OK',''),(21,'1022','fshhsffghgsff','hgshsfhs','Department of Real Estate','Female','6576575667','5757345','547567764','2017','','OK',''),(22,'1024','vfdgdf fghfh fghfgh','65353653','Department of Real Estate','Female','5636536535','56365365','6536536536535','2017','OK','OK','OK'),(23,'1030','Rahad Mahmud Imran','10864','Department of Software Engineering','Male','01916464455','01916464455','rahad@bncc.edu','2017','OK','OK','OK'),(25,'1031','Zobaer','hkkfgk','gfjhf','dfjhfgj','fgjhgh','dfsg','dsfgsd','fg','sdfg','sg','fg'),(45,'4566','78','6678','678','678','678','678676','8','678','678','6786','78');
/*!40000 ALTER TABLE `registration` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userreg`
--

DROP TABLE IF EXISTS `userreg`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `userreg` (
  `Rank` varchar(45) NOT NULL,
  `Name` varchar(45) NOT NULL,
  `CadetID` int(11) NOT NULL,
  `Password` varchar(45) NOT NULL,
  `PhoneNo` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  PRIMARY KEY (`CadetID`,`Password`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userreg`
--

LOCK TABLES `userreg` WRITE;
/*!40000 ALTER TABLE `userreg` DISABLE KEYS */;
INSERT INTO `userreg` VALUES ('CPL','Mehedi Hasan Hemel',18134407,'jannat','01916961199','mehedihasan_hemel@hotmail.com');
/*!40000 ALTER TABLE `userreg` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `CadetID` int(11) NOT NULL,
  `Password` varchar(45) NOT NULL,
  PRIMARY KEY (`CadetID`,`Password`),
  KEY `fk_users_userReg1_idx` (`CadetID`,`Password`),
  CONSTRAINT `fk_users_userReg1` FOREIGN KEY (`CadetID`, `Password`) REFERENCES `userreg` (`CadetID`, `Password`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES (18134407,'jannat');
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-04-13 15:06:50
