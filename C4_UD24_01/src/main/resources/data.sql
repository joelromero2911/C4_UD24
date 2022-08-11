DROP table IF EXISTS trabajador;

create table trabajador(
    id int auto_increment,
    nombre varchar(250),
    trabajo varchar(250),
    salario double
);

insert into trabajador (nombre, trabajo, salario)values('Jose','informatico',1000);
insert into trabajador (nombre, trabajo, salario)values('Juan','informatico',1000);
insert into trabajador (nombre, trabajo, salario)values('Pedro','informatico',1000);
insert into trabajador (nombre, trabajo, salario)values('Jordi','politico',1200);
insert into trabajador (nombre, trabajo, salario)values('Jonatan','politico',1200);