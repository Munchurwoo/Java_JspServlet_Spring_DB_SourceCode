/*
	오라클 시퀀스 
	: 유일한 값을 자동 생성하는 오라클 객체
	주로 primary key 자동 생성을 위해 사용한다. 
	ex ) 상품 일련 번호 
*/
-- 시퀀스 생성 
create sequence test_seq;
drop sequence test_seq;
-- 오라클에서 제공하는 기본 테이블 dual(컬럼 하나로 구성)
-- 주로 함수 및 시퀀스 사용할 때 이용한다. 
-- 시퀀스의 다음 값을 조회 
select test_seq.nextval from dual;

-- car table 생성 
create table car (
	car_no number primary key,
	model varchar2(100) not null
);
-- car_no 를 시퀀스 생성해서 자동으로 유일한 값을 생성하여 저장하도록 한다. 
create sequence car_seq;
insert into car(car_no,model) values(car_seq.nextval,'bmw');
insert into car(car_no,model) values(car_seq.nextval,'tico');

select * from car;
-- product table에 sequence를 적용해서 상품아이디를 자동으로 생성
drop table jdbc_product;
create table jdbc_product(
	id number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
);
-- 시퀀스 생성 
drop sequence jdbc_product_seq;
create sequence jdbc_product_seq;

-- 1  갤8 삼성 100
insert into jdbc_product (id,name,maker,price) values (jdbc_product_seq.nextval, '겔럭시9', '삼성', 100);
insert into jdbc_product (id,name,maker,price) values (jdbc_product_seq.nextval, '겔럭시7', 'lg', 150);
select * from jdbc_product;
select id,name,maker,price-(price*(10/100)) from JDBC_PRODUCT;
-- 시퀀스의 다음 값을 조회 
select jdbc_product_seq.nextval from dual;
-- 시퀀스의 현재 값을 조회 
-- 시퀀스의 currval 는 자신이 nextval 한 컨넥션 내에서만 사용 가능 
-- 즉 동일한 세션내에서만 사용가능 
-- 세션이란 사용자 상태정보를 서버에서 유지하는 기술을 말한다.
select jdbc_product_seq.currval from dual;




