/*
 * ERD, FK(Foreign Key) , join SQL 
 * ERD (Entity Relationship Diagram )
 * : �����ͺ��̽� �𵨸��� ���� ���̾�׷� 
 * ���) ��������� �����ϴ� ���̺� ���� 
 * 		   �����ȣ, �����, ����, ����, �μ���, �μ�����, �μ�tel
 * 
 * 			���� ������ 
 * 			1. ������    ����	300	�������ߺ�	�Ǳ�	013
 * 			2. �ֿ��    ����	300	�������ߺ�	�Ǳ�	031
 * 			
 * 			���� ���� ���̺��� �����ϸ� ����� �ټ��� ��� 
 * 			������ �μ�����(�μ���, ����, �μ� tel .. ) ��
 * 			�ݺ������� ����Ǿ� �����Ǵ� ������ �ִ�. 
 * 			1. ������ �ߺ� -> �ڿ� �Ҹ� 
 * 			2. ������ ����� -> �����ϰ� ��ó�� �� ����. 
 * 			
 * 			���̺��� ��Ȱ�ؼ� ��� ���̺�� �μ� ���̺�� ���� 
 * 			�μ����̺� |----0|<- ��� ���̺� 
 * 			���� ���� �и��ؼ� ������ ��� ������ �ߺ��� ���� 
 * 			(ex - �μ������� �ѹ��� ���� )
 * 			������ ����� �����ϰ� ��ó 
 * 			(ex - Ư���μ��� �ּҰ� ����� ��� �μ����̺��� ���������� �����ϸ� �ȴ�. )
 * 			
 * 			Foreign key ( FK ) : �ܷ�Ű �Ǵ� ����Ű�� �ϰ� 
 * 										���� ���Ἲ�� �����ϱ� ���� �������� 			
 * 										���̺��� ������ ���� 
 * 			EX) FK ���� ������ ������̺��� �μ���ȣ �÷��� �ο��Ͽ� ��� ������ 
 * 			����� ������ �μ����̺� ������� ���� �μ���ȣ�� ����Ϸ� �� ��� ERROR�� �߻���Ų��.
 * 			�� �μ����̺� ����� �μ���ȣ�θ� ��� ������ ����� �� �ֵ��� �Ѵ�.
 * 			Master table ( �θ����̺� ) : ���� ����� �Ǵ� ���̺� 
 * 			constraint fk_deptno foreign key(dept_no) references department(dept_no)
 *			Join SQL  : ���� ���̺��� ������ �����ϱ� ���� SQL 
 *			EX ) ��� ���� ��ȸ�ÿ� �� ����� �μ� �������� ��ȸ�ϰ��� �� �� Join SQL ��� 
 */
DROP TABLE DEPARTMENT;
CREATE TABLE DEPARTMENT(
	dept_no number primary key,
	dname varchar2(100) not null,
	location varchar2(100) not null
	)

insert into department(dept_no,dname,location) values(1,'���ߺ�','�Ǳ�')

drop table employee;
create table employee(
	emp_no number primary key,
	name varchar2(100) not null,
	salary number default 0,
	dept_no number not null
)
-- �������� ������ 
insert into employee(emp_no, name,salary,dept_no) values(1,'������',300,1)
-- �Ʒ� ������ �μ����̺� �������� �ʴ� �μ���ȣ�� ����� ��� 
insert into employee(emp_no, name,salary,dept_no) values(2,'�ֿ��',900,2)

select * from employee, department

-- ���� ���� ������ �����ϱ� ���� FK ���������� �ݿ��� ��� ���̺� ���� 
create table emp(
	emp_no number primary key,
	name varchar2(100) not null,
	salary number default 0,
	dept_no number not null,
	constraint fk_deptno foreign key(dept_no) references department(dept_no)
)

-- constraint �������Ǹ� foreign key(�ڽ��� �÷���) references �������̺�(����Ű)

-- �������� ������ 
insert into emp(emp_no, name,salary,dept_no) values(1,'������',300,1)
-- �Ʒ� ������ �μ����̺� �������� �ʴ� �μ���ȣ�� ����� ��� �õ��Ϸ� 
-- �ϳ� error (FK �������ǿ� ���� ) ������ ���Ἲ�� ����Ǿ� INSERT ���� �ʴ´�.
insert into emp(emp_no, name,salary,dept_no) values(2,'�ֿ��',900,2)
-------------------------------------------------------------
insert into emp(emp_no, name,salary,dept_no) values(2,'�ֿ��',900,1)

SELECT * FROM EMP;
-- ������ ����� �ٹ��ϴ� �μ��� �μ���� ������ ��������� �Բ� ��ȸ�ϰ��� �Ѵ�. 
-- JOIN SQL : ���� ���̺� ���� �ϱ� ���� SQL 
/*
 * SELECT ��Ī.�÷���, ��Ī.�÷���, ��Ī.�÷��� 
 * FROM ���̺�� ��Ī, ���̺�� ��Ī 
 * WHERE ��Ī.�÷���=��Ī.�÷��� - �������� 
 * 
 */
SELECT e.emp_no, e.name, e.salary, d.dept_no,d.location 
FROM department d, emp e  
WHERE d.dept_no = e.dept_no
AND e.emp_no=2

INSERT INTO department(dept_no,dname,location) values(2,'������','����')
insert into emp(emp_no, name,salary,dept_no) values(3,'�ں���',600,2)

