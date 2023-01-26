create table comments(
	id bigint unsigned not null auto_increment,
	userID bigint unsigned not null,
	avaluationId bigint unsigned not null,
	commentText varchar(1000) not null,
	commentType varchar(6) not null,
	primary key(id),
	constraint foreign key (userID) references users (id),
	constraint foreign key (avaluationId) references avaluations (id)
);