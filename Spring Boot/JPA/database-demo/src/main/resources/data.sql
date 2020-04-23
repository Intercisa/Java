create table person(
	id integer not null, 
	name varchar(255) not null, 
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);


insert into person(id, name, location, birth_date)
values(10001, 'Sipi', 'Budapest', sysdate());

insert into person(id, name, location, birth_date)
values(10002, 'Birbi', 'Budapest', sysdate());

insert into person(id, name, location, birth_date)
values(10003, 'Tusi', 'Dujv', sysdate());

insert into person(id, name, location, birth_date)
values(10004, 'Polom', 'Munchen', sysdate());

insert into person(id, name, location, birth_date)
values(10005, 'Balage', 'Szfh', sysdate());