select * from member;
drop table member;
select * from BOARD
drop table board

create table member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	address varchar2(100) not null
)

insert into member(id,password,address) values ('java','1234','ÆÇ±³')
alter table member add name varchar2(30)