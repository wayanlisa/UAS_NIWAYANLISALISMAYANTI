-- phpMyAdmin SQL Dump
-- version 2.9.2
-- http://www.phpmyadmin.net
-- 
-- Host: localhost
-- Generation Time: Jan 19, 2017 at 10:03 PM
-- Server version: 5.0.27
-- PHP Version: 5.2.1
-- 
-- Database: `db_uas_15311086`
-- 

-- --------------------------------------------------------

-- 
-- Table structure for table `tbl_barang`
-- 

CREATE TABLE `tbl_barang` (
  `Id` int(11) NOT NULL auto_increment,
  `Nama` varchar(30) NOT NULL,
  `Jenis` varchar(15) NOT NULL,
  `Jumlah` int(11) NOT NULL,
  PRIMARY KEY  (`Id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 AUTO_INCREMENT=1 ;

-- 
-- Dumping data for table `tbl_barang`
-- 

