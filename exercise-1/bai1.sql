-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th3 06, 2023 lúc 03:18 PM
-- Phiên bản máy phục vụ: 10.4.22-MariaDB
-- Phiên bản PHP: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `bai1`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `tblcreaditcard`
--

CREATE TABLE `tblcreaditcard` (
  `id` int(10) NOT NULL,
  `name` varchar(25) NOT NULL,
  `type` varchar(25) NOT NULL,
  `number` varchar(25) NOT NULL,
  `cvc` varchar(25) NOT NULL,
  `expired` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL,
  `paid` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `tblcreaditcard`
--

INSERT INTO `tblcreaditcard` (`id`, `name`, `type`, `number`, `cvc`, `expired`, `paid`) VALUES
(1, 'tuan', 'visa', '123456', '123', '11/24', 1),
(2, 'minh', 'visa', '234567', '234', '10/26', 1);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `tblcreaditcard`
--
ALTER TABLE `tblcreaditcard`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `tblcreaditcard`
--
ALTER TABLE `tblcreaditcard`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
