-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: congnghephanmem
-- ------------------------------------------------------
-- Server version	8.0.22

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `buoihoptable`
--

DROP TABLE IF EXISTS `buoihoptable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `buoihoptable` (
  `id` varchar(30) NOT NULL,
  `chude` varchar(200) DEFAULT NULL,
  `thoigian` date DEFAULT NULL,
  `diadiem` varchar(50) DEFAULT NULL,
  `soluong` int DEFAULT NULL,
  `trangthai` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `buoihoptable`
--

LOCK TABLES `buoihoptable` WRITE;
/*!40000 ALTER TABLE `buoihoptable` DISABLE KEYS */;
INSERT INTO `buoihoptable` VALUES ('BH1','Ngày thế giới phòng chống AIDS','2020-12-01','Nhà Văn Hóa',9,'Đã diễn ra'),('BH2','Ngày Pháp Luật Việt Nam','2020-11-09','Nhà Văn Hóa',8,'Đã diễn ra'),('BH3','Ngày Hội quốc phòng toàn dân','2020-12-22','Nhà Văn Hóa',3,'Đang diễn ra'),('BH4','Ngày Thành Lập Quân Đội Nhân Dân Việt Nam','2020-12-22','Nhà Văn Hóa',3,'Đang diễn ra'),('BH5','Chiến dịch Áo ấm cho em - Thắp lửa vùng cao','2020-12-27','Nhà Văn Hóa',0,'Chưa diễn ra'),('BH6','Chào năm mới 2021!','2021-01-01','Nhà Văn Hóa',0,'Đã diễn ra');
/*!40000 ALTER TABLE `buoihoptable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diemdanhtable`
--

DROP TABLE IF EXISTS `diemdanhtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diemdanhtable` (
  `id` int NOT NULL AUTO_INCREMENT,
  `sohokhau` varchar(45) NOT NULL,
  `idbuoihop` varchar(45) NOT NULL,
  `trangthai` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=183 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diemdanhtable`
--

