CREATE TABLE `medical_record_allergy` (
  `medical_record_id` int(11) NOT NULL,
  `allergy_id` int(11) NOT NULL,
  PRIMARY KEY (`medical_record_id`,`allergy_id`),
  KEY `FKrt2qcgojavhagh9g9kvvvo35r` (`allergy_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
