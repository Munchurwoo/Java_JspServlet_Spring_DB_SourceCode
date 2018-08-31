/*
*	SQL 
*	DML : SELECT , INSERT, DELETE, UPDATE
*	DDL : CRATE, DROP, ALTER
*	DCL : COMMIT , ROLLBACK
*
*	--datatype : 오라클 문자열 데이터타입 varchar2 최대길이 4000byte 
*					  영문 1byte, 한글 3byte 
*					  ex) varchar2(9) : 9byte 범위까지 저장가능 
*					  오라클 숫자 데이터타입 number 
*/
CREATE TABLE type_test(
	name varchar2(9) primary key,
	money number not null
)
INSERT INTO type_test(name,money) VALUES('abcdefghi',100);
SELECT * FROM type_test;
INSERT INTO type_test(name,money) VALUES('abcdefghij',100);
INSERT INTO type_test(name,money) VALUES('문준위',200);
INSERT INTO type_test(name,money) VALUES('문준위님',200);
-- name 이 문준위인 정보의 기존 money에 100을 더하기 한다. 
select * from type_test;
update type_test set money=money+100 where name='문준위';
-- name 이 문준위인 정보의 money를 조회시에 2배로 곱하기 한다. 
select name, money, money*2 안녕  from type_test;
--내림차순 정렬해서 조회 ORDER BY 컬럼명 DESC 
SELECT * FROM type_test ORDER BY money DESC;
-- 오름차순 
SELECT * FROM type_test ORDER BY money ASC;

create table altertest(
	id varchar2(100) primary key,
	hit number default 0
);
-- default 제약조건 : 별도로 insert 하지 않아도 정해준 0 값이 insert 된다. 
INSERT INTO altertest(id) values('java');
INSERT INTO altertest(id) values('jsp');
-- hit 가 +1 증가되도록 update 문을 구성해본다. 
update altertest set hit=hit+1 ;
SELECT * FROM altertest;
-- DDL Alter 를 이용해 테이블명을 altertest2로 변경한다. 
ALTER TABLE altertest rename to altertest2;
SELECT * FROM altertest2;
-- ALTER 를 이용해 컬럼명을 변경한다. 
ALTER TABLE altertest2 rename column hit to count;
SELECT * FROM altertest2;
/*
 * TABLE 생성 
 * 테이블명 : product 
 * 컬럼명 : id, name, maker, price 
 * 데이터 타입 : price 만 number 나머지는 varchar2(100)으로 
 * 제약조건 : id 는 primary key, name& maker 는 not null 
 * 				 price -> default 0
 * id  name     maker   price 
 * a   겔럭시8     삼성      100 
 * b   아이폰      애플      150 
 * c   겔럭시2     삼성        0
 * 
 * DDL (CREATE) 구문 작성과 DML ( insert ) 구문 작성 
 */
create table product(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
);
create table 
insert into product(id,name,maker,price) values('a','겔럭시8','삼성',100);
insert into product(id,name,maker,price) values('b','아이폰','애플',150);
insert into product(id,name,maker,price) values('c','겔럭시2','삼성',0);
drop table product;
select * from product;
-- 총상품수 조회 
select count(*) from product;
-- 상품 price 중 최고가 
SELECT MAX(price) from product; 
SELECT MIN(price) from product; 
-- 평균 
SELECT ROUND(AVG(price)) from product;
-- price 내림차순으로 상품정보 조회 
select * from product order by price desc;
-- maker 가 삼성인 product 의 정보를 price 오름차순으로 조회
select * from product where maker='삼성' order by price asc;
-- price 가 100이상 150 이하인 상품의 name 과 price 를 조회 
select name, price from product where 100<=price and price <=150;
-- 위 구문을 between 으로도 구분 가능 
select name, price from product
where price between 100 and 150;
-- ID에 해당하는 상품이 존재하는지 확인 
SELECT COUNT(*) from product where id='a';
--maker 의 종류를 조회 (중복제거) 
select distinct maker from product;
select * from product;
select count(*) from product
