/*
 * DATE date type : �ð� ������ ������ �� ����ϴ� ������ Ÿ��
 * sysdate : ���� �ð��� ���� 
 * to_date() : �������� date ������ ��ȯ�ϴ� �Լ� 
 * to_char() : date ���� ���������� ��ȯ�ϴ� �Լ� 
 * -- ����Ŭ���� �����ϴ� �⺻ ���̺� dual �� �̿��ؼ� sysdate�� �׽�Ʈ  
 */
select sysdate from dual;
-- to_char()�� �̿��� ��ȸ�� ���ϴ� �ð� ������ ������ �����ͷ� ��ȯ 
select to_char(sysdate,'yyyy.MM.DD') from dual;
select to_char(sysdate,'yyyy.MM.DD HH24:MI:SS') from dual;
--table �� �����ؼ� �׽�Ʈ 
create table date_test(
	id varchar2(100) primary key,
	reg_date date not null
)
insert into date_test(id,reg_date) values('a',sysdate);
select * from date_test
select id,to_char(reg_date,'yyyy/mm/dd') from date_test;
select id,to_char(reg_date,'yyyy/mm/dd hh24:mi:ss') from date_test;

insert into date_test(id,reg_date) 
values('b',to_date('2018.7.14','yyyy.mm.dd'));

select * from date_test
insert into date_test(id,reg_date) 
values('c',to_date('2018.7.14 4:20:30','yyyy.mm.dd hh24:mi:ss'));

--�ð� ���� ���� 
select id,reg_date,reg_date-1 from date_test;
--���� �ð��� ���� �ð��� �ϼ��� Ȯ�� 
select id,reg_date,sysdate-reg_date from date_test;
-- �Ҽ��� ���� ������ trunc()
select id,reg_date,trunc(sysdate-reg_date) from date_test;
--�� ������ ���������� Ȯ�� 
insert into date_test(id,reg_date) 
values('d',to_date('2000.7.14','yyyy.mm.dd'));
-- months_between(����ð�, ��Ͻð�) : ��� �������� ��ȸ 
select id, trunc(months_between(sysdate,reg_date)) from date_test;
select id, trunc(months_between(sysdate,reg_date)/12) from date_test;

