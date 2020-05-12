-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2020 at 07:59 AM
-- Server version: 5.0.45-community-nt
-- PHP Version: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `gaji_karyawan`
--

-- --------------------------------------------------------

--
-- Table structure for table `gaji`
--

CREATE TABLE `gaji` (
  `id_karyawan` varchar(9) NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `jam_lembur` int(11) NOT NULL,
  `tunjangan` int(11) NOT NULL,
  `pajak` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` varchar(9) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `nomor_hp` varchar(15) NOT NULL,
  `posisi` varchar(30) NOT NULL,
  `gaji_pokok` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama`, `alamat`, `nomor_hp`, `posisi`, `gaji_pokok`) VALUES
('1114', 'dimas', 'babarsari', '02993892', 'Surveyor', 5000000);

-- --------------------------------------------------------

--
-- Table structure for table `pegawai`
--

CREATE TABLE `pegawai` (
  `id_karyawan` varchar(9) NOT NULL,
  `nama` varchar(200) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `nomor_hp` varchar(15) NOT NULL,
  `posisi` varchar(30) NOT NULL,
  `gaji_pokok` int(11) NOT NULL,
  `jam_lembur` int(11) NOT NULL,
  `pajak` int(11) NOT NULL,
  `tunjangan` int(11) NOT NULL,
  `total` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pegawai`
--

INSERT INTO `pegawai` (`id_karyawan`, `nama`, `alamat`, `nomor_hp`, `posisi`, `gaji_pokok`, `jam_lembur`, `pajak`, `tunjangan`, `total`) VALUES
('1111', 'Chella', 'godean', '081298777287', 'Programmer', 9000000, 10, 90000, 150000, 9060000),
('1112', 'ada', 'aaaa', '123131', 'Programmer', 5000000, 4, 50000, 60000, 5010000),
('1113', 'dilla', 'seturan', '0819283883', 'Marketing', 6000000, 12, 60000, 180000, 6120000),
('1114', 'fadil', 'dsdas', '02993892', 'Surveyor', 5000000, 12, 50000, 180000, 5130000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `gaji`
--
ALTER TABLE `gaji`
  ADD KEY `id_karyawan` (`id_karyawan`);

--
-- Indexes for table `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `gaji`
--
ALTER TABLE `gaji`
  ADD CONSTRAINT `gaji_ibfk_1` FOREIGN KEY (`id_karyawan`) REFERENCES `karyawan` (`id_karyawan`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
