/* 	Group By : 테이블에서 특정 컬럼을 기준으로 그룹화할 떄 사용 
 *  
 * having : group by에서 사용하는 조건절 
 * 
 * 예) 상품테이블에서 제조사별 상품수 , 평균가격 
 */ 
select * from jdbc_product;
-- 제조사별 상품수를 조회 ( 상품수 내림차순 ) 
select maker,count(*) as 상품수
from jdbc_product
group by maker
order by 상품수 desc
-- 제조사별 상품평균가를 조회, 평균가 낮은 순~ 높은 순( 오름차순 ) 
select maker,round(avg(price)) as 평균가
from jdbc_product
group by maker
order by 평균가 asc

-- 제조사별 상품평균가를 조회, 평균가 낮은 순~ 높은 순( 오름차순 ) 
-- 단 반올림한 평균가가 30을 초과하는 제조사를 대상으로 한다 
-- having 조건절을 이용한다 
select maker,round(avg(price)) as 평균가
from jdbc_product
group by maker
having round(avg(price))>30
order by 평균가 asc


select address,count(*) as 회원수
from member
group by address
order by 회원수 desc













