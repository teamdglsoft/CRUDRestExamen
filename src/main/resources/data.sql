DROP TABLE IF EXISTS persona;

create table persona(
id int auto_increment,
nombre varchar(250),
apellidop varchar(250),
apellidom varchar(250),
edad integer
);

insert into persona(nombre, apellidop, apellidom, edad) values('Daniel', 'Galeana', 'López', 27), ('Jose Danilo', 'Galeana', 'Martinez', 2);