/*  ERD , FK(Foreign Key) , Join SQL 
 * 
 *  ERD ( Entity Relationship Diagram ) 
 *  : �����ͺ��̽� �𵨸��� ���� ���̾�׷� 
 *  
 *  ��� )   ��������� �����ϴ� ���̺� ���� 
 * 			   �����ȣ, ����� , ���� , ���� , �μ��� , �μ����� , �μ�tel ��
 * 		
 * 			   ���� ������ 
 * 				1		������	 ����		300	 �������ߺ�  �Ǳ�	  031 �� .. 
 * 			    2		�ֿ��    ����      300    �������ߺ�  �Ǳ�   031 �� ..
 * 				...
 * 				���� ���� ���̺��� �����ϸ� ����� �ټ��� ��� 
 * 				������ �μ�����(�μ���, ���� , �μ�tel ... )�� 
 * 				�ߺ��Ǿ� ����Ǿ �����Ǵ� ������ �ִ� 
 * 				1) ������ �ߺ� -> �ڿ� �Ҹ� 
 * 			    2) ������ ����� -> �����ϰ� ��ó�� �� ���� 
 * 
 * 				���̺��� �����ؼ� ��� ���̺�� �μ� ���̺�� ���� 
 * 
 * 				�μ����̺� |------0|<- ������̺� 
 * 			
 * 				���� ���� �и��ؼ� ������ ���
 * 				�������� �ߺ��� ���� ( ex - �μ������� �ѹ��� ���� ) 
 * 			 	������ ����� �����ϰ� ��ó 
 * 				(ex - Ư���μ��� �ּҰ� ����� ��� �μ����̺��� ����������
 * 						�����ϸ� �ȴ� ) 
 * 		
 * 		Foreign Key ( FK ) : �ܷ�Ű �Ǵ� ����Ű��� �ϰ� 
 * 								�������Ἲ�� �����ϱ� ���� �������� 
 * 								���̺� ���� ������ �����ϴ� Ű 
 * 						ex)  FK ���������� ������̺��� �μ���ȣ �÷���
 * 							 �ο��Ͽ� 
 * 							 ��� ������ ����� ������ 
 * 							 �μ����̺� ������� ���� �μ���ȣ�� 
 * 							 ����Ϸ� �� ��� ERROR�� �߻���Ų�� 
 * 							 �� �μ����̺� ����� �μ���ȣ�θ�
 * 							 ��� ������ ����� �� �ֵ��� �Ѵ�.  
 * 
 * 
 * 		Master table ( �θ� ���̺� ) : ��������� �Ǵ� ���̺� 
 * 		ex) �μ����̺��� ������̺��� ��������� �ǹǷ� 
 * 			 �θ����̺��̶�� �Ѵ�
 *  
 * 		( FK ������ �� ) 
 * 		constraint �������Ǹ� foreign key(�ڽ����÷���)
 *      references �������̺�(����Ű)						
 * 		
 * 
 * 		Join SQL : ���� ���̺��� ������ �����ϱ� ���� SQL 
 * 					  ex)   ��� ���� ��ȸ�ÿ� 	�� ����� �μ� ��������
 * 							��ȸ�ϰ��� �� �� Join SQL�� ����Ѵ� 				
 */
 drop table department;

 create table department(
 	dept_no number primary key,
 	dname varchar2(100) not null,
 	location varchar2(100) not null
 )
 insert into department(dept_no,dname,location) values(1,'���ߺ�','�Ǳ�');

 drop table employee;
 
 create table employee(
 	emp_no number primary key,
 	name varchar2(100) not null,
 	salary number default 0,
 	dept_no number not null
 )
 -- �������� ������ ���� 
 insert into employee(emp_no,name,salary,dept_no)
 values(1,'������',300,1);
 -- �Ʒ� ������ �μ����̺� �������� �ʴ� �μ���ȣ�� ����� ���
 -- ������ ���Ἲ�� ���� 
 insert into employee(emp_no,name,salary,dept_no)
 values(2,'�ֿ��',900,88);
 
 select * from employee;
 select * from department;
 
 -- ���� ���� ������ �����ϱ� ���� FK ���������� �ݿ���
 -- ��� ���̺� ����
 drop table emp
 --
  create table emp(
 	emp_no number primary key,
 	name varchar2(100) not null,
 	salary number default 0,
 	dept_no number not null,
 	constraint fk_deptno foreign key(dept_no) references department(dept_no)
 )
 -- constraint �������Ǹ� foreign key(�ڽ����÷���) references �������̺�(����Ű)
  -- �������� ������ ���� 
 insert into emp(emp_no,name,salary,dept_no)
 values(1,'������',300,1);
 -- �Ʒ� ������ �μ����̺� �������� �ʴ� �μ���ȣ��
 -- ����� ��ϵǷ� �õ��ϳ� ERROR ( FK �������ǿ� ���� ) 
 -- ������ ���Ἲ�� ����Ǿ� INSERT ���� �ʴ´�  
 insert into emp(emp_no,name,salary,dept_no)
 values(2,'�ֿ��',900,88);
 -- �������� ������ 
  insert into emp(emp_no,name,salary,dept_no)
  values(2,'�ֿ��',900,1);
  
 select * from emp;
 select * from department;
 
 -- ������ ����� �ٹ��ϴ� �μ��� �μ���� ������ ��������� �Բ�
 -- ��ȸ�ϰ��� �Ѵ� 
 -- Join SQL : ���� ���̺��� �����ϱ� ���� SQL 
 /*	 SELECT  ��Ī.�÷���, ��Ī.�÷��� , ��Ī.�÷��� 
  *  FROM	���̺�� ��Ī,���̺�� ��Ī 
  *  WHERE 	��Ī.�÷���=��Ī.�÷��� -- �������� 	
  */
 SELECT	e.emp_no,e.name,e.salary,e.dept_no,d.dept_no,d.dname,d.location
 FROM		department d , emp e 
 WHERE d.dept_no=e.dept_no 
 AND 	e.name='������'
 
 insert into department(dept_no,dname,location)
 values(2,'������','����');
 
  insert into emp(emp_no,name,salary,dept_no)
  values(3,'�ں���',600,2);
 
 
 
 
 
 

















