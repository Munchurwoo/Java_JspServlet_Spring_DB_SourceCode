drop table account
create table account(
id varchar2(100) primary key,
name varchar2(100) not null,
balance number not null
)
select * from ACCOUNT;
insert into account values('1','아이유',100);
commit

ping failed