LOCK TABLES `diemdanhtable` WRITE;
/*!40000 ALTER TABLE `diemdanhtable` DISABLE KEYS */;
INSERT INTO `diemdanhtable` VALUES (123,'HK01','BH3','Không tham gia'),(124,'HK02','BH3','Không tham gia'),(125,'HK03','BH3','Không tham gia'),(126,'HK04','BH3','Không tham gia'),(127,'HK05','BH3','Không tham gia'),(128,'HK06','BH3','Tham gia'),(129,'HK07','BH3','Tham gia'),(130,'HK08','BH3','Tham gia'),(131,'HK09','BH3','Không tham gia'),(132,'HK10','BH3','Không tham gia'),(133,'HK01','BH4','Tham gia'),(134,'HK02','BH4','Tham gia'),(135,'HK03','BH4','Tham gia'),(136,'HK04','BH4','Không tham gia'),(137,'HK05','BH4','Không tham gia'),(138,'HK06','BH4','Không tham gia'),(139,'HK07','BH4','Không tham gia'),(140,'HK08','BH4','Không tham gia'),(141,'HK09','BH4','Không tham gia'),(142,'HK10','BH4','Không tham gia'),(143,'HK01','BH5','Không tham gia'),(144,'HK02','BH5','Không tham gia'),(145,'HK03','BH5','Không tham gia'),(146,'HK04','BH5','Không tham gia'),(147,'HK05','BH5','Không tham gia'),(148,'HK06','BH5','Không tham gia'),(149,'HK07','BH5','Không tham gia'),(150,'HK08','BH5','Không tham gia'),(151,'HK09','BH5','Không tham gia'),(152,'HK10','BH5','Không tham gia'),(163,'HK01','BH5','Không tham gia'),(164,'HK02','BH5','Không tham gia'),(165,'HK03','BH5','Không tham gia'),(166,'HK04','BH5','Không tham gia'),(167,'HK05','BH5','Không tham gia'),(168,'HK06','BH5','Không tham gia'),(169,'HK07','BH5','Không tham gia'),(170,'HK08','BH5','Không tham gia'),(171,'HK09','BH5','Không tham gia'),(172,'HK10','BH5','Không tham gia'),(173,'HK01','BH6','Không tham gia'),(174,'HK02','BH6','Không tham gia'),(175,'HK03','BH6','Không tham gia'),(176,'HK04','BH6','Không tham gia'),(177,'HK05','BH6','Không tham gia'),(178,'HK06','BH6','Không tham gia'),(179,'HK07','BH6','Không tham gia'),(180,'HK08','BH6','Không tham gia'),(181,'HK09','BH6','Không tham gia'),(182,'HK10','BH6','Không tham gia');
/*!40000 ALTER TABLE `diemdanhtable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hokhautable`
--

DROP TABLE IF EXISTS `hokhautable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hokhautable` (
  `idhokhau` int NOT NULL AUTO_INCREMENT,
  `sohokhau` varchar(10) NOT NULL,
  `tenchuho` varchar(50) DEFAULT NULL,
  `makhuvuc` varchar(45) DEFAULT NULL,
  `diachi` varchar(50) DEFAULT NULL,
  `ngaytao` date DEFAULT NULL,
  `ngaychuyendi` date DEFAULT NULL,
  `lydochuyen` varchar(100) DEFAULT NULL,
  `nguoithuchien` varchar(45) DEFAULT NULL,
  `ghichu` varchar(45) DEFAULT NULL,
  `diem` int DEFAULT NULL,
  PRIMARY KEY (`idhokhau`),
  UNIQUE KEY `sohokhau_UNIQUE` (`sohokhau`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hokhautable`
--

LOCK TABLES `hokhautable` WRITE;
/*!40000 ALTER TABLE `hokhautable` DISABLE KEYS */;
INSERT INTO `hokhautable` VALUES (1,'HK01','Trần Anh Nguyên','HN003','25 phố Nghĩa Đô, quận Cầu Giấy, Hà Nội','2000-03-12','2002-03-12','Làm ăn','Phùng Văn Minh','',16),(2,'HK02','Nguyễn Mạnh Cường','HN003','139 phố Nghĩa Đô, quận Cầu Giấy, Hà Nội','2003-07-20','2005-07-20','Công tác','Nguyễn Cẩm Tú','',13),(3,'HK03','Lê Đình Lâm','HN003','27 đường Lê Văn Lương. quận Thanh Xuân, Hà Nội','1999-04-03','2000-03-02','Gia Đình','Đào Thị Thúy',NULL,11),(4,'HK04','Trần Bình Thọ','HN002','123 đường Giải Phóng, quận Thanh Xuân, Hà Nội','2001-03-11','2004-12-03','Làm Ăn','Lê Thị Tuyết',NULL,2),(5,'HK05','Vương Đình Trí','HN001','24 đường Trần Khát Chân, Quận Thanh Xuân, Hà Nội','2002-03-05','2006-10-03','Công Tác','Trần Thị Vy',NULL,1),(6,'HK06','Phùng Văn Minh','HN','Số 12 Phố Phương Liệt','2015-08-07',NULL,NULL,NULL,NULL,24),(7,'HK07','Trần Đức Thọ ','HN','Số 47 Phố Kim Đồng','2017-07-21',NULL,NULL,NULL,NULL,19),(8,'HK08','Trần Đức Thắng','HN','Số 15 Đội Cấn','2018-06-12',NULL,NULL,NULL,NULL,21),(9,'HK09','Phạm Anh Tú','HN','Số 46 Trần Đại Nghĩa','2017-09-23',NULL,NULL,NULL,NULL,17),(10,'HK10','Nguyễn Ngọc Sơn','HN','Số 56 Trương Định','2016-03-05',NULL,NULL,NULL,NULL,17);
/*!40000 ALTER TABLE `hokhautable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhankhautable`
--

DROP TABLE IF EXISTS `nhankhautable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhankhautable` (
  `idnhankhau` int NOT NULL AUTO_INCREMENT,
  `sohokhau` varchar(10) NOT NULL,
  `madinhdanh` varchar(10) NOT NULL,
  `hoten` varchar(50) DEFAULT NULL,
  `bidanh` varchar(45) DEFAULT NULL,
  `ngaysinh` date DEFAULT NULL,
  `noisinh` varchar(45) DEFAULT NULL,
  `diachihientai` varchar(45) DEFAULT NULL,
  `gioitinh` varchar(10) DEFAULT NULL,
  `nguyenquan` varchar(45) DEFAULT NULL,
  `dantoc` varchar(45) DEFAULT NULL,
  `nghenghiep` varchar(50) DEFAULT NULL,
  `noilamviec` varchar(45) DEFAULT NULL,
  `socmnd` varchar(45) DEFAULT NULL,
  `ngaycapcmnd` date DEFAULT NULL,
  `noicapcmnd` varchar(45) DEFAULT NULL,
  `ghichu` varchar(100) DEFAULT NULL,
  `ngaydkthuongtru` date DEFAULT NULL,
  `noithuongtrutruoc` varchar(45) DEFAULT NULL,
  `quanhechuho` varchar(45) DEFAULT NULL,
  `trangthai` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idnhankhau`),
  UNIQUE KEY `sohokhau_nhankhau` (`sohokhau`,`madinhdanh`),
  KEY `madinhdanh` (`madinhdanh`),
  CONSTRAINT `sohokhau_nhankhau` FOREIGN KEY (`sohokhau`) REFERENCES `hokhautable` (`sohokhau`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=71 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhankhautable`
--

LOCK TABLES `nhankhautable` WRITE;
/*!40000 ALTER TABLE `nhankhautable` DISABLE KEYS */;
INSERT INTO `nhankhautable` VALUES (1,'HK01','NK0001','Trần Anh Nguyên','','1985-03-12','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Kinh Doanh','Hà Nội','002300001234','2000-11-12','Hà Nội','','2000-03-12','','Chủ hộ','Thường trú'),(2,'HK01','NK0002','Lê Thị Cúc','','1993-09-10','Bắc Ninh','Hà Nội','Nữ','Quảng Ninh','Kinh','Nội Trợ','Hà Nội','001200004821','2002-12-09','Bắc Ninh','','2000-09-11','','Vợ','Thường trú'),(5,'HK01','NK0003','Trần Thị Hồng',NULL,'2000-05-12','Hà Nội','Hà Nội','Nữ','Hà Nội','Kinh','Sinh Viên','Bách khoa','001400009221','2015-04-05','Hà Nội','','2004-03-02','','Con','Thường trú'),(21,'HK06','NK0021','Phùng Văn Minh',NULL,'1992-03-16','Vĩnh Phúc','Số 12 Phố Phương Liệt','Nam','Vĩnh Phúc','Kinh','Kỹ Sư','Oracle','211992031621','2010-05-05','CA tỉnh Vĩnh Phúc',NULL,'2015-08-07','Số 9 Tạ Quang Bửu','Chủ hộ',NULL),(22,'HK06','NK0022','Bùi Thị Thu Trang',NULL,'1994-09-08','Vĩnh Phúc','Số 12 Phố Phương Liệt','Nữ','Vĩnh Phúc','Kinh','Trưởng Phòng','Deloitte','221994090822','2012-07-06','CA tỉnh Vĩnh Phúc',NULL,'2015-08-07','Số 9 Tạ Quang Bửu','Vợ',NULL),(23,'HK06','NK0023','Phùng Thu Thủy',NULL,'2014-02-14','Hà Nội','Số 12 Phố Phương Liệt','Nữ','Vĩnh Phúc','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2015-08-07','Số 9 Tạ Quang Bửu','Con',NULL),(24,'HK06','NK0024','Phùng Tuấn Kiệt',NULL,'2015-03-12','Hà Nội','Số 12 Phố Phương Liệt','Nam','Vĩnh Phúc','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2015-08-07','Số 9 Tạ Quang Bửu','Con',NULL),(25,'HK07','NK0025','Trần Đức Thọ',NULL,'1993-06-05','Thái Bình','Số 47 Phố Kim Đồng','Nam','Thái Bình','Kinh','Kiểm Toán','BigC','251993060525','2011-03-04','CA tỉnh Thái Bình',NULL,'2017-07-21','Số 15 Nguyễn Hiền','Chủ hộ',NULL),(26,'HK07','NK0026','Phạm Thu Hương',NULL,'1995-04-04','Yên Bái','Số 47 Phố Kim Đồng','Nữ','Yên Bái','Kinh','Nhân Viên','FPT','261995040426','2013-05-12','CA tỉnh Yên Bái',NULL,'2017-07-21','Số 15 Nguyễn Hiền','Vợ',NULL),(27,'HK07','NK0027','Trần Đức Thiện',NULL,'2015-04-23','Hà Nội','Số 47 Phố Kim Đồng','Nam','Thái Bình','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2017-07-21','Số 15 Nguyễn Hiền','Con',NULL),(28,'HK07','NK0028','Trần Thùy Linh',NULL,'2017-01-26','Hà Nội','Số 47 Phố Kim Đồng','Nữ','Thái Bình','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2017-07-21','Số 15 Nguyễn Hiền','Con',NULL),(29,'HK08','NK0029','Trần Đức Thắng',NULL,'1990-10-11','Yên Bái','Số 15 Đội Cấn','Nam','Yên Bái','Kinh','Phi Công','VietNamAirlines','291990101129','2008-07-24','CA tỉnh Yên Bái',NULL,'2018-06-12','Số 206 Bạch Mai','Chủ hộ',NULL),(30,'HK08','NK0030','Nguyễn Thu Hà',NULL,'1993-02-15','Sơn La','Số 15 Đội Cấn','Nữ','Sơn La','Kinh','Giáo Viên','THPT Tạ Quang Bửu','301993021530','2011-09-14','CA tỉnh Sơn La',NULL,'2018-06-12','Số 206 Bạch Mai','Vợ ',NULL),(31,'HK08','NK0031','Trần Thanh Thúy',NULL,'2014-03-02','Hà Nội','Số 15 Đội Cấn','Nữ','Yên Bái','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2018-06-12','Số 206 Bạch Mai','Con',NULL),(32,'HK08','NK0032','Trần Thu Trang',NULL,'2016-05-12','Hà Nội','Số 15 Đội Cấn','Nữ','Yên Bái','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2018-06-12','Số 206 Bạch Mai','Con',NULL),(33,'HK09','NK0033','Phạm Anh Tú',NULL,'1989-09-17','Phú Thọ','Số 46 Trần Đại Nghĩa','Nam','Phú Thọ','Kinh','Giảng Viên','ĐH BKHN','331989091733','2007-05-02','CA tỉnh Phú Thọ',NULL,'2017-09-23','Số 103 Đại Cồ Việt','Chủ hộ',NULL),(34,'HK09','NK0034','Bùi Mai Anh',NULL,'1991-08-23','Vĩnh Phúc','Số 46 Trần Đại Nghĩa','Nữ','Vĩnh Phúc','Kinh','Giảng Viên','ĐH KTQD','341991082334','2009-11-12','CA tỉnh Vĩnh Phúc',NULL,'2017-09-23','Số 103 Đại Cồ Việt','Vợ',NULL),(35,'HK09','NK0035','Phạm Tuấn Sơn',NULL,'2013-02-03','Hà Nội','Số 46 Trần Đại Nghĩa','Nam','Phú Thọ','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2017-09-23','Số 103 Đại Cồ Việt','Con',NULL),(36,'HK09','NK0036','Phạm Lê Na',NULL,'2015-05-02','Hà Nội','Số 46 Trần Đại Nghĩa','Nam','Phú Thọ','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2017-09-23','Số 103 Đại Cồ Việt','Con',NULL),(37,'HK10','NK0037','Nguyễn Ngọc Sơn',NULL,'1993-09-08','Nam Định','Số 56 Trương Định','Nam','Nam Định ','Kinh','Cán Bộ','Bộ Giáo Dục','371993090837','2011-10-16','CA tỉnh Nam Định',NULL,'2016-03-05','Số 34 Lĩnh Nam','Chủ hộ',NULL),(38,'HK10','NK0038','Trần Thu Dương',NULL,'1993-02-16','Nghệ An','Số 56 Trương Định','Nữ','Nghệ An','Kinh','Kế Toán','VinGroup','381993021638','2011-04-18','CA tỉnh Nghệ An',NULL,'2016-03-05','Số 34 Lĩnh Nam','Vợ',NULL),(39,'HK10','NK0039','Nguyễn Ngọc Dung',NULL,'2013-04-25','Hà Nội','Số 56 Trương Định','Nữ','Nam Định ','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2016-03-05','Số 34 Lĩnh Nam','Con',NULL),(40,'HK10','NK0040','Nguyễn Ngọc Giang',NULL,'2015-05-23','Hà Nội','Số 56 Trương Định','Nữ','Nam Định','Kinh',NULL,NULL,NULL,NULL,NULL,NULL,'2016-03-05','Số 34 Lĩnh Nam','Con',NULL),(54,'HK01','NK0004','Trần Quang Anh',NULL,'2002-11-09','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Học Sinh','Cầu giấy','001500009284','2017-06-08','Hà Nội',NULL,'2006-02-12',NULL,'Con','Thường trú'),(55,'HK02','NK0005','Nguyễn Mạnh Cường',NULL,'1982-09-09','Quảng Nam','Hà Nội','Nam','Quảng Nam','Kinh','Coder','Hà Nội','003400001235','1993-03-09','Quảng Nam',NULL,'2003-02-03',NULL,'Chủ hộ','Thường trú'),(56,'HK02','NK0006','Phạm Thị Mĩ Hạnh',NULL,'1990-03-04','Thanh Hóa','Hà Nội','Nữ','Thanh Hóa','Kinh','Kế toán','SHB Giang Văn Minh','001200003948','2000-12-11','Thanh Hóa',NULL,'2005-03-02',NULL,'Vợ','Thường trú'),(57,'HK02','NK0007','Phạm Thị Kiều Linh',NULL,'1995-04-12','Hà Nội','Hà Nội','Nữ','Hà Nội','Kinh','Phụ Tá','Techcombank','001400009283','2003-12-05','Hà Nội',NULL,'2007-12-11',NULL,'Con','Thường trú'),(58,'HK02','NK0008','Nguyễn Quang Vinh',NULL,'2000-05-01','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Sinh Viên','Ngoại Thương','001300001923','2010-03-06','Hà Nội',NULL,'2005-09-09',NULL,'Con','Thường trú'),(59,'HK03','NK0009','Lê Đình Lâm',NULL,'1996-03-01','Quảng Trị','Hà Nội','Nam','Quảng Trị','Kinh','Sửa xe máy','Cầy Giấy','001400009283','2009-12-03','Hà Nội',NULL,'2014-12-12',NULL,'Chủ hộ','Thường trú'),(60,'HK03','NK0010','Lê Thị Yến',NULL,'2000-03-05','Hà Nội','Hà Nội','Nữ','Hà Nội','Kinh','Kế toán','Viettel','009800020345','2012-03-08','Hà Nội',NULL,'2018-04-02',NULL,'Vợ','Thường trú'),(61,'HK03','NK0011','Lê Đình Hải',NULL,'2003-09-01','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Học sinh','Nghĩa Đô','008322220993','2018-03-01','Hà Nội',NULL,'2020-01-01',NULL,'Con','Thường trú'),(62,'HK03','NK0012','Lê Thị Huệ',NULL,'2005-02-04','Hà Nội','Hà Nội','Nữ','Hà Nội','Kinh','Học Sinh','Nghĩa Đô','003400001912','2018-12-12','Hà Nội',NULL,'2020-01-03',NULL,'Con','Thường trú'),(63,'HK04','NK0013','Trần Bình Thọ',NULL,'1970-03-02','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Về Hưu','Bạch Mai','009783110022','1990-10-11','Hà Nội',NULL,'2000-10-12',NULL,'Chủ hộ','Thường trú'),(64,'HK04','NK0014','Nguyễn Thị Thúy',NULL,'1980-12-10','Bình Định','Hà Nội','Nữ','Bình Định','Kinh','Bán Hàng','Cầu Giấy','003400001929','1995-12-03','Hà Nội',NULL,'2003-12-04',NULL,'Vợ','Thường trú'),(65,'HK04','NK0015','Trần Đinh Hà',NULL,'1985-10-02','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','CEO','Ngân hàng nhà nước','0019000019234','1999-10-10','Hà Nội',NULL,'2005-12-09',NULL,'Con','Thường trú'),(66,'HK04','NK0016','Trần Bình Hà',NULL,'1988-12-12','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Chủ tịch','Viettinbank','001930009898','1993-12-03','Hà Nội',NULL,'2007-01-02',NULL,'Con','Thường trú'),(67,'HK05','NK0017','Vương Đình Trí',NULL,'1990-11-03','Quảng Bình','Hà Nội','Nam','Quảng Bình','Kinh','Bán buôn','Chợ Nghĩa Đô','001200003948','1999-02-03','Hà Nội',NULL,'2005-03-07',NULL,'Chủ hộ','Thường trú'),(68,'HK05','NK0018','Lê Thanh Ngân ',NULL,'1995-10-02','Hà Nội','Hà Nội','Nữ','Hà Nội','Kinh','Nhân Viên','Vincom','001300001983','2000-01-05','Hà Nội',NULL,'2008-12-10',NULL,'Vợ','Thường trú'),(69,'HK05','NK0019','Lê Đình Nam',NULL,'2000-12-01','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Sinh Viên','KTQD','001930002841','2009-10-03','Hà Nội',NULL,'2014-12-04',NULL,'Con','Thường trú'),(70,'HK05','NK0020','Vương Quân Long',NULL,'2001-11-03','Hà Nội','Hà Nội','Nam','Hà Nội','Kinh','Sinh Viên','Xây dựng','0109290000','2010-02-10','Hà Nội',NULL,'2016-10-09',NULL,'Con','Thường trú');
/*!40000 ALTER TABLE `nhankhautable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `taikhoantable`
--

DROP TABLE IF EXISTS `taikhoantable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `taikhoantable` (
  `id` varchar(10) NOT NULL,
  `taikhoan` varchar(50) DEFAULT NULL,
  `matkhau` varchar(10) DEFAULT NULL,
  `chucvu` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `taikhoantable`
--

LOCK TABLES `taikhoantable` WRITE;
/*!40000 ALTER TABLE `taikhoantable` DISABLE KEYS */;
INSERT INTO `taikhoantable` VALUES ('1','vu','123','truongphong');
/*!40000 ALTER TABLE `taikhoantable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tamtrutable`
--

DROP TABLE IF EXISTS `tamtrutable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tamtrutable` (
  `idtamtru` int NOT NULL AUTO_INCREMENT,
  `magiaytamtru` varchar(10) DEFAULT NULL,
  `madinhdanh` varchar(10) DEFAULT NULL,
  `sodienthoai` varchar(20) DEFAULT NULL,
  `tungay` date DEFAULT NULL,
  `denngay` date DEFAULT NULL,
  `lydo` varchar(100) DEFAULT NULL,
  `tinhtrang` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`idtamtru`),
  UNIQUE KEY `magiaytamtru_UNIQUE` (`magiaytamtru`),
  UNIQUE KEY `madinhdanh_UNIQUE` (`madinhdanh`),
  CONSTRAINT `madinhdanh_tamtru` FOREIGN KEY (`madinhdanh`) REFERENCES `nhankhautable` (`madinhdanh`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tamtrutable`
--

LOCK TABLES `tamtrutable` WRITE;
/*!40000 ALTER TABLE `tamtrutable` DISABLE KEYS */;
/*!40000 ALTER TABLE `tamtrutable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tamvangtable`
--

DROP TABLE IF EXISTS `tamvangtable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tamvangtable` (
  `idtamvang` int NOT NULL AUTO_INCREMENT,
  `magiaytamvang` varchar(10) NOT NULL,
  `madinhdanh` varchar(10) NOT NULL,
  `sohokhau` varchar(10) NOT NULL,
  `noitamtru` varchar(20) DEFAULT NULL,
  `tungay` date DEFAULT NULL,
  `denngay` date DEFAULT NULL,
  `lydo` varchar(100) DEFAULT NULL,
  `tinhtrang` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idtamvang`),
  UNIQUE KEY `magiaytamvang_UNIQUE` (`magiaytamvang`),
  KEY `sohokhau_idx` (`sohokhau`) /*!80000 INVISIBLE */,
  KEY `madinhdanh_idx` (`madinhdanh`),
  CONSTRAINT `madinhdanh` FOREIGN KEY (`madinhdanh`) REFERENCES `nhankhautable` (`madinhdanh`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sohokhau_tamvang` FOREIGN KEY (`sohokhau`) REFERENCES `nhankhautable` (`sohokhau`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tamvangtable`
--

LOCK TABLES `tamvangtable` WRITE;
/*!40000 ALTER TABLE `tamvangtable` DISABLE KEYS */;
/*!40000 ALTER TABLE `tamvangtable` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-22  2:07:07
