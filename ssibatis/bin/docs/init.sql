/*
MySQL Data Transfer
Source Host: localhost
Source Database: ssibatis
Target Host: localhost
Target Database: ssibatis
Date: 2013/8/26 21:53:40
*/

SET FOREIGN_KEY_CHECKS=0;
-- ----------------------------
-- Table structure for content
-- ----------------------------
CREATE TABLE `content` (
  `id` int(11) NOT NULL auto_increment,
  `title` varchar(64) collate utf8_unicode_ci NOT NULL,
  `url` varchar(64) collate utf8_unicode_ci default NULL,
  `email` varchar(32) collate utf8_unicode_ci default NULL,
  `content` text collate utf8_unicode_ci NOT NULL,
  `date` date NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records 
-- ----------------------------
INSERT INTO `content` VALUES ('1', ' Apache Http Server学习笔记', 'http://www.163.com/', '66429174@qq.com', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('2', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('3', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('4', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('5', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('6', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('7', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('8', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('9', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('10', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('11', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('12', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('13', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('14', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('15', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('16', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('17', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('18', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('19', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('20', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('21', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('22', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('23', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('24', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('25', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('26', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('27', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('28', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('29', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('30', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('31', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('32', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('33', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('34', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('35', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('36', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 1111111', '2013-08-26');
INSERT INTO `content` VALUES ('37', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('38', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('39', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('40', ' Apache Http Server学习笔记', '66429174@qq.com', 'http://www.163.com/', ' Apache Http Server学习笔记 内容', '2013-08-26');
INSERT INTO `content` VALUES ('41', ' Apache Http Server学习笔记1', '6642917411@qq.com', 'http://www.163.com/11', ' Apache Http Server学习笔记 内容111111', '2013-08-27');

