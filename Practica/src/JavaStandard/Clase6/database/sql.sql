drop database if exists curso;
create database curso;
use curso;

drop table if exists empleados;
create table empleados (
id int primary key auto_increment, 
nombre varchar (50),
apellido varchar (50),
remuneracion float(10)
);

select * from empleados;