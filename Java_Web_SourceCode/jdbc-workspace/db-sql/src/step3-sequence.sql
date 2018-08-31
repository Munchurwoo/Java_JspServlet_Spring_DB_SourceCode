/*
	����Ŭ ������ 
	: ������ ���� �ڵ� �����ϴ� ����Ŭ ��ü
	�ַ� primary key �ڵ� ������ ���� ����Ѵ�. 
	ex ) ��ǰ �Ϸ� ��ȣ 
*/
-- ������ ���� 
create sequence test_seq;
drop sequence test_seq;
-- ����Ŭ���� �����ϴ� �⺻ ���̺� dual(�÷� �ϳ��� ����)
-- �ַ� �Լ� �� ������ ����� �� �̿��Ѵ�. 
-- �������� ���� ���� ��ȸ 
select test_seq.nextval from dual;

-- car table ���� 
create table car (
	car_no number primary key,
	model varchar2(100) not null
);
-- car_no �� ������ �����ؼ� �ڵ����� ������ ���� �����Ͽ� �����ϵ��� �Ѵ�. 
create sequence car_seq;
insert into car(car_no,model) values(car_seq.nextval,'bmw');
insert into car(car_no,model) values(car_seq.nextval,'tico');

select * from car;
-- product table�� sequence�� �����ؼ� ��ǰ���̵� �ڵ����� ����
drop table jdbc_product;
create table jdbc_product(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
);
-- ������ ���� 
drop sequence jdbc_product_seq;
create sequence jdbc_product_seq;

-- 1  ��8 �Ｚ 100
insert into jdbc_product (id,name,maker,price) values (jdbc_product_seq.nextval, '�ַ���9', '�Ｚ', 100);
insert into jdbc_product (id,name,maker,price) values (jdbc_product_seq.nextval, '�ַ���7', 'lg', 150);
select * from jdbc_product;
select id,name,maker,price-(price*(10/100)) from JDBC_PRODUCT;
-- �������� ���� ���� ��ȸ 
select jdbc_product_seq.nextval from dual;
-- �������� ���� ���� ��ȸ 
-- �������� currval �� �ڽ��� nextval �� ���ؼ� �������� ��� ���� 
-- �� ������ ���ǳ������� ��밡�� 
-- �����̶� ����� ���������� �������� �����ϴ� ����� ���Ѵ�.
select jdbc_product_seq.currval from dual;




