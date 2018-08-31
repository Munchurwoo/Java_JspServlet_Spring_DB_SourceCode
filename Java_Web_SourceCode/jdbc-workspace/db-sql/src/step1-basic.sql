/*
 		SQL : Structured Query Language 데이터베이스 제어 언어 
 		SQL : 주석 한줄은 -- 여러줄은 /* */ 
 		
 		DML : Data Manipulation Language
 		 
 		insert 정보 저장 create 
 		select 정보 조회 read 
 		update 정보 수정 Update
 		delete 정보 삭제 Delete 
		
		DDL : Data Definition Language
				create 테이블 생성 
				drop 테이블 삭제 
				alter 테이블 구조 변경 
		DCL : Data Control Language 
				commit : 정보를 실제 db에 저장 
				rollback : 작업을 취소 
		
		Database 관련 기본 용어 
		table : 데이터를 저장하는 공간 
		column : 테비을 내 속성 
		datatype : 데이터 타입 
					ex ) 오라클 문자열 타입 varchar2(100)
						  오라클 숫자타입 number 
		constraints : 제약조건 
					ex ) primary key - 주키 ( unique + not null )
						  not null - 정보가 반드시 존재해야 저장가능 
		
 * */
-- member 테이블을 생성한다.
-- sql 실행 단추키는 영역을 지정한 후 alt + x 
CREATE TABLE member(
	id varchar2(100) PRIMARY KEY,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100)
);

-- 조회 
SELECT *FROM member;

-- 드랍 
DROP TABLE member;

-- 데이터 생성해서 저장 
INSERT INTO MEMBER(id, password, name, address)
VALUES('java','1234','아이유','판교');
INSERT INTO MEMBER(id, password, name, address)
VALUES('jdbc','1234','신현수','양재');

-- 테이블에서 특정 컬럼( name ) 만 조회 
select name from member;
select id, name from member;
-- 조회시 조건을 부여 
-- 양재가 address 인 member 의 name 을 조회 
select name from MEMBER where address='수원';
-- name 이 아이유이고 address가 판교인 member의 id 를 조회 
select id from MEMBER where name='아이유' and address='판교';

-- id : html , password : kosta , name : 최요셉 address : 판교 
insert into MEMBER(id,password,name,address)
values ('html','kosta','최요셉','판교')

-- 오라클 함수를 이용해서 (count(*) 총회원수를 조회 
select count(*) from member;

-- 수정 update 구문 
update member set id='바꾼거다',address='하와이' where name='아이유';
select * from member;
-- id가 jdbc 이고 password 가 abcd 인 member의 address 를 하와이로 수정 
update member set address='하와이' where  id='jdbc' and password='abcd' 
--삭제 delect 구문 
-- address 가 하와이인 member  정보를 모두 삭제 
delete from member where address='하와이';
select count(*) from member;
select * from MEMBER;

--제약조건 primary key 테스트 
--primary key 는 정보가 테이블 상에서 유일해야 하고 not null 즉 존재해야 한다. 
insert into member(id, password,name,address) values('java','4321','박보검','판교'); --error pk 는 유일해야 하므로 
-- 아래 sql 또한 error , 이유 : pk는 반드시 정보를 입력해야 한다. 
insert into member(password,name,address) values('4422','박보검','판교');
insert into member(id,password,name) values('park','4422','강동원');

drop table member;
select * from MEMBER;
update member set name='강민성',id='바꾼거다',address='하와이' where name='강동원';













