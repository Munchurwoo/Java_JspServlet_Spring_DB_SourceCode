create table model2_product(
	pno number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	price number not null,
	regdate date not null
)
create sequence model2_product_seq nocache;