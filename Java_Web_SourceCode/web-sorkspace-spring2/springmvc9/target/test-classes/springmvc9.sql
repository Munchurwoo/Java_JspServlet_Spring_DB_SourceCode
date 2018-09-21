select * from dept;
select count(*) from dept;
select count(*) from emp
		select empNo  from emp
select e.empno, e.ename, e.job, e.deptno, d.dname,d.loc
		from emp e, dept d
		where e.deptno=d.deptno
		and e.empno=7369