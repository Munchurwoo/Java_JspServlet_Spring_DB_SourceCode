/* 		����Ŭ ������ 
		 : ������ ���� �ڵ� �����ϴ� ����Ŭ ��ü 
		   �ַ� primary key �ڵ� ������ ���� ����Ѵ� 
		   ex) ��ǰ �Ϸ� ��ȣ , �Խù� ��ȣ 
*/
 -- ������ ���� 
create sequence test_seq;
-- ������ ���� 
drop sequence test_seq;

-- ����Ŭ���� �����ϴ� �⺻ ���̺� dual ( �÷� �ϳ��� ���� )
-- �ַ� �Լ� �� ������ ����� �� �̿��Ѵ� 
-- �������� ���� ���� ��ȸ 
select test_seq.nextval from dual; 

-- car table ���� 
create table car(
	car_no number primary key,
	model varchar2(100) not null
)
-- car_no �� ������ �����ؼ� �ڵ����� ���ϰ��� �����Ͽ� �����ϵ��� �Ѵ�
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
)
-- ������ ���� 
create sequence jdbc_product_seq;
-- ������ ���� 
drop sequence jdbc_product_seq;
-- 1    ��8	�Ｚ  100
insert into jdbc_product(id,name,maker,price)
values(jdbc_product_seq.nextval,'��8','�Ｚ',100);
select * from jdbc_product;
-- �������� ���� ���� ��ȸ 
select jdbc_product_seq.nextval from dual;
-- �������� ���� ���� ��ȸ 
-- �������� currval ��  �ڽ��� nextval �� ���ؼ� �������� ��� ���� 
-- �� ������ ���ǳ������� ��밡���ϴ�.
-- �����̶� ����� ���������� �������� �����ϴ� ����� ���Ѵ� 
select jdbc_product_seq.currval from dual;

-- ����-(����*10/100)
select price as ����,price-(price*10/100) as ���ΰ� from jdbc_product;
-- ���ΰ� sql 
select id,name,maker,price-(price*10/100) from jdbc_product order by price desc;

















