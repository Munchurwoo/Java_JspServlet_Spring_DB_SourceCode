/*
*	SQL 
*	DML : SELECT , INSERT, DELETE, UPDATE
*	DDL : CRATE, DROP, ALTER
*	DCL : COMMIT , ROLLBACK
*
*	--datatype : ����Ŭ ���ڿ� ������Ÿ�� varchar2 �ִ���� 4000byte 
*					  ���� 1byte, �ѱ� 3byte 
*					  ex) varchar2(9) : 9byte �������� ���尡�� 
*					  ����Ŭ ���� ������Ÿ�� number 
*/
CREATE TABLE type_test(
	name varchar2(9) primary key,
	money number not null
)
INSERT INTO type_test(name,money) VALUES('abcdefghi',100);
SELECT * FROM type_test;
INSERT INTO type_test(name,money) VALUES('abcdefghij',100);
INSERT INTO type_test(name,money) VALUES('������',200);
INSERT INTO type_test(name,money) VALUES('��������',200);
-- name �� �������� ������ ���� money�� 100�� ���ϱ� �Ѵ�. 
select * from type_test;
update type_test set money=money+100 where name='������';
-- name �� �������� ������ money�� ��ȸ�ÿ� 2��� ���ϱ� �Ѵ�. 
select name, money, money*2 �ȳ�  from type_test;
--�������� �����ؼ� ��ȸ ORDER BY �÷��� DESC 
SELECT * FROM type_test ORDER BY money DESC;
-- �������� 
SELECT * FROM type_test ORDER BY money ASC;

create table altertest(
	id varchar2(100) primary key,
	hit number default 0
);
-- default �������� : ������ insert ���� �ʾƵ� ������ 0 ���� insert �ȴ�. 
INSERT INTO altertest(id) values('java');
INSERT INTO altertest(id) values('jsp');
-- hit �� +1 �����ǵ��� update ���� �����غ���. 
update altertest set hit=hit+1 ;
SELECT * FROM altertest;
-- DDL Alter �� �̿��� ���̺���� altertest2�� �����Ѵ�. 
ALTER TABLE altertest rename to altertest2;
SELECT * FROM altertest2;
-- ALTER �� �̿��� �÷����� �����Ѵ�. 
ALTER TABLE altertest2 rename column hit to count;
SELECT * FROM altertest2;
/*
 * TABLE ���� 
 * ���̺�� : product 
 * �÷��� : id, name, maker, price 
 * ������ Ÿ�� : price �� number �������� varchar2(100)���� 
 * �������� : id �� primary key, name& maker �� not null 
 * 				 price -> default 0
 * id  name     maker   price 
 * a   �ַ���8     �Ｚ      100 
 * b   ������      ����      150 
 * c   �ַ���2     �Ｚ        0
 * 
 * DDL (CREATE) ���� �ۼ��� DML ( insert ) ���� �ۼ� 
 */
create table product(
	id varchar2(100) primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
);
create table 
insert into product(id,name,maker,price) values('a','�ַ���8','�Ｚ',100);
insert into product(id,name,maker,price) values('b','������','����',150);
insert into product(id,name,maker,price) values('c','�ַ���2','�Ｚ',0);
drop table product;
select * from product;
-- �ѻ�ǰ�� ��ȸ 
select count(*) from product;
-- ��ǰ price �� �ְ� 
SELECT MAX(price) from product; 
SELECT MIN(price) from product; 
-- ��� 
SELECT ROUND(AVG(price)) from product;
-- price ������������ ��ǰ���� ��ȸ 
select * from product order by price desc;
-- maker �� �Ｚ�� product �� ������ price ������������ ��ȸ
select * from product where maker='�Ｚ' order by price asc;
-- price �� 100�̻� 150 ������ ��ǰ�� name �� price �� ��ȸ 
select name, price from product where 100<=price and price <=150;
-- �� ������ between ���ε� ���� ���� 
select name, price from product
where price between 100 and 150;
-- ID�� �ش��ϴ� ��ǰ�� �����ϴ��� Ȯ�� 
SELECT COUNT(*) from product where id='a';
--maker �� ������ ��ȸ (�ߺ�����) 
select distinct maker from product;
select * from product;
select count(*) from product
