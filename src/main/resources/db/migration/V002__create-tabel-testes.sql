create table users (
	id bigint unsigned not null auto_increment primary key,
    nome varchar(255) not null,
	nickname varchar(16) not null,
    email varchar(255) not null,
    senha varchar(16) not null
);