create table account_inst(
	account_no number primary key,
	name varchar2(100) not null,
	password varchar2(100) not null,
	balance number not null
)
drop table account_inst;
delete from account_inst;
create sequence account_inst_seq;
drop sequence account_inst_seq;

insert into account_inst(account_no,name,password,balance)
values(account_inst_seq.nextval,'æ∆¿Ã¿Ø','1234',100);


select * from account_inst;

--select balance from account_inst where account_no='11' and password='34';






