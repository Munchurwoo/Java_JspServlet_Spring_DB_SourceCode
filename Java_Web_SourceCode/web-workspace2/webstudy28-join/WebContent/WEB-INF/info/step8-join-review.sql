-- inner join review
-- foreign key : 참조키, 왜래키 - 참조 무결성을 위한 제약조건
drop table employee;
drop table emp;
drop table department;
-- 부모 테이블부터 생성한다 (참조대상이 되는 테이블)
create table department(
	deptno number primary key,
	dname varchar2(100) not null,
	loc varchar2(100) not null,
	tel varchar2(100) not null
)
-- 자식 테이블 (참조하는 테이블)
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

insert into department(deptno,dname,loc,tel) values(10,'전략기획','판교','031');
insert into department(deptno,dname,loc,tel) values(20,'공공사업','종로','02');
insert into department(deptno,dname,loc,tel) values(30,'해양수산','부산','051');
select count(*) from department;
-- 부서번호가 존재하므로 insert ok 
insert into employee(empno,ename,sal,deptno)
values(1,'아이유',300,10);
insert into employee(empno,ename,sal,deptno)
values(2,'김태리',500,30);
insert into employee(empno,ename,sal,deptno)
values(3,'박보검',600,20);
delete from employee where ename='김태리';4
insert into employee(empno,ename,sal,deptno) values(empno_seq.nextval);
insert into employee(empno,ename,sal,deptno) values(mvc_emp_seq.nextval,'김김김',100,20);
-- JOIN SQL 연습
select ename,sal,deptno from employee where empno=1;
select dname,loc,tel from department where deptno=10;
-- empno 가 1 인 사원의 ename,deptno,dname,loc 를 조회한다
-- join sql을 이용한다
/* 
 * select
 * from 테이블1 별칭,테이블2 별칭
 * where 별칭,컬럼명=별칭.컬럼명
 * 
 * 다른 형식으로 표현
 * select
 * from 테이블1 별칭
 * inner join 테이블2 별칭 ON 별칭.컬럼명=별칭.컬럼명
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



















