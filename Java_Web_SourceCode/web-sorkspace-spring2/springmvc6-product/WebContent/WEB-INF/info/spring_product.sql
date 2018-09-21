drop table spring_product;

create table spring_product(
	product_no number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number default 0
)

create sequence spring_product_seq;

insert into SPRING_PRODUCT(PRODUCT_no,name,maker,price)
values(spring_product_seq.nextval,'겔럭시8','삼성',150)

insert into SPRING_PRODUCT(PRODUCT_no,name,maker,price)
values(spring_product_seq.nextval,'아이폰','애플',200)
select * from SPRING_PRODUCT