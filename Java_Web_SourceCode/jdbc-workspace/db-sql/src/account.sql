create table Account(
	accountNum number primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number default 0
)

create sequence account_seq;
select * from Account ;