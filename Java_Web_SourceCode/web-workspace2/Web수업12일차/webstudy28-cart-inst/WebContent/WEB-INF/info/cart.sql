drop table item;
create table item(
	item_no number primary key,
	name varchar2(200) not null,
	maker varchar2(200) not null,
	price number not null,
	detail varchar2(2000) not null
)
drop sequence item_seq;
create sequence item_seq;

delete from item;

 insert into item(item_no,name,maker,price,detail) 
 values(item_seq.nextval,'아이폰3','애플',1000,'스티브 잡스가 만들었어요');
 
 insert into item(item_no,name,maker,price,detail) 
 values(item_seq.nextval,'갤럭시3','삼성',1500,'갤갤갤');
 
 insert into item(item_no,name,maker,price,detail) 
 values(item_seq.nextval,'G5','LG',2000,'모듈화시킴');
 
 commit
 
 select * from member;
 
 
 
 
 
 
 