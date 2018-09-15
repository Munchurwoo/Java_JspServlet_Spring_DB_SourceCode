/* Join SQL : 하나 이상의 테이블을 결합하여 정보를 조회 
 * inner Join : 교집합 - 상응하는 컬럼이 있을 때 
 * Outer Join : 합집합 - 테이블간의 상응하는 않는 정보까지 모두 조회 
 * Self Join : 하나의 테이블에서 자체적으로 조언
 */

--outer Join 사례
--부서는 10, 20, 30, 40 번 부서가 있고 
--사원은 10, 20, 30 부서에 속해있다.
--사원과 부서 정보를 결합하여 조회시에 (join) 
--이 때 현재 사원이 없는 부서 정보까지 모두 조회하고자 할 때 
--Outer Join 을 이용한다. 
select * from dept;
select ename, deptno from emp order by deptno asc
-- 사원은 10, 20, 30번 부서에 속해 있다. 
select * from emp where empno=7369

select e.ename , d.deptno, d.dname
from emp e, dept d 
where e.deptno=d.deptno 
order by d.deptno asc

-- 위의 INNER JOIN 은 사원이 없는 40번 부서 정보는 조회되지 않는다.
-- 사원이 없는 부서정보까지 모두 조회하고자 한다면 OuterJoin 을 이용한다. 
-- join 조건에 Outer Join 표기인 (+) 를 명시한다. 
-- (+) 는 조인시킬 정보가 없는 측에 명시하면 된다. 
-- 아래 경우는 부서는 존재하고 사원이 없는 경우이므로 사원 측에 outer join 표기를 명시하면 된다.
select e.ename , d.deptno, d.dname
from emp e, dept d 
where e.deptno(+)=d.deptno 
order by d.deptno asc

--다른 표현으로 Outer join 을 정의 
--Left Outer Join : 왼쪽 테이블의 정보는 조건에 부합하지 않아도 모두 결합 

select e.ename , d.deptno, d.dname
from dept d 
LEFT OUTER JOIN emp e 
ON d.deptno = e.deptno 
order by d.deptno asc

--Right Outer join 
select e.ename , d.deptno, d.dname
from dept d 
Right OUTER JOIN emp e 
ON d.deptno = e.deptno 
order by d.deptno asc

/*
 * self Join : 테이블 자체에서 조인
 * 사례 ) emp 사원 테이블의 empno 사원번호 와 mgr 의 관계에서 
 * mgr 은 또 다른 사원의 empno 즉 사원번호이다. 
 * 트정 사원의 사원 정보 및 매너저의 정보를 모두 조회하고자 할 때 self join 을 이용하면 된다. 
 */ 
select empno, ename, mgr from emp where empno=7369;
-- 7369 사원의 매니저 번호는 7902
select ename from emp where empno=7902
-- 7902 사원 매니저 이름은 FORD 이다. 

--현재 사원들의 사원번호, 사원명과 매니저번호, 매니저명을 조회 
select e.empno, e.ename, m.empno, m.ename 
from emp e, emp m
where  e.mgr=m.empno 

--총 사원수는 14명 , 위의 self join sql 결과는 13명이다. 
--이유는 매니저가 없을  때 inner join 에서 제외되기 때문이다. 
--매니저가 없는 사원까지 모두 조회하고자 하다면 
select count(*) from emp

select e.empno, e.ename, m.empno, m.ename 
from emp e, emp m
where  e.mgr=m.empno(+) 









