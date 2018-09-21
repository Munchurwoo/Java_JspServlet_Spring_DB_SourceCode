/*
	영화 정보는 영화아이디, 제목, 장르, 관객수 로 구성 
	감독 정보는 아이디, 이름, 소개 
	
	하나의 영화는 영화는 감독 1인으로 지정한다.    
 */
drop table director
create table director(
	director_id varchar2(100) primary key,
	director_name varchar2(100) not null,
	intro varchar2(100) not null
)

drop table movie;
create table movie(
	movie_id varchar2(100) primary key,
	title varchar2(100) not null,
	genre varchar2(100) not null,
	attendance number default 0,
	director_id varchar2(100) not null,
	constraint fk_director_id foreign key(director_id) 
	references director(director_id)
)
select * from movie where director_id="A"
MOVIE_ID="M1"
commit
drop table guestbook
drop sequence guestbook_seq;

create table guestbook(
	guestbook_no number primary key,
	title varchar2(100) not null,
	content clob not null
)
create sequence guestbook_seq

select guestbook_no,title, content from guestbook

insert into guestbook(guestbook_no,title,content)
values(guestbook_seq.nextval,'제목','내용입니다.')


