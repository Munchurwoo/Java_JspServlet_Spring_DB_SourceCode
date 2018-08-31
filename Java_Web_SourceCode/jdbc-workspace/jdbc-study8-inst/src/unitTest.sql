select * from emp;
select * from department;

select min(salary) from emp;
-- join 과 subquery를 이용해 가장 낮은 월급을 받는 사원의
-- 사원정보와 부서정보를 조회한다 
select e.name,e.salary,d.dept_no,d.dname,d.location
from emp e, department d
where e.dept_no=d.dept_no 
and e.salary=(select min(salary) from emp);

select d.dname
from emp e, department d
where e.dept_no=d.dept_no 







