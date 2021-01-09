/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50638
Source Host           : localhost:3306
Source Database       : db_food

Target Server Type    : MYSQL
Target Server Version : 50638
File Encoding         : 65001

Date: 2019-03-19 14:21:31
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `goodsName` varchar(100) DEFAULT NULL,
  `price` float DEFAULT NULL,
  `goodsDesc` varchar(200) DEFAULT NULL,
  `imageLink` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('1', '碳烤鸡肉寿司', '23.1', '鸡肉、生菜、海苔、寿司', 'F:\\myProject\\OrderMeal\\src\\images\\ss1.png');
INSERT INTO `goods` VALUES ('2', '北海道寿司', '13.2', '鱼、甜辣酱、海苔、米饭', 'F:\\myProject\\OrderMeal\\src\\images\\ss2.png');
INSERT INTO `goods` VALUES ('3', '鳗鱼爆浆寿司', '43.2', '鱼、甜辣酱、海苔、米饭', 'F:\\myProject\\OrderMeal\\src\\images\\ss4.png');

-- ----------------------------
-- Table structure for order_goods
-- ----------------------------
DROP TABLE IF EXISTS `order_goods`;
CREATE TABLE `order_goods` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `orderId` varchar(50) DEFAULT NULL,
  `goodsTotalPrice` float DEFAULT NULL,
  `goodsId` int(10) DEFAULT NULL,
  `goodsPrice` float DEFAULT NULL,
  `goodsNum` int(10) DEFAULT NULL,
  `goodsName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_order_goods_2` (`orderId`),
  KEY `FK_order_goods_1` (`goodsId`)
) ENGINE=InnoDB AUTO_INCREMENT=46 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_goods
-- ----------------------------
INSERT INTO `order_goods` VALUES ('44', '20190319141543', '43.2', '3', '43.2', '1', '鳗鱼爆浆寿司');
INSERT INTO `order_goods` VALUES ('45', '20190319141543', '13.2', '2', '13.2', '1', '北海道寿司');

-- ----------------------------
-- Table structure for order_info
-- ----------------------------
DROP TABLE IF EXISTS `order_info`;
CREATE TABLE `order_info` (
  `orderId` varchar(50) NOT NULL,
  `orderStatus` int(10) DEFAULT NULL,
  `orderNum` int(10) DEFAULT NULL,
  `orderTotalMoney` float DEFAULT NULL,
  `userName` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`orderId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of order_info
-- ----------------------------
INSERT INTO `order_info` VALUES ('20190319141543', '3', '2', '56.4', 'llc');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `userName` varchar(100) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `email` varchar(200) DEFAULT NULL,
  `rank` int(1) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', '123', null, '1');
INSERT INTO `user` VALUES ('8', 'aaa', '123', 'ad@1.com', '0');
INSERT INTO `user` VALUES ('9', 'admin1', '123', null, '0');
INSERT INTO `user` VALUES ('10', 'llc', '123', '572398041@qq.com', '0');
