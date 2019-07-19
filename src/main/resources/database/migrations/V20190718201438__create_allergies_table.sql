CREATE TABLE `allergies` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `medicine_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK56yqm0xy8x66ijpu2agx89dxu` (`medicine_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
