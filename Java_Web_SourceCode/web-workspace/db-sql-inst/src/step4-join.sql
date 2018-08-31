/*  ERD , FK(Foreign Key) , Join SQL 
 * 
 *  ERD ( Entity Relationship Diagram ) 
 *  : 데이터베이스 모델링을 위한 다이어그램 
 *  
 *  사례 )   사원정보를 저장하는 테이블 설계 
 * 			   사원번호, 사원명 , 직종 , 월급 , 부서명 , 부서지역 , 부서tel 등
 * 		
 * 			   실제 데이터 
 * 				1		아이유	 개발		300	 연구개발부  판교	  031 등 .. 
 * 			    2		최요셉    개발      300    연구개발부  판교   031 등 ..
 * 				...
 * 				위와 같이 테이블을 설계하면 사원이 다수일 경우 
 * 				동일한 부서정보(부서명, 지역 , 부서tel ... )가 
 * 				중복되어 저장되어서 관리되는 문제가 있다 
 * 				1) 데이터 중복 -> 자원 소모 
 * 			    2) 데이터 변경시 -> 유연하게 대처할 수 없다 
 * 
 * 				테이블을 분할해서 사원 테이블과 부서 테이블로 정의 
 * 
 * 				부서테이블 |------0|<- 사원테이블 
 * 			
 * 				위와 같이 분리해서 저장할 경우
 * 				데이터의 중복을 제거 ( ex - 부서정보는 한번만 저장 ) 
 * 			 	테이터 변경시 유연하게 대처 
 * 				(ex - 특정부서의 주소가 변경될 경우 부서테이블의 지역정보만
 * 						수정하면 된다 ) 
 * 		
 * 		Foreign Key ( FK ) : 외래키 또는 참조키라고 하고 
 * 								참조무결성을 보장하기 위한 제약조건 
 * 								테이블 간의 연결을 설정하는 키 
 * 						ex)  FK 제약조건을 사원테이블의 부서번호 컬럼에
 * 							 부여하여 
 * 							 사원 정보를 등록할 시점에 
 * 							 부서테이블에 저장되지 않은 부서번호로 
 * 							 등록하려 할 경우 ERROR를 발생시킨다 
 * 							 즉 부서테이블에 저장된 부서번호로만
 * 							 사원 정보가 저장될 수 있도록 한다.  
 * 
 * 
 * 		Master table ( 부모 테이블 ) : 참조대상이 되는 테이블 
 * 		ex) 부서테이블이 사원테이블의 참조대상이 되므로 
 * 			 부모테이블이라고 한다
 *  
 * 		( FK 설정의 예 ) 
 * 		constraint 제약조건명 foreign key(자신의컬럼명)
 *      references 참조테이블(참조키)						
 * 		
 * 
 * 		Join SQL : 여러 테이블의 정보를 결합하기 위한 SQL 
 * 					  ex)   사원 정보 조회시에 	그 사원의 부서 정보까지
 * 							조회하고자 할 때 Join SQL을 사용한다 				
 */
 drop table department;

 create table department(
 	dept_no number primary key,
 	dname varchar2(100) not null,
 	location varchar2(100) not null
 )
 insert into department(dept_no,dname,location) values(1,'개발부','판교');

 drop table employee;
 
 create table employee(
 	emp_no number primary key,
 	name varchar2(100) not null,
 	salary number default 0,
 	dept_no number not null
 )
 -- 정상적인 데이터 저장 
 insert into employee(emp_no,name,salary,dept_no)
 values(1,'아이유',300,1);
 -- 아래 구문은 부서테이블에 존재하지 않는 부서번호로 사원이 등록
 -- 데이터 무결성에 위배 
 insert into employee(emp_no,name,salary,dept_no)
 values(2,'최요셉',900,88);
 
 select * from employee;
 select * from department;
 
 -- 위와 같은 문제를 방지하기 위해 FK 제약조건을 반영한
 -- 사원 테이블 정의
  create table emp(
 	emp_no number primary key,
 	name varchar2(100) not null,
 	salary number default 0,
 	dept_no number not null,
 	constraint fk_deptno foreign key(dept_no) references department(dept_no)
 )
 -- constraint 제약조건명 foreign key(자신의컬럼명) references 참조테이블(참조키)
  -- 정상적인 데이터 저장 
 insert into emp(emp_no,name,salary,dept_no)
 values(1,'아이유',300,1);
 -- 아래 구문은 부서테이블에 존재하지 않는 부서번호로
 -- 사원이 등록되려 시도하나 ERROR ( FK 제약조건에 의해 ) 
 -- 데이터 무결성에 위배되어 INSERT 되지 않는다  
 insert into emp(emp_no,name,salary,dept_no)
 values(2,'최요셉',900,88);
 -- 정상적인 데이터 
  insert into emp(emp_no,name,salary,dept_no)
  values(2,'최요셉',900,1);
  
 select * from emp;
 select * from department;
 
 -- 아이유 사원이 근무하는 부서의 부서명과 지역을 사원정보와 함께
 -- 조회하고자 한다 
 -- Join SQL : 여러 테이블을 결합하기 위한 SQL 
 /*	 SELECT  별칭.컬럼명, 별칭.컬럼명 , 별칭.컬럼명 
  *  FROM	테이블명 별칭,테이블명 별칭 
  *  WHERE 	별칭.컬럼명=별칭.컬럼명 -- 조인조건 	
  */
 SELECT	e.emp_no,e.name,e.salary,e.dept_no,d.dept_no,d.dname,d.location
 FROM		department d , emp e 
 WHERE d.dept_no=e.dept_no 
 AND 	e.name='아이유'
 
 insert into department(dept_no,dname,location)
 values(2,'영업부','가산');
 
  insert into emp(emp_no,name,salary,dept_no)
  values(3,'박보검',600,2);
 
 
 
 
 
 

















