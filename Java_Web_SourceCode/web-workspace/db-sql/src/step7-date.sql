/*
 * DATE date type : 시간 정보를 저장할 때 사용하는 데이터 타입
 * sysdate : 현재 시간이 저장 
 * to_date() : 문자형을 date 형으로 변환하는 함수 
 * to_char() : date 형을 문자형으로 변환하는 함수 
 * -- 오라클에서 제공하는 기본 테이블 dual 을 이용해서 sysdate를 테스트  
 */
select sysdate from dual;
-- to_char()를 이용해 조회시 원하는 시간 포맷의 문자형 데이터로 반환 
select to_char(sysdate,'yyyy.MM.DD') from dual;
select to_char(sysdate,'yyyy.MM.DD HH24:MI:SS') from dual;
--table 을 생성해서 테스트 
create table date_test(
	id varchar2(100) primary key,
	reg_date date not null
)
insert into date_test(id,reg_date) values('a',sysdate);
select * from date_test
select id,to_char(reg_date,'yyyy/mm/dd') from date_test;
select id,to_char(reg_date,'yyyy/mm/dd hh24:mi:ss') from date_test;

insert into date_test(id,reg_date) 
values('b',to_date('2018.7.14','yyyy.mm.dd'));

select * from date_test
insert into date_test(id,reg_date) 
values('c',to_date('2018.7.14 4:20:30','yyyy.mm.dd hh24:mi:ss'));

--시간 관련 연산 
select id,reg_date,reg_date-1 from date_test;
--현재 시간과 저장 시간의 일수를 확인 
select id,reg_date,sysdate-reg_date from date_test;
-- 소수점 이하 버리기 trunc()
select id,reg_date,trunc(sysdate-reg_date) from date_test;
--몇 개월이 지났는지를 확인 
insert into date_test(id,reg_date) 
values('d',to_date('2000.7.14','yyyy.mm.dd'));
-- months_between(현재시간, 등록시간) : 몇개월 차이인지 조회 
select id, trunc(months_between(sysdate,reg_date)) from date_test;
select id, trunc(months_between(sysdate,reg_date)/12) from date_test;

