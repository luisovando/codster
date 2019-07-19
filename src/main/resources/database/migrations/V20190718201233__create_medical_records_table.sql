CREATE TABLE `medical_records` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `blood_type` varchar(255) DEFAULT NULL,
  `last_medical_consultation` datetime DEFAULT NULL,
  `medical_record_id` int(11) DEFAULT NULL,
  `account_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKlwnh7j9clq5vtr0t9r53b37fs` (`account_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
