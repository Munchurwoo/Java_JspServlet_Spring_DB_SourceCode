/*
 		SQL : Structured Query Language �����ͺ��̽� ���� ��� 
 		
 		SQL �ּ� ������ --  �������� /*   */ 
 		
 		DML : Data Manipulation Language - CRUD  
 				insert ���� ���� Create 
 				select ���� ��ȸ Read 
 				update ���� ���� Update 
 				delete ���� ���� Delete 
 					 
 		DDL : Data Definition Language 
 				create ���̺� ���� 
 				drop ���̺� ���� 
 				alter ���̺� ���� ���� 
 		DCL : Data Control Language
 			    commit : ������ ���� db�� ���� 
 			    rollback : �۾��� ��� 
 			    
 		Database ���� �⺻ ��� 
 		table : �����͸� �����ϴ� ���� 
 		column : ���̺� �� �Ӽ� 
 		datatype : ������ Ÿ��   
 					ex) ����Ŭ ���ڿ�Ÿ�� varchar2(100)	
 						 ����Ŭ ����Ÿ�� number 
 		constraints : �������� 
 					  ex) primary key - ��Ű,�⺻Ű,pk��� �� ( unique + not null )
 					  	   not null - ������ �ݵ�� �����ؾ� ���尡��  
 					  				     
 */
-- CREATE TABLE :  member ���̺��� �����Ѵ� 
-- sql ���� ����Ű�� ������ ������ �� alt + x 
CREATE TABLE member(
	id VARCHAR2(100) PRIMARY KEY,
	password VARCHAR2(100) NOT NULL,
	name VARCHAR2(100) NOT NULL,
	address VARCHAR2(100)
);
-- DROP TABLE
-- ���̺� ���� 
DROP TABLE member;
-- INSERT 
-- ������ �����ؼ� ���� 
INSERT INTO member(id,password,name,address) 
VALUES('java','1234','������','�Ǳ�');

INSERT INTO member(id,password,name,address) 
VALUES('jdbc','abcd','������','����');
-- SELECT 
-- ��ȸ 
SELECT * FROM member;
-- ���̺��� Ư�� �÷�( id,name ) �� ��ȸ 
SELECT id,name FROM member;
-- ��ȸ�� ������ �ο� ( where �� ) 
-- ���簡 address �� member�� name�� ��ȸ 
SELECT name FROM member WHERE address='����';
-- name�� �������̰� address�� �Ǳ��� member�� id�� ��ȸ 
SELECT id FROM member WHERE name='������' AND address='�Ǳ�';

-- id : html , password : kosta , name : �ֿ�� , address : �Ǳ� 
-- �� ������ member table�� �����ϼ��� 
INSERT INTO member(id,password,name,address)
VALUES('html','kosta','�ֿ��','�Ǳ�');

-- ����Ŭ �Լ��� count(*) �̿��� ��ȸ������ ��ȸ 
SELECT COUNT(*) FROM member;
 
-- ���� update ���� 
UPDATE member SET address='�Ͽ���' WHERE name='�ֿ��';

SELECT * FROM member;
-- id�� jdbc �̰� password �� abcd �� member�� address�� �Ͽ��̷� ���� 
UPDATE member SET address='�Ͽ���' WHERE id='jdbc' and password='abcd';

-- ���� delete ���� 
-- address�� �Ͽ����� member ������ ��� ���� 
DELETE FROM member WHERE address='�Ͽ���';

SELECT COUNT(*) FROM member;
SELECT * FROM member;

-- �������� primary key �׽�Ʈ 
-- primary key�� ������ ���̺� �󿡼� �����ؾ� �ϰ�
-- not null �� �����ؾ��Ѵ� 
INSERT INTO member(id,password,name,address) 
VALUES('java','4321','�ں���','�Ǳ�'); -- error pk�� �����ؾ� �ϹǷ� 
-- �Ʒ� SQL ���� ERROR , ����: pk�� �ݵ�� ������ �Է��ؾ� �Ѵ� 
INSERT INTO member(password,name,address)
VALUES('4422','�ں���','�Ǳ�');
-- �Ʒ��� �������, address�� ������ ���������� �����Ƿ� null ��� 
INSERT INTO member(id,password,name)
VALUES('park','4422','�ں���');

DROP TABLE member;
SELECT * FROM member;

DELETE FROM MEMBER WHERE ID='java2';
















