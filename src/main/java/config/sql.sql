--  databases: mybatisTest
--      by zhenma 2016-11-05  
--
DROP DATABASE IF EXISTS `mybatisTest`; 
CREATE DATABASE mybatisTest;

USE mybatisTest;

--  
-- tbl_msg_info  
-- 
DROP TABLE IF EXISTS `tbl_msg_info`;  
CREATE TABLE `tbl_msg_info` (  
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `phone` varchar(4) NOT NULL,
  `name` varchar(64) NOT NULL,
  `msg` varchar(512),
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)  
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

