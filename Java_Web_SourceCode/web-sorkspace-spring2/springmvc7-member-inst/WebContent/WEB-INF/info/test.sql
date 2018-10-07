-- 속성 정보 
select * from col where tname='TEST'
-- KEY 정보 조회 
SELECT A.TABLE_NAME, B.COLUMN_NAME, A.CONSTRAINT_TYPE
FROM USER_CONSTRAINTS A, USER_CONS_COLUMNS B
WHERE A.CONSTRAINT_NAME = B.CONSTRAINT_NAME
AND A.TABLE_NAME = 'SPRING_MEMBER'
AND A.CONSTRAINT_TYPE = 'F';

select count(*) from spring_member;
select * from spring_member;
insert into spring_member(id,password,name,address)
values('python','1234','문철우','판교')

SELECT * FROM col WHERE tname='SPRING_MEMBER';  

create table hobby (
	id varchar2(50) not null,
	hobby varchar2(50) not null,
	company varchar2(50) not null,
	constraint fk_id foreign key (id) references spring_member(id)
)

select * from hobby
delete from hobby where id='java'

select m.id, m.name,m.address,h.hobby,h.company
from spring_member m, hobby h
where m.id=h.id






