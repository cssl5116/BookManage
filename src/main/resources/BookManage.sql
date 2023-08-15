/*
 Navicat Premium Data Transfer

 Source Server         : docker_mysql
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : localhost:3306
 Source Schema         : team

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 15/08/2023 09:03:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

USE team;
-- ----------------------------
-- Table structure for BookManage
-- ----------------------------
DROP TABLE IF EXISTS `BookManage`;
CREATE TABLE `BookManage` (
  `b_Id` int(11) NOT NULL AUTO_INCREMENT,
  `b_name` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `b_author` varchar(40) COLLATE utf8_unicode_ci NOT NULL,
  `b_time` datetime NOT NULL,
  `b_type` int(11) NOT NULL COMMENT '选择所属分类:\n0、计算机/软件\n1、小说/文摘\n2、杂项',
  PRIMARY KEY (`b_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of BookManage
-- ----------------------------
BEGIN;
INSERT INTO `BookManage` (`b_Id`, `b_name`, `b_author`, `b_time`, `b_type`) VALUES (1, '金庸全集', '金庸', '2013-02-11 00:00:00', 1);
INSERT INTO `BookManage` (`b_Id`, `b_name`, `b_author`, `b_time`, `b_type`) VALUES (2, 'Java手册', '成风', '2012-12-12 00:00:00', 0);
INSERT INTO `BookManage` (`b_Id`, `b_name`, `b_author`, `b_time`, `b_type`) VALUES (3, '盗墓笔记', '南派三叔', '2017-10-12 00:00:00', 1);
INSERT INTO `BookManage` (`b_Id`, `b_name`, `b_author`, `b_time`, `b_type`) VALUES (4, '摄影那些事', '摄影天地', '2011-01-12 00:00:00', 2);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
