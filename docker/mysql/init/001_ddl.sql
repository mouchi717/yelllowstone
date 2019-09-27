CREATE DATABASE IF NOT EXISTS yellowstone;
use yellowstone;

DROP TABLE IF EXISTS `users`;

CREATE TABLE IF NOT EXISTS users (
  `USER_ID` int(10) unsigned not null auto_increment,
  `LAST_NAME` varchar(255) not null,
  `FIRST_NAME` varchar(255) not null,
  `INS_DATETIME` datetime not null default current_timestamp,
  `UPD_DATETIME` datetime not null default current_timestamp on update current_timestamp,
  primary key (USER_ID)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='ユーザー';