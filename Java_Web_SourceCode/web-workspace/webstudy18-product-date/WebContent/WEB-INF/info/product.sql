create table model2_product(
	pno number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null,
	regdate date not null
)

create sequence model2_product_seq nocache;
select * from model2_product;
insert into model2_product(pno,name,maker,price,regdate)
values(model2_product_seq.nextval,'손가방','LG',400,sysdate);