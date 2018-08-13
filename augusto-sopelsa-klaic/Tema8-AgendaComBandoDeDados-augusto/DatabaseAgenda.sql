create database Agenda;

use Agenda;

create table Pessoa (
	id smallint auto_increment primary key, 
	nome varchar(100) not null,
    email varchar(100) not null,
    telefone varchar(100) not null
);

insert into Pessoa(nome,email,telefone) values("Augusto Sopelsa Klaic", "augusto.klaic@ilegra.com", "997330690");
insert into Pessoa(nome,email,telefone) values("Ramom Fernandes", "ramom.fernandes@ilegra.com", "321654987");


select * from Pessoa;

select * from Pessoa where nome like "%Aug%";

select * from Pessoa where id = 2;

select last_insert_id();

delete from Pessoa where id = 2;
