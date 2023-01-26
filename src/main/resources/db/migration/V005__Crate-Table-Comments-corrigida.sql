create table comments(
	id bigint unsigned not null auto_increment,
	user_Id bigint unsigned not null,
	avaluation_id bigint unsigned not null,
	commentText varchar(1000) not null,
	commentType varchar(6) not null,
	primary key(id),
	constraint foreign key (user_Id) references users (id),
	constraint foreign key (avaluation_id) references avaluations (id)
);