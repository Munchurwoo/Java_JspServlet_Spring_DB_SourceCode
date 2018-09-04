-- Oracle row_number() over() : 
-- 조회된 ROW에 대한 순차적인 번호를 제공하는 오라클 함수 


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
-- 내림차순 정렬 
select * from player order by no desc;
-- row_number() over(정렬)
select row_number() over(order by no desc) as rnum, no , title from player;
select row_number() over(order by no asc) as anum, no, title from player;
-- 삭제 title 이 Power 인 곡을 삭제 
delete from player where title='Power';
-- row number 가 3 이하인 곡들만 조회 
-- error : row number 는 조회된 행에 대해서 번호가 생성 
select row_number() over(order by no desc) as rnum, no , title from player
where rnum<=3;
-- SubQuery(from 절에서 사용하므로 Inline View라고 한다)를 이용해 조회한다 
SELECT rnum,no,title
FROM (
	select row_number() over(order by no desc) as rnum, no , title from player
) WHERE rnum<=3
-- rnum 이 4이상 6이하인 곡을 조회 
SELECT rnum,no,title
FROM (
	select row_number() over(ORDER BY NO DESC) as rnum, no , title from player
) WHERE rnum BETWEEN 4 AND 6;
-- Board Paging SQL 
-- 게시물 rnum 이 1 이상 5이하 게시물 정보를 조회 
/*	SELECT B.*,M.name
 *  FROM(
 * 		select row_number() , 컬럼,컬럼  from board 
 *  ) B , MEMBER M 
 * WHERE 조인조건 AND rnum between 1 and 5  
 */
-- step1 : 게시물을 내림차순 정렬하고 row number를 생성한다 
SELECT row_number() over(ORDER BY NO DESC) as rnum, no,title,hits,
to_char(time_posted,'YYYY.MM.DD') as time_posted,id
FROM board_inst;
-- step2 : step1을 인라인 뷰로 이용하고 member와 join 한다 
SELECT	B.* , M.name
FROM (
	SELECT row_number() over(ORDER BY NO DESC) as rnum, no,title,hits,
	to_char(time_posted,'YYYY.MM.DD') as time_posted,id
	FROM board_inst
) B , BOARD_MEMBER M 
WHERE B.id=M.id AND rnum BETWEEN 1 AND 5
ORDER BY NO DESC;

-- 오름차순으로 rnum 을 출력하고 1~6번의 로우 넘버를 조회 
select row_number() over(order by no asc) as rnum, to_char(time_posted,'yyyy.mm.dd') as time_posted
from board_inst;
-- join subquery 활용한 예제 
select B.*, m.name from(
select row_number() over(order by no asc) as rnum, to_char(time_posted,'yyyy.mm.dd') as time_posted, id
from board_inst) B, board_member m
where B.id = m.id and rnum between 1 and 6
order by time_posted desc;

-- BoardDAO 에서 사용할 SQL 
SELECT	B.* , M.name
FROM (
	SELECT row_number() over(ORDER BY NO DESC) as rnum, no,title,hits,
	to_char(time_posted,'YYYY.MM.DD') as time_posted,id
	FROM board_inst
) B , BOARD_MEMBER M 
WHERE B.id=M.id AND rnum BETWEEN ? AND ?
ORDER BY NO DESC;














