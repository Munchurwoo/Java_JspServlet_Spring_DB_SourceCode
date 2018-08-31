drop table customer;
create table customer(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100) not null,
	birthday date not null,
	regdate date not null
	)

select* from customer
insert into date_test(id,reg_date) values('a',sysdate);
insert into customer(id,password,name,address,birthday,regdate) values('mdnbo','1234','¹®Ã¶¿ì','Áß¶û±¸','2017-08-01',sysdate);
insert into customer(id,password,name,address,birthday,regdate) values('a','1234','°íÀ¯¼ø','Áß¶û±¸','2016-08-01',sysdate)
select id from CUSTOMER where id='mdnbo' and password='1234'