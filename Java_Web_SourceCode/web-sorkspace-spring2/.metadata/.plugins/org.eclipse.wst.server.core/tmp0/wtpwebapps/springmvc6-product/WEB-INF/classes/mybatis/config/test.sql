create table spring_customer(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	address varchar2(100) not null
)
insert into SPRING_Customer values('java', '아이유', '판교')
commit
select * from spring_customer