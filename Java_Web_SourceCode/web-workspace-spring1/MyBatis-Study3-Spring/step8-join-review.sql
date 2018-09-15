-- inner join review 
-- foreign key : 참조키 , 외래키  - 참조 무결성을 위한 제약조건 
drop table employee;
drop table emp;
drop table department;
-- 부모 테이블부터 생성한다 ( 참조대상이 되는 테이블 ) 
create table department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)
-- 자식 테이블 ( 참조하는 테이블 ) 
create table employee(
	empno number primary key,
	ename varchar2(100) not null,
	sal number not null,
	deptno number not null,
	constraint fk_mvc_deptno foreign key(deptno) references department(deptno)
)
-- 부모 department 테이블에 존재하지 않는 부서번호로 insert 하므로 error
-- foreign key 제약조건에 의해 error 가 난다 
insert into employee(empno,ename,sal,deptno)
values(1,'아이유',300,10);

insert into department(deptno,dname,loc,tel)
values(10,'전략기획','판교','031');
insert into department(deptno,dname,loc,tel)
values(20,'공공사업','종로','02');
insert into department(deptno,dname,loc,tel)
values(30,'해양수산','부산','051');

select count(*) from department;

-- 부서번호가 존재하므로 insert ok
insert into employee(empno,ename,sal,deptno)
values(1,'아이유',300,10);
insert into employee(empno,ename,sal,deptno)
values(2,'김태리',500,10);
insert into employee(empno,ename,sal,deptno)
values(3,'박보검',600,20);

-- JOIN SQL 연습 
select ename,sal,deptno from employee where empno=1;
select dname,loc,tel from department where deptno=10;
-- empno 가 1 인 사원의 ename,deptno,dname,loc 를 조회한다 
-- join sql을 이용한다 
/*	
 *  SELECT 
 *  FROM 테이블1 별칭, 테이블2 별칭 
 *  WHERE 별칭.컬럼명=별칭.컬럼명 
 * 
 *  다른 형식으로 표현 
 *  SELECT 
 *  FROM 테이블1 별칭 
 *  INNER JOIN 테이블2 별칭 ON 별칭.컬럼명=별칭.컬럼명 
 *  WHERE ...
 */
SELECT e.ename,d.deptno,d.dname,d.loc
FROM	employee e,department d
WHERE e.deptno=d.deptno AND e.empno=1;

SELECT e.ename,d.deptno,d.dname,d.loc
FROM employee e
INNER JOIN department d ON e.deptno=d.deptno 
WHERE e.empno=1;

select ename, job, sal from emp where empno=7369;

-- empno 가 7369 인 사원의 사원명과 ename과 salgrade를 조회 
select e.ename, s.grade, e.sal,s.losal, s.hisal
from emp e, SALGRADE s
where e.sal>=s.losal and e.sal<=s.hisal 
and e.empno=7369;



--empno 7566 인 사원의 ename, dname, sal, grade
select e.ename, d.dname, e.sal, s.grade
from emp e, SALGRADE s, dept d
where e.sal>=s.losal and e.sal<=s.hisal 
and e.empno=7566
and e.deptno=d.deptno


select e.ename, d.dname, e.mgr, s.grade
from emp e, SALGRADE s, dept d
where e.sal>=s.losal and e.sal<=s.hisal 
and e.empno=7566
and e.deptno=d.deptno

select e.empno, e.ename, m.empno, m.ename 
from emp e, emp m, dept d
where  e.mgr=m.empno(+) 

select e.ename, d.dname, e.mgr as mgrmanger , s.grade
from emp e, emp m, dept d,SALGRADE s
where e.deptno =d.deptno
and e.mgr=m.empno 
and e.sal>=s.losal 
and e.sal<=s.hisal 
and e.empno=7934  

select e.ename, d.dname
from emp e, dept d 
where e.deptno=d.deptno

select * from emp
select * from dept






