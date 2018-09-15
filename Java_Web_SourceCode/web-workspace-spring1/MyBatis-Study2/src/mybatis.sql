create table spring_member(
	id varchar2(100) primary key, 
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(199) not null
)

insert into spring_member(id, password, name, address)
values('java','1234','아이유','판교');
commit

select * from spring_member

select distinct address from spring_member