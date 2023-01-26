create table avaluations(
	id bigint unsigned not null auto_increment,
	user_Id bigint unsigned not null,
	game_Id bigint unsigned not null,
	tittle varchar(50) not null,
	description varchar(1000) not null,
	primary key(id),
	constraint foreign key (user_Id) references users (id),
	constraint foreign key (game_Id) references games (id)
);