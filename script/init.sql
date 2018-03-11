/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : db_financial_manage

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2018-03-11 20:03:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_consum_records  个人消费记录
-- ----------------------------
DROP TABLE IF EXISTS `t_consum_records`;
CREATE TABLE `t_consum_records` (
  `id` int(11) NOT NULL AUTO_INCREMENT, /*主键*/
  `consum_time` timestamp DEFAULT NULL, /*消费时间*/
  `consum_money` int(11) DEFAULT NULL, /*消费金额*/
  `consum_type` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL, /*消费类型*/
  `trade_method` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,  /*消费方法  例:支付宝,现金，微信*/
  `detail` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, /*消费详情*/
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_consum_records
-- ----------------------------

-- ----------------------------
-- Table structure for t_expend   个人支出
-- ----------------------------
DROP TABLE IF EXISTS `t_expend`;
CREATE TABLE `t_expend` (
  `id` int(11) NOT NULL AUTO_INCREMENT, /*主键*/
  `expend_time` timestamp DEFAULT NULL, /* 支出时间*/
  `money` decimal(10,2) DEFAULT NULL,  /* 支出金额*/
  `detail` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL, /* 支出详细*/
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_expend
-- ----------------------------

-- ----------------------------
-- Table structure for t_income  个人收入
-- ----------------------------
DROP TABLE IF EXISTS `t_income`;
CREATE TABLE `t_income` (
  `id` int(11) NOT NULL AUTO_INCREMENT, /*主键*/
  `source` varchar(40) COLLATE utf8_unicode_ci DEFAULT NULL, /*收入来源 例：工资，投资，奖金*/
  `income_time` timestamp DEFAULT NULL, /*收入时间*/
  `money` decimal(10,2) NOT NULL,  /*收入金额*/
  `detail` varchar(200) COLLATE utf8_unicode_ci DEFAULT NULL, /*收入详情*/
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_income
-- ----------------------------

-- ----------------------------
-- Table structure for t_user   用户
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,  /*主键*/
  `username` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,  /*账号*/
  `password` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,  /*密码*/
  `register_time` timestamp DEFAULT NULL, /*注册时间*/
  `email` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL, /*个人邮箱 可通过这个来找回密码*/
  `consum_records_id` int(11) DEFAULT NULL, /*关联个人消费表*/
  `expend_id` int(11) DEFAULT NULL, /*关联个人支出表*/
  `income_id` int(11) DEFAULT NULL, /*关联个人收入表*/
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Records of t_user
-- ----------------------------
