/*
 		SQL : Structured Query Language �����ͺ��̽� ���� ��� 
 		SQL : �ּ� ������ -- �������� /* */ 
 		
 		DML : Data Manipulation Language
 		 
 		insert ���� ���� create 
 		select ���� ��ȸ read 
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
		column : �׺��� �� �Ӽ� 
		datatype : ������ Ÿ�� 
					ex ) ����Ŭ ���ڿ� Ÿ�� varchar2(100)
						  ����Ŭ ����Ÿ�� number 
		constraints : �������� 
					ex ) primary key - ��Ű ( unique + not null )
						  not null - ������ �ݵ�� �����ؾ� ���尡�� 
		
 * */
-- member ���̺��� �����Ѵ�.
-- sql ���� ����Ű�� ������ ������ �� alt + x 
CREATE TABLE member(
	id varchar2(100) PRIMARY KEY,
	password varchar2(100) not null,
	name varchar2(100) not null,
	address varchar2(100)
);

-- ��ȸ 
SELECT *FROM member;

-- ��� 
DROP TABLE member;

-- ������ �����ؼ� ���� 
INSERT INTO MEMBER(id, password, name, address)
VALUES('java','1234','������','�Ǳ�');
INSERT INTO MEMBER(id, password, name, address)
VALUES('jdbc','1234','������','����');

-- ���̺��� Ư�� �÷�( name ) �� ��ȸ 
select name from member;
select id, name from member;
-- ��ȸ�� ������ �ο� 
-- ���簡 address �� member �� name �� ��ȸ 
select name from MEMBER where address='����';
-- name �� �������̰� address�� �Ǳ��� member�� id �� ��ȸ 
select id from MEMBER where name='������' and address='�Ǳ�';

-- id : html , password : kosta , name : �ֿ�� address : �Ǳ� 
insert into MEMBER(id,password,name,address)
values ('html','kosta','�ֿ��','�Ǳ�')

-- ����Ŭ �Լ��� �̿��ؼ� (count(*) ��ȸ������ ��ȸ 
select count(*) from member;

-- ���� update ���� 
update member set id='�ٲ۰Ŵ�',address='�Ͽ���' where name='������';
select * from member;
-- id�� jdbc �̰� password �� abcd �� member�� address �� �Ͽ��̷� ���� 
update member set address='�Ͽ���' where  id='jdbc' and password='abcd' 
--���� delect ���� 
-- address �� �Ͽ����� member  ������ ��� ���� 
delete from member where address='�Ͽ���';
select count(*) from member;
select * from MEMBER;

--�������� primary key �׽�Ʈ 
--primary key �� ������ ���̺� �󿡼� �����ؾ� �ϰ� not null �� �����ؾ� �Ѵ�. 
insert into member(id, password,name,address) values('java','4321','�ں���','�Ǳ�'); --error pk �� �����ؾ� �ϹǷ� 
-- �Ʒ� sql ���� error , ���� : pk�� �ݵ�� ������ �Է��ؾ� �Ѵ�. 
insert into member(password,name,address) values('4422','�ں���','�Ǳ�');
insert into member(id,password,name) values('park','4422','������');

drop table member;
select * from MEMBER;
update member set name='���μ�',id='�ٲ۰Ŵ�',address='�Ͽ���' where name='������';













