/* 		SQL
 * 			DML : SELECT , INSERT , DELETE , UPDATE 
 * 			DDL : CREATE , DROP , ALTER 
 * 			DCL : COMMIT , ROLLBACK 
 */
 -- datatype :   ����Ŭ ���ڿ� ������Ÿ�� varchar2   �ִ���� 4000byte
 --					���� 1byte , �ѱ� 3byte 
 --					ex)  varchar2(9)  : 9byte �������� ���尡�� 
 --					����Ŭ ���� ������Ÿ�� number 
 CREATE TABLE type_test(
 	name varchar2(9) primary key, 
 	money number not null
 )
 INSERT ALL
 INSERT INTO type_test(name,money) VALUES('����1',100)
 INSERT INTO type_test(name,money) VALUES('ö��1',200)
 
 SELECT * FROM type_test;
 -- id�� �������� 9�� �ʰ��Ͽ� error 
INSERT INTO type_test(name,money) VALUES('abcdefghij',100);
INSERT INTO type_test(name,money) VALUES('������',200);
-- id�� �ѱ۱��� 3�� �ʰ��Ͽ� error , �ѱ� �ѹ��ڴ� 3byte 
INSERT INTO type_test(name,money) VALUES('��������',100);
-- name�� �������� ������ ���� money�� 100�� ���ϱ� �Ѵ� 
UPDATE type_test SET money=money+100 WHERE name='������';
SELECT * FROM type_test WHERE name='������';

-- name �� �������� ������ money�� ��ȸ�ÿ� 2��� ���ϱ� �Ѵ�  
SELECT name,money,money*2 as "�ι谡" 
FROM type_test WHERE name='������';
-- �������� �����ؼ� ��ȸ  ORDER BY �÷��� DESC 
SELECT * FROM type_test ORDER BY money DESC;
-- �������� 
SELECT * FROM type_test ORDER BY money ASC;

/*	 DDL : ALTER  ���̺� ���� ���� �Ǵ� �÷� �� �������� ����� ��� 
 * 
 */
CREATE TABLE altertest(
	id varchar2(100) primary key,
	hit number default 0
)
-- default �������� : ������ insert ���� �ʾƵ� ������ 0 ���� insert�ȴ� 
INSERT INTO altertest(id) values('java');
INSERT INTO altertest(id) values('jsp');

-- hit �� +1 �����ǵ��� update ���� �����غ��� 
UPDATE altertest SET hit=hit+1; 
SELECT * FROM altertest;

-- DDL Alter�� �̿��� ���̺����  altertest2 �� �����Ѵ� 
ALTER TABLE altertest RENAME TO  altertest2;
SELECT * FROM altertest; -- error , table�� ���������Ƿ� 
SELECT * FROM altertest2;-- table�� ����ǰ� data�� �״�� �����ȴ� 
-- Alter �� �̿��� �÷����� �����Ѵ� 
ALTER TABLE altertest2 RENAME column hit to count;
SELECT * FROM altertest2;

/*		TABLE ���� 
 * 		���̺�� : product 
 * 		�÷��� : id, name, maker ,price 
 * 					������Ÿ���� price�� number �������� varchar2(100) ���� 
 *      �������� : id �� primary key 
 * 					   name�� maker�� not null 
 * 					   price �� default 0 
 * 		
 *      id	  name	   				maker	 		price
 * 		a	  ������8			�Ｚ			100
 * 	    b	  ������7			����			150
 * 		c     ������2			�Ｚ			0
 * 
 * 		DDL ( CREATE ) ���� �ۼ��� DML ( INSERT) ���� �ۼ� 
 */
CREATE TABLE product(
	id VARCHAR2(100) PRIMARY KEY,
	name VARCHAR2(100) NOT NULL,
	maker VARCHAR2(100) NOT NULL,
	price NUMBER DEFAULT 0
)
INSERT INTO product(id,name,maker,price) VALUES('a','������8','�Ｚ',100);
INSERT INTO product(id,name,maker,price) VALUES('b','������7','����',150);
INSERT INTO product(id,name,maker) VALUES('c','������2','�Ｚ');
SELECT * FROM product;
-- �ѻ�ǰ�� ��ȸ 
SELECT COUNT(*) FROM product;
-- ��ǰ price �� �ְ� 
SELECT MAX(price) FROM product;
-- ������ 
SELECT MIN(price) FROM product;
-- ��հ��� �ݿø��ؼ� ��ȸ 
SELECT ROUND(AVG(price)) FROM product;
-- PRICE ������������ ��ǰ���� ��ȸ ( ORDER BY �÷��� DESC ) 
SELECT id,name,maker,price FROM product
ORDER BY price DESC;
-- maker �� �Ｚ�� product �� ������ price ������������ ��ȸ 
SELECT id,name,maker,price FROM product
WHERE maker='�Ｚ'
ORDER BY price ASC;
-- price�� 100 �̻� 150 ������ ��ǰ�� name�� price�� ��ȸ 
SELECT name,price FROM product
WHERE price>=100 and price<=150;
-- �� ������ between ���ε� ǥ�� ���� 
SELECT name,price FROM product
WHERE price BETWEEN 100 AND 150;
-- ID �� �ش��ϴ� ��ǰ�� �����ϴ� �� Ȯ�� 
SELECT COUNT(*) FROM product WHERE id='a';-- �����ϸ� 1 
SELECT COUNT(*) FROM product WHERE id='a2';-- ����x  0 
-- MAKER�� ������ ��ȸ (�ߺ�����) 
SELECT DISTINCT maker FROM product; 










