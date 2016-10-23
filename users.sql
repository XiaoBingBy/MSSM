/*
Navicat MySQL Data Transfer

Source Server         : MySQL
Source Server Version : 50632
Source Host           : localhost:3306
Source Database       : m

Target Server Type    : MYSQL
Target Server Version : 50632
File Encoding         : 65001

Date: 2016-10-24 01:45:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for users
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键(ID)',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `user_pass` varchar(255) NOT NULL COMMENT '密码',
  `user_nicename` varchar(50) NOT NULL COMMENT '昵称',
  `user_email` varchar(50) NOT NULL COMMENT '邮箱',
  `user_registered` datetime NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '注册时间',
  `user_status` int(10) NOT NULL COMMENT '用户状态',
  `user_right` int(10) NOT NULL COMMENT '用户权限',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', 'XiaoBingBy', '123321', 'XiaoBingBy', 'admin@admin.com', '2016-10-22 03:05:46', '1', '1');
