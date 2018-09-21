drop sequence spring_board_inst_seq;
create sequence spring_board_inst_seq;

select * from spring_member;
drop table spring_member;
create table spring_member(
 id varchar2(100) primary key,
 password varchar2(100) not null,
 name varchar2(100) not null,
 address varchar2(100) not null
)

delete from spring_member;
insert into spring_member(id,password,name,address) values('java','1234','아이유','판교');
insert into spring_member(id,password,name,address) values('spring','1234','이효리','애월');

drop table spring_board_inst;
create table spring_board_inst(
 no number primary key,
 title varchar2(50) not null,
       content clob not null,
 hits number default 0,
 time_posted date not null,
 id varchar2(100) not null,
 constraint spring_board_inst_fk foreign key(id) references spring_member(id)
)