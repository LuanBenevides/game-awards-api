create table games (
	id bigint unsigned not null auto_increment primary key,
	name varchar(255) not null,
	description varchar(500) not null,
	cover varchar(255) not null,
	votes bigint not null
);