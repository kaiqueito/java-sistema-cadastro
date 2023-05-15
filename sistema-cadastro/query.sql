create schema banco_empresa;

use banco_empresa;

create table usuarios (
	usuario 	varchar(50) 	not null 	primary key	,
    senha 		varchar(50)		not null				,
    cargo		varchar(50)		not null
);

create table departamentos (
	codigo		varchar(10)		not null	primary key	,
	nome 		varchar(30)		not null				,
    cidade 		varchar(30)								,
    telefone	varchar(15)
);

create table funcionarios (
	matricula	varchar(20) primary key	,
	nome		varchar(50)	not null	,
	cargo 		varchar(40)				,
	salario 	double 
);

insert into usuarios values('Kaique','abcd','Coordenador');
insert into departamento values('RH-01','Recursos Humanos','São Paulo','(11) 97685-2095');

select * from usuarios;
select * from departamentos;
select * from funcionarios;

delete from usuarios where usuario = '';
delete from departamento where codigo = '';
delete from funcionarios where matricula = '01';
