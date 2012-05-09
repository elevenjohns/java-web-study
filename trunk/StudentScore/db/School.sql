CREATE DATABASE `school` /*!40100 DEFAULT CHARACTER SET latin1 */;

DROP TABLE IF EXISTS `school`.`courses`;
CREATE TABLE  `school`.`courses` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `school`.`students`;
CREATE TABLE  `school`.`students` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `snumber` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `department` varchar(45) NOT NULL,
  `specialty` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

DROP TABLE IF EXISTS `school`.`scores`;
CREATE TABLE  `school`.`scores` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `score` float NOT NULL,
  `course_id` int(10) unsigned NOT NULL,
  `student_id` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  CONSTRAINT `course_id` FOREIGN KEY (`id`) REFERENCES `courses` (`id`),
  CONSTRAINT `student_id` FOREIGN KEY (`id`) REFERENCES `students` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;