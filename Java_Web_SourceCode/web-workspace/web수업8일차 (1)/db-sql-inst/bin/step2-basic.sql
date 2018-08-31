/* 		SQL
 * 			DML : SELECT , INSERT , DELETE , UPDATE 
 * 			DDL : CREATE , DROP , ALTER 
 * 			DCL : COMMIT , ROLLBACK 
 */
 -- datatype :   오라클 문자열 데이터타입 varchar2   최대길이 4000byte
 --					영문 1byte , 한글 3byte 
 --					ex)  varchar2(9)  : 9byte 범위까지 저장가능 
 --					오라클 숫자 데이터타입 number 
 CREATE TABLE type_test(
 	name varchar2(9) primary key, 
 	money number not null
 )
 INSERT INTO type_test(name,money) VALUES('abcdefghi',100);
 SELECT * FROM type_test;
 -- id가 영문기준 9자 초과하여 error 
INSERT INTO type_test(name,money) VALUES('abcdefghij',100);
INSERT INTO type_test(name,money) VALUES('문준위',200);
-- id가 한글기준 3자 초과하여 error , 한글 한문자는 3byte 
INSERT INTO type_test(name,money) VALUES('문준위님',100);
-- name이 문준위인 정보의 기존 money에 100을 더하기 한다 
UPDATE type_test SET money=money+100 WHERE name='문준위';
SELECT * FROM type_test WHERE name='문준위';

-- name 이 문준위인 정보의 money를 조회시에 2배로 곱하기 한다  
SELECT name,money,money*2 as "두배가" 
FROM type_test WHERE name='문준위';
-- 내림차순 정렬해서 조회  ORDER BY 컬럼명 DESC 
SELECT * FROM type_test ORDER BY money DESC;
-- 오름차순 
SELECT * FROM type_test ORDER BY money ASC;

/*	 DDL : ALTER  테이블 정보 변경 또는 컬럼 및 제약조건 변경시 사용 
 * 
 */
CREATE TABLE altertest(
	id varchar2(100) primary key,
	hit number default 0
)
-- default 제약조건 : 별도로 insert 하지 않아도 정해준 0 값이 insert된다 
INSERT INTO altertest(id) values('java');
INSERT INTO altertest(id) values('jsp');

-- hit 가 +1 증가되도록 update 문을 구성해본다 
UPDATE altertest SET hit=hit+1; 
SELECT * FROM altertest;

-- DDL Alter를 이용해 테이블명을  altertest2 로 변경한다 
ALTER TABLE altertest RENAME TO  altertest2;
SELECT * FROM altertest; -- error , table명 변경했으므로 
SELECT * FROM altertest2;-- table명만 변경되고 data는 그대로 유지된다 
-- Alter 를 이용해 컬럼명을 변경한다 
ALTER TABLE altertest2 RENAME column hit to count;
SELECT * FROM altertest2;

/*		TABLE 생성 
 * 		테이블명 : product 
 * 		컬럼명 : id, name, maker ,price 
 * 					데이터타입은 price만 number 나머지는 varchar2(100) 으로 
 *      제약조건 : id 는 primary key 
 * 					   name과 maker는 not null 
 * 					   price 는 default 0 
 * 		
 *      id	  name	   				maker	 		price
 * 		a	  갤럭시8			삼성			100
 * 	    b	  아이폰7			애플			150
 * 		c     갤럭시2			삼성			0
 * 
 * 		DDL ( CREATE ) 구문 작성과 DML ( INSERT) 구문 작성 
 */
CREATE TABLE product(
	id VARCHAR2(100) PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER DEFAULT 0
)
INSERT INTO product(id,name,maker,price) VALUES('a','갤럭시8','삼성',100);
INSERT INTO product(id,name,maker,price) VALUES('b','아이폰7','애플',150);
INSERT INTO product(id,name,maker) VALUES('c','갤럭시2','삼성');
SELECT * FROM product;
-- 총상품수 조회 
SELECT COUNT(*) FROM product;
-- 상품 price 중 최고가 
SELECT MAX(price) FROM product;
-- 최저가 
SELECT MIN(price) FROM product;
-- 평균가를 반올림해서 조회 
SELECT ROUND(AVG(price)) FROM product;
-- PRICE 내림차순으로 상품정보 조회 ( ORDER BY 컬럼명 DESC ) 
SELECT id,name,maker,price FROM product
ORDER BY price DESC;
-- maker 가 삼성인 product 의 정보를 price 오름차순으로 조회 
SELECT id,name,maker,price FROM product
WHERE maker='삼성'
ORDER BY price ASC;
-- price가 100 이상 150 이하인 상품의 name과 price를 조회 
SELECT name,price FROM product
WHERE price>=100 and price<=150;
-- 위 구문을 between 으로도 표현 가능 
SELECT name,price FROM product
WHERE price BETWEEN 100 AND 150;
-- ID 에 해당하는 상품이 존재하는 지 확인 
SELECT COUNT(*) FROM product WHERE id='a';-- 존재하면 1 
SELECT COUNT(*) FROM product WHERE id='a2';-- 존재x  0 
-- MAKER의 종류를 조회 (중복제거) 
SELECT DISTINCT maker FROM product; 










