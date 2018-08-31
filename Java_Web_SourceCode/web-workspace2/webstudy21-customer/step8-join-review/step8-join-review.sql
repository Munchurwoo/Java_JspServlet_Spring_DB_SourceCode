-- inner join review
-- foreign key : ����Ű, �ַ�Ű - ���� ���Ἲ�� ���� ��������
drop table employee;
drop table emp;
drop table department;
-- �θ� ���̺���� �����Ѵ� (��������� �Ǵ� ���̺�)
create table department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)
-- �ڽ� ���̺� (�����ϴ� ���̺�)
create table employee(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_mvc_deptno foreign key(deptno) references department(deptno)
)
-- �θ� department ���̺� �������� �ʴ� �μ���ȣ�� insert �ϹǷ� error
-- foreign key �������ǿ� ���� error �� ����
insert into employee(empno,ename,sal,deptno)
values(1,'������',300,10);

insert into department(deptno,dname,loc,tel) values(10,'������ȹ','�Ǳ�','031');
insert into department(deptno,dname,loc,tel) values(20,'�������','����','02');
insert into department(deptno,dname,loc,tel) values(30,'�ؾ����','�λ�','051');
select count(*) from department;
-- �μ���ȣ�� �����ϹǷ� insert ok 
insert into employee(empno,ename,sal,deptno)
values(1,'������',300,10);
insert into employee(empno,ename,sal,deptno)
values(2,'���¸�',500,30);
insert into employee(empno,ename,sal,deptno)
values(3,'�ں���',600,20);
delete from employee where ename='���¸�';4
insert into employee(empno,ename,sal,deptno) values(empno_seq.nextval);
insert into employee(empno,ename,sal,deptno) values(mvc_emp_seq.nextval,'����',100,20);
-- JOIN SQL ����
select ename,sal,deptno from employee where empno=1;
select dname,loc,tel from department where deptno=10;
-- empno �� 1 �� ����� ename,deptno,dname,loc �� ��ȸ�Ѵ�
-- join sql�� �̿��Ѵ�
/* 
 * select
 * from ���̺�1 ��Ī,���̺�2 ��Ī
 * where ��Ī,�÷���=��Ī.�÷���
 * 
 * �ٸ� �������� ǥ��
 * select
 * from ���̺�1 ��Ī
 * inner join ���̺�2 ��Ī ON ��Ī.�÷���=��Ī.�÷���
 * where ...
 */
select e.ename,d.deptno,d.dname,d.loc
from department d,employee e 
where d.deptno=e.deptno and e.empno=1;


select e.ename,d.deptno,d.dname,d.loc
from employee e
inner join department d on e.deptno=d.deptno
where e.empno=1;



select e.empno,e.ename,e.sal,d.deptno,d.dname,d.loc,d.tel
from department d,employee e
where d.deptno=e.deptno
order by e.empno desc;



















