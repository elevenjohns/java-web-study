DROP TABLE IF EXISTS `test`.`books`;
CREATE TABLE  `test`.`books` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `price` float NOT NULL,
  `author` varchar(45) NOT NULL,
  `bookConcern` varchar(45) NOT NULL,
  `counts` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;