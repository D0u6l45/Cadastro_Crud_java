
drop database if exists empresa;
create database empresa;
use empresa;

create table funcionario
(
id int primary key auto_increment,
nome varchar(50)not null,
login varchar(50)not null,
senha varchar(255)not null
);

desc funcionario;

insert into funcionario values(null,'Douglas','doug',md5('123'));

select * from funcionario;
