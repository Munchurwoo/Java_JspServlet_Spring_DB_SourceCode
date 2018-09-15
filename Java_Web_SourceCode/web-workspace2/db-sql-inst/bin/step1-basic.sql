/*
 		SQL : Structured Query Language 데이터베이스 제어 언어 
 		
 		SQL 주석 한줄은 --  여러줄은 /*   */ 
 		
 		DML : Data Manipulation Language - CRUD  
 				insert 정보 저장 Create 
 				select 정보 조회 Read 
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
 		column : 테이블 내 속성 
 		datatype : 데이터 타입   
 					ex) 오라클 문자열타입 varchar2(100)	
 						 오라클 숫자타입 number 
 		constraints : 제약조건 
 					  ex) primary key - 주키,기본키,pk라고 함 ( unique + not null )
 					  	   not null - 정보가 반드시 존재해야 저장가능  
 					  				     
 */
-- CREATE TABLE :  member 테이블을 생성한다 
-- sql 실행 단축키는 영역을 지정한 후 alt + x 
CREATE TABLE member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	address VARCHAR2(100)
);
-- DROP TABLE
-- 테이블 삭제 
DROP TABLE member;
-- INSERT 
-- 데이터 생성해서 저장 
INSERT INTO member(id,password,name,address) 
VALUES('java','1234','아이유','판교');

INSERT INTO member(id,password,name,address) 
VALUES('jdbc','abcd','신현수','양재');
-- SELECT 
-- 조회 
SELECT * FROM member;
-- 테이블에서 특정 컬럼( id,name ) 만 조회 
SELECT id,name FROM member;
-- 조회시 조건을 부여 ( where 절 ) 
-- 양재가 address 인 member의 name을 조회 
SELECT name FROM member WHERE address='양재';
-- name이 아이유이고 address가 판교인 member의 id를 조회 
SELECT id FROM member WHERE name='아이유' AND address='판교';

-- id : html , password : kosta , name : 최요셉 , address : 판교 
-- 위 정보를 member table에 저장하세요 
INSERT INTO member(id,password,name,address)
VALUES('html','kosta','최요셉','판교');

-- 오라클 함수를 count(*) 이용해 총회원수를 조회 
SELECT COUNT(*) FROM member;
 
-- 수정 update 구문 
UPDATE member SET address='하와이' WHERE name='최요셉';

SELECT * FROM member;
-- id가 jdbc 이고 password 가 abcd 인 member의 address를 하와이로 수정 
UPDATE member SET address='하와이' WHERE id='jdbc' and password='abcd';

-- 삭제 delete 구문 
-- address가 하와이인 member 정보를 모두 삭제 
DELETE FROM member WHERE address='하와이';

SELECT COUNT(*) FROM member;
SELECT * FROM member;

-- 제약조건 primary key 테스트 
-- primary key는 정보가 테이블 상에서 유일해야 하고
-- not null 즉 존재해야한다 
INSERT INTO member(id,password,name,address) 
VALUES('java','4321','박보검','판교'); -- error pk는 유일해야 하므로 
-- 아래 SQL 또한 ERROR , 이유: pk는 반드시 정보를 입력해야 한다 
INSERT INTO member(password,name,address)
VALUES('4422','박보검','판교');
-- 아래는 정상실행, address는 별도의 제약조건이 없으므로 null 허용 
INSERT INTO member(id,password,name)
VALUES('park','4422','박보검');

DROP TABLE member;
SELECT * FROM member;

DELETE FROM MEMBER WHERE ID='java2';
















