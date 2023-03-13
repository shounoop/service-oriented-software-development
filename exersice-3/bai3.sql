CREATE SCHEMA `bai3` ;
USE bai3

CREATE TABLE `product` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `amount` INT NOT NULL,
  PRIMARY KEY (`id`));