-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 04, 2023 at 03:56 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.0.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `tiket`
--

-- --------------------------------------------------------

--
-- Table structure for table `bus`
--

CREATE TABLE `bus` (
  `NIK` varchar(20) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `kotaAsal` varchar(50) DEFAULT NULL,
  `tujuan` varchar(50) DEFAULT NULL,
  `tanggalBerangkat` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `bus`
--

INSERT INTO `bus` (`NIK`, `nama`, `kotaAsal`, `tujuan`, `tanggalBerangkat`, `harga`) VALUES
('004', 'Joko', 'Tegal', 'Brebes', '2023-01-01', 1000),
('03030001', 'nazwa', 'purwokerto', 'semarang', '2023-01-01', 85000),
('33052238', 'bunga', 'semarang', 'purwokerto', '2023-01-01', 80000),
('33859373', 'Nazwa', 'Semarang', 'Jogjakarta', '2023-02-06', 50000);

-- --------------------------------------------------------

--
-- Table structure for table `kereta`
--

CREATE TABLE `kereta` (
  `NIK` varchar(20) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `kotaAsal` varchar(50) DEFAULT NULL,
  `tujuan` varchar(50) DEFAULT NULL,
  `tanggalBerangkat` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `kereta`
--

INSERT INTO `kereta` (`NIK`, `nama`, `kotaAsal`, `tujuan`, `tanggalBerangkat`, `harga`) VALUES
('003', 'kiki', 'Jogja', 'Pwt', '2023-01-01', 1200),
('090220', 'Dira', 'Bali', 'Makasar', '2023-01-01', 75000),
('3324563', 'Billy', 'Semarang', 'Jogjakarta', '2023-06-01', 45000),
('33567433', 'Fira', 'Jogjakarta', 'Purwokerto', '2023-05-03', 65000),
('4197359', 'skcqc', 'gqie', 'uscgo', '2023-01-01', 689),
('7776348', 'Bunga', 'Jogjakarta', 'Purwokerto', '2023-01-02', 40000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`username`, `password`) VALUES
('Bunga', '111'),
('wawa', '1303');

-- --------------------------------------------------------

--
-- Table structure for table `penumpang`
--

CREATE TABLE `penumpang` (
  `NIK` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kotaAsal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `tanggalBerangkat` date NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `noHp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penumpang`
--

INSERT INTO `penumpang` (`NIK`, `nama`, `kotaAsal`, `tujuan`, `tanggalBerangkat`, `alamat`, `noHp`) VALUES
('001', 'Arsyid', 'Jogja', 'Makassar', '2023-08-01', 'makassar', '08468920'),
('002', 'Arsyad', 'Jogja', 'Makassar', '2023-08-01', 'makassar', '08468920'),
('008', 'Dini', 'Pesawat', 'Pesawat', '2023-01-01', 'lalal', '0202'),
('123456', 'Hasna', 'Jakarta', 'Purwokerto', '2023-01-01', 'Tegal', '0845263784'),
('33324564', 'Fanesa', 'Purwokerto', 'Semarang', '2023-07-08', 'Purwokerto', '0896554364'),
('33456754', 'Aulia', 'Purwokerto', 'Semarang', '2023-05-07', 'Purwokerto', '0896554364'),
('76543321', 'Hasna', 'Jogjakarta', 'Purwokerto', '2023-02-01', 'Tegal', '0845263784');

-- --------------------------------------------------------

--
-- Table structure for table `penumpang_bus`
--

CREATE TABLE `penumpang_bus` (
  `NIK` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kotaAsal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `tanggalBerangkat` date NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `noHp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penumpang_bus`
--

INSERT INTO `penumpang_bus` (`NIK`, `nama`, `kotaAsal`, `tujuan`, `tanggalBerangkat`, `alamat`, `noHp`) VALUES
('004', 'Joko', 'Tegal', 'Brebes', '2023-01-01', 'tegal', '090290'),
('03030001', 'nazwa', 'purwokerto', 'semarang', '2023-01-01', 'desa kretek', '08136826759'),
('33052238', 'bunga', 'semarang', 'purwokerto', '2023-01-01', 'di pandjaitan', '0836418'),
('33859373', 'Nazwa', 'Semarang', 'Jogjakarta', '2023-02-06', 'Kebumen', '0897765334');

-- --------------------------------------------------------

--
-- Table structure for table `penumpang_kereta`
--

CREATE TABLE `penumpang_kereta` (
  `NIK` varchar(20) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kotaAsal` varchar(50) NOT NULL,
  `tujuan` varchar(50) NOT NULL,
  `tanggalBerangkat` date NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `noHp` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `penumpang_kereta`
--

INSERT INTO `penumpang_kereta` (`NIK`, `nama`, `kotaAsal`, `tujuan`, `tanggalBerangkat`, `alamat`, `noHp`) VALUES
('003', 'kiki', 'Jogja', 'Pwt', '2023-01-01', 'kalas', '029200'),
('090220', 'Dira', 'Bali', 'Makasar', '2023-01-01', 'bali', '029092'),
('3324563', 'Billy', 'Semarang', 'Jogjakarta', '2023-06-01', 'Semarang', '087658958'),
('33567433', 'Fira', 'Jogjakarta', 'Purwokerto', '2023-05-03', 'Jogjakarta', '0897654687'),
('4197359', 'skcqc', 'gqie', 'uscgo', '2023-01-01', 'ajqeglice', '097819'),
('7776348', 'Bunga', 'Jogjakarta', 'Purwokerto', '2023-01-02', 'Tegal', '08974638');

-- --------------------------------------------------------

--
-- Table structure for table `pesawat`
--

CREATE TABLE `pesawat` (
  `NIK` varchar(20) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `kotaAsal` varchar(50) DEFAULT NULL,
  `tujuan` varchar(50) DEFAULT NULL,
  `tanggalBerangkat` date DEFAULT NULL,
  `harga` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `pesawat`
--

INSERT INTO `pesawat` (`NIK`, `nama`, `kotaAsal`, `tujuan`, `tanggalBerangkat`, `harga`) VALUES
('001', 'Arsyid', 'Jogja', 'Makassar', '2023-08-01', 750000),
('002', 'Arsyad', 'Jogja', 'Makassar', '2023-08-01', 750000),
('008', 'Dini', 'Pesawat', 'Pesawat', '2023-01-01', 45000),
('123456', 'Hasna', 'Jakarta', 'Purwokerto', '2023-01-01', 80000),
('33324564', 'Fanesa', 'Purwokerto', 'Semarang', '2023-07-08', 80000),
('33456754', 'Aulia', 'Purwokerto', 'Semarang', '2023-05-07', 80000),
('76543321', 'Hasna', 'Jogjakarta', 'Purwokerto', '2023-02-01', 90000);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `bus`
--
ALTER TABLE `bus`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `kereta`
--
ALTER TABLE `kereta`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `penumpang_bus`
--
ALTER TABLE `penumpang_bus`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `penumpang_kereta`
--
ALTER TABLE `penumpang_kereta`
  ADD PRIMARY KEY (`NIK`);

--
-- Indexes for table `pesawat`
--
ALTER TABLE `pesawat`
  ADD PRIMARY KEY (`NIK`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `penumpang`
--
ALTER TABLE `penumpang`
  ADD CONSTRAINT `penumpang_ibfk_1` FOREIGN KEY (`NIK`) REFERENCES `pesawat` (`NIK`);

--
-- Constraints for table `penumpang_bus`
--
ALTER TABLE `penumpang_bus`
  ADD CONSTRAINT `penumpang_bus_ibfk_1` FOREIGN KEY (`NIK`) REFERENCES `bus` (`NIK`);

--
-- Constraints for table `penumpang_kereta`
--
ALTER TABLE `penumpang_kereta`
  ADD CONSTRAINT `penumpang_kereta_ibfk_1` FOREIGN KEY (`NIK`) REFERENCES `kereta` (`NIK`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
