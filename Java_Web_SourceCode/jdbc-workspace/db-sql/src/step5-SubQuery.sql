/*
 * 서브쿼리(subquery)
 * : sql 안의 sql 
 */
select * from jdbc_product order by price desc;
-- 가장 높은 상품가격의 상품명은? 
-- 1. 가장 높은 상품가는? 
select max(price) from jdbc_product;
-- 2. 가장 높은 가격의 상품명은? 
select name from JDBC_PRODUCT where price=150;
-- subquery 를 활용해서 한번에 조회해본다. 
select name from JDBC_PRODUCT 
where price=(select max(price) from jdbc_product)

-- 가장 낮은 가격을 가진 상품의 재조사 명은? 
select * from JDBC_PRODUCT;

select maker from JDBC_PRODUCT 
where price=(select min(price) from JDBC_PRODUCT)
-- 현재 저장되어 있는 상품의 평균가보다 낮은 가격을 가진 상품 중 
-- 가장 높은 가격을 가진 상품의 상품명과 제조사, 가격을 조회한다. 
SELECT name, maker, price from JDBC_PRODUCT
where price=(select max(price) from jdbc_product where price<(select avg(price)
from jdbc_product))
---------------------------
select max(price) from jdbc_product where price<(select avg(price)
from jdbc_product)

select name, salary from emp where salary=(select max(salary) from emp )
select * from JDBC_PRODUCT
--제조사별 상품수 내램차순 group by 
select maker,count(*) 상품수 from JDBC_PRODUCT
group by maker
-- 
select address, count(*) from MEMBER group by address
order by 상품수 desc

select maker, count(*) 상품수 
from JDBC_PRODUCT 
group by maker 
order by 상품수 desc
