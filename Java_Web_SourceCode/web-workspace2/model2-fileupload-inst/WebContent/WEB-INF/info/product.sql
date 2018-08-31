drop table semi_product;

create table semi_product(
	pno number primary key,
	name varchar2(100) not null,
	maker varchar2(100) not null,
	picture varchar2(100) not null
)
drop sequence semi_product_seq;
create sequence semi_product_seq ;