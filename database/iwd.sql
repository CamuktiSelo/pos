/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50621
Source Host           : localhost:3306
Source Database       : iwd

Target Server Type    : MYSQL
Target Server Version : 50621
File Encoding         : 65001

Date: 2019-04-25 08:27:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `tbl_gaji`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_gaji`;
CREATE TABLE `tbl_gaji` (
  `nip` varchar(10) NOT NULL,
  `nm_karyawan` varchar(50) NOT NULL,
  `jb_karyawan` varchar(20) NOT NULL,
  `gapok` int(10) NOT NULL,
  `transport` int(10) NOT NULL,
  `gaber` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_gaji
-- ----------------------------
INSERT INTO `tbl_gaji` VALUES ('13917139', 'ARDY', 'MANAGER', '7750000', '775000', '8525000');
INSERT INTO `tbl_gaji` VALUES ('13917140', 'RADY', 'SUPERVISOR', '5750000', '575000', '6325000');
INSERT INTO `tbl_gaji` VALUES ('13917141', 'RDAY', 'TEKNISI', '2750000', '275000', '3025000');

-- ----------------------------
-- Table structure for `tbl_kategori`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_kategori`;
CREATE TABLE `tbl_kategori` (
  `kd_kategori` char(8) NOT NULL,
  `nm_kategori` varchar(50) NOT NULL,
  PRIMARY KEY (`kd_kategori`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_kategori
-- ----------------------------
INSERT INTO `tbl_kategori` VALUES ('00001', 'MAKANAN');
INSERT INTO `tbl_kategori` VALUES ('00002', 'MINUMAN');
INSERT INTO `tbl_kategori` VALUES ('00003', 'ALAT TULIS KANTOR');

-- ----------------------------
-- Table structure for `tbl_produk`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_produk`;
CREATE TABLE `tbl_produk` (
  `kd_produk` char(11) NOT NULL,
  `kd_kategori` char(11) NOT NULL,
  `nm_produk` varchar(255) NOT NULL,
  `hrg_beli` int(11) NOT NULL,
  `hrg_jual` int(11) NOT NULL,
  `stok` int(11) NOT NULL,
  `satuan` varchar(255) NOT NULL,
  PRIMARY KEY (`kd_produk`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_produk
-- ----------------------------
INSERT INTO `tbl_produk` VALUES ('888', '000', 'BENG BENG CAIR', '1500', '5500', '100', 'PCS');
INSERT INTO `tbl_produk` VALUES ('999', '0001', 'BENG BENG', '1000', '2000', '100', 'PCS');

-- ----------------------------
-- Table structure for `tbl_transaksi`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_transaksi`;
CREATE TABLE `tbl_transaksi` (
  `no_jual` char(255) NOT NULL,
  `nm_produk` varchar(255) NOT NULL,
  `hrg_jual` int(11) NOT NULL,
  `qty` int(11) NOT NULL,
  `total` int(11) NOT NULL,
  `bayar` int(11) NOT NULL,
  `kembali` int(11) NOT NULL,
  PRIMARY KEY (`no_jual`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Records of tbl_transaksi
-- ----------------------------
INSERT INTO `tbl_transaksi` VALUES ('222', '999', '2000', '5', '21000', '25000', '-21000');
INSERT INTO `tbl_transaksi` VALUES ('222222', '999', '2000', '2', '15000', '20000', '15000');
INSERT INTO `tbl_transaksi` VALUES ('444', '999', '2000', '3', '28000', '30000', '-28000');
INSERT INTO `tbl_transaksi` VALUES ('4444', '999', '2000', '6', '40500', '30000', '40500');
INSERT INTO `tbl_transaksi` VALUES ('null', 'null', '0', '0', '31500', '0', '-31500');
