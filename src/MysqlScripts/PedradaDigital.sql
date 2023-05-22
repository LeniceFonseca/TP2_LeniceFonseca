create database pedradadigital;
use pedradadigital;


create table usuarios (
  id int auto_increment primary key,
  nome varchar(100) not null,
  apelido varchar(100) not null,
  email varchar(100) not null,
  username varchar(100) not null,
  password varchar(100) not null,
  categoria varchar(100) not null,
  alcunha varchar(100),
  pseudonimo varchar(100),
  visibilidade varchar(100) not null,
  biografia varchar(100)
);

describe usuarios;

select * from usuarios;

alter table usuarios drop column visibilidade;

create table pedradafoto (
	id int auto_increment primary key,
    imagem varchar(100) not null,
	legenda text,
	autor varchar(100) not null,
	data varchar(100) not null
);

describe pedradafoto;

select * from pedradafoto;

create table comentarios (
	id int auto_increment primary key,
    autor varchar(100) not null,
	data varchar(100) not null,
	post varchar(100) not null,
	comentario text
);

alter table comentarios change autor autorcomentario VARCHAR(255);

alter table comentarios change data datacomentario VARCHAR(255);

select * from comentarios;






