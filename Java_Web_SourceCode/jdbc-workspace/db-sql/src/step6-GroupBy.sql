/*
 * Group by : 테이블에 
*/

select * from JDBC_PRODUCT;
-- 제조사별 상품수를 조회 (상품수 내림차순 )
select maker, count(*) 상품수
from JDBC_PRODUCT
group by maker
order by 상품수 desc

-- 제조사별 상품평균가를 조회, 평균가 낮은순~ 높은순 (오름차순)
select maker, avg(price) 평균가
from JDBC_PRODUCT
group by maker
order by 평균가 asc

-- 제조사별 상품평균가를 조회, 평균가 낮은순~ 높은순 (오름차순)
-- 단 반올림한 평균가가 30을 초과하는 제조사를 대상으로 한다
-- having 조건절을 이용한다. 

select maker, round(avg(price)) 평균가
from JDBC_PRODUCT
group by maker
having round(avg(price))> 30
order by 평균가 asc

select * from member;

select address, count(*) from MEMBER group by address 


