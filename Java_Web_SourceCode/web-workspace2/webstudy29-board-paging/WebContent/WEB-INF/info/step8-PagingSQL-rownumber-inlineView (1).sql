-- Oracle row_number() over() : 조회된 ROW에 대한 순차적인 번호를 제공하는 오라클 함수 


-- Inline View : SQL 문장에서 From 절에 사용된 SubQuery 
--				   FROM 절에서 서브쿼리로 사용되는 SELECT 명령의 실행결과를 테이블처럼 사용
/*	SELECT 
 *  FROM (
 * 		Subquery : select 
 *  )
 * 
 */

drop table player;
create table player(
 no number primary key,
 title varchar2(100) not null,
 singer varchar2(30) not null,
 price number not null
)

select * from player;

create sequence mp3_seq;

insert into player(no,title,singer,price) values(mp3_seq.nextval,'가을아침','아이유',700);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'좋니','윤종신',500);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'시차','우원재',400);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'DNA','방탄소년단',800);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'밤편지','아이유',900);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'가시나','선미',1000);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Power','EXO',300);
insert into player(no,title,singer,price) values(mp3_seq.nextval,'Ko Ko Bop','EXO',600);
commit
select count(*) from player;


select * from player order by no desc;
--row number() over(정렬)
select row_number() over(order by no desc) as rnum, no,title from player;
-- 삭제 title 이 power 인 곡을 삭제 
delete from player where title='Power'
-- row number 가 3이하인 곡들만 조회 
-- error : row number 는 조회된 행에 대해서 번호가 생성 
select row_number() over(order by no desc) as rnum, no,title from player;
where rnum <=3;
-- subquery (from 저레서 사용되므로 Inline View라고 한다.)를 이용해 조회한다.
select rnum, no, title 
from(select row_number() over(order by no desc) as rnum, no,title from player)
where rnum<=3
-- rnum 이 4 이상 6이하인 곡을 조회 
select rnum, no, title 
from(select row_number() over(order by no desc) as rnum, no,title from player)
where rnum between 4 and 6;
-- Board Paging SQL 
-- 게시물 rnum 이 1이상 5이하 게시물 정보를 조회 
/*
 * 
 */
-- step1 : 게시물 내림차순 정렬하고 row number 를 생성한다. 
SELECT row_number() over(order by no desc) as rnum, no, title,hits,
to_char(time_posted,'YYYY.MM.DD') as time_posted, id from board_list;

select B.*M.name
from (
	select row_number() over(order by no desc) as rnum, no, title, hits,to_char(time_posted,'YYYY.MM.DD' as time_posted)
	, id from board_inst) B,BOARD_MEMBER M
	where B.id = M.id and rnum between 1 and 5 alterorder by no desc
)


select rnum, no, title 
from(select row_number() over(order by no desc) as rnum, no,title FROM board_inst b , board_member m
WHERE b.id=m.id
order by no desc)
where rnum between 1 and 5;
