SELECT min(salary) from emp 

select e.name, e.salary, d.dept_no, d.location
from department d, emp e
WHERE d.dept_no = e.dept_no
and salary=(SELECT min(salary) from emp);

