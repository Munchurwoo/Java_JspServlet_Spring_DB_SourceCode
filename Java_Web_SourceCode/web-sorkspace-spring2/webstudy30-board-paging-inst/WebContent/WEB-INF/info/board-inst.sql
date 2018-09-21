drop sequence board_inst_seq;
create sequence board_inst_seq;


drop table board_member;
create table board_member(
	id varchar2(100) primary key,
	password varchar2(100) not null,
	name varchar2(100) not null
)
insert into board_member(id,password,name) values('java','1234','아이유');
insert into board_member(id,password,name) values('spring','1234','공유');

drop table board_inst;
create table board_inst(
	no number primary key,
	title varchar2(50) not null,
    content clob not null,
	hits number default 0,
	time_posted date not null,
	id varchar2(100) not null,
	constraint board_fk foreign key(id) references board_member(id)
)

select board_inst_seq.nextval from dual;

insert into board_inst(no,title,content,time_posted,id) 
values(board_inst_seq.nextval,'방가','ㅋㅋ',sysdate,'java');
insert into board_inst(no,title,content,time_posted,id) 
values(board_inst_seq.nextval,'안녕','치맥',sysdate,'spring');
select * from board_inst;

commit

SELECT b.no,b.title,b.hits,
to_char(time_posted,'YYYY.MM.DD') as time_posted,m.id,m.name 
FROM board_inst b , board_member m
WHERE b.id=m.id
order by no desc


delete from board_inst;
commit

SELECT b.no,b.title,to_char(time_posted,'YYYY.MM.DD') as time_posted,
b.hits,m.id,m.name
FROM board_inst b , board_member m 
WHERE b.id=m.id 	
order by no desc

-- member 와 join 없이 board 만 조회하되 row_number 를 생성한다 
SELECT 
row_number() over(ORDER BY NO DESC) AS rnum,no,title,
to_char(time_posted,'YYYY.MM.DD') as time_posted,hits,id
FROM board_inst 
-- Inline View 를 이용해 board 의 게시물을 row num 기준 1 부터 5까지 조회
SELECT B.*
FROM (
	SELECT 
	row_number() over(ORDER BY NO DESC) AS rnum,no,title,
	to_char(time_posted,'YYYY.MM.DD') as time_posted,hits,id
	FROM board_inst 
) B  WHERE rnum BETWEEN 1 AND 5 
-- 위 SQL 을 기반으로 회원테이블과 조인하여 회원명을 추가해서 조회
SELECT B.*,M.name
FROM (
	SELECT 
	row_number() over(ORDER BY NO DESC) AS rnum,no,title,
	to_char(time_posted,'YYYY.MM.DD') as time_posted,hits,id
	FROM board_inst 
) B ,board_member M WHERE B.id=M.id AND rnum BETWEEN 1 AND 5 
ORDER BY no DESC














