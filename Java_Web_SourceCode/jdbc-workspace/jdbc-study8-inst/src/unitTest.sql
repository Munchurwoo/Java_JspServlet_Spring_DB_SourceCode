select * from emp;
select * from department;

select min(salary) from emp;
-- join �� subquery�� �̿��� ���� ���� ������ �޴� �����
-- ��������� �μ������� ��ȸ�Ѵ� 
select e.name,e.salary,d.dept_no,d.dname,d.location
from emp e, department d
where e.dept_no=d.dept_no 
and e.salary=(select min(salary) from emp);

select d.dname
from emp e, department d
where e.dept_no=d.dept_no 







