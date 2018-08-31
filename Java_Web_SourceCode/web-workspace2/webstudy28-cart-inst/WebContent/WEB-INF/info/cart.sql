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
 
 delete from item where name='문철우'
 commit
 select * from item
 select * from member;
 
 create table member(
 id varchar2(100) primary key,
 password varchar2(100) not null,
 name varchar2(100) not null
)
 
 drop table board
 drop table post
 drop table member;
 
 create table board (
 	post_no number primary key,
 	id varchar2(100) not null,
 	title varchar2(100) not null,
 	regdate date not null,
 	hits number default 0,
 	contents clob not null,
 	constraint fk_id_wruter foreign key(id) references member(id)
 )
 create sequence post_no_seq;
insert into member(id, password,name) values('java',1234,'문철우');
insert into member(id, password,name) values('c',1234,'해랑이');
insert into board(post_no,id,title,regdate,contents)
values(post_no_seq.nextval,'java','태풍이란',sysdate,'태풍이 서울권으로 진입하여 큰 피해를 예상한다.')
 select * from board
 select * from member
 