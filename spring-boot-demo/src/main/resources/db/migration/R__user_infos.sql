CREATE TABLE IF NOT EXISTS `user_infos`(
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `user_id` INT(11) NOT NULL,
  `email` VARCHAR(32) NOT NULL,
  PRIMARY KEY (`id` ASC)
)
ENGINE = InnoDB DEFAULT CHARACTER SET = utf8;