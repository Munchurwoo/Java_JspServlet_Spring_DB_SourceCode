/*	서브쿼리 ( SubQuery ) 
 *  : SQL 안의 SQL 
 * 	  
 */
select * from jdbc_product order by price desc;
-- 가장 높은 상품가격의 상품명은? 
-- 1. 가장 높은 상품가는? 
	select max(price) from jdbc_product;
-- 2. 가장 높은 가격의 상품명은? 
	select name from jdbc_product where price=200;
-- subquery를 활용해서 한번에 조회해본다 
	select name from jdbc_product	
	where price=(select max(price) from jdbc_product);
	
-- 가장 낮은 가격을 가진 상품의 제조사명은? 	
	select maker from jdbc_product	
	where price=(select min(price) from jdbc_product);
	
-- 현재 저장되어 있는 상품의 평균가보다 낮은 가격을 가진 상품 중 
-- 가장 높은 가격을 가진 상품의 상품명과 제조사,가격을 조회한다 
-- 1. 상품의 평균가 
	select avg(price) from jdbc_product;
-- 2. 상품의 평균가보다 낮은 가격을 가진 상품 중 가장 높은 가격
	select max(price) from jdbc_product
	where price<(	select avg(price) from jdbc_product);	
-- 3. 상품의 평균가보다 낮은 가격을 가진 상품 중 가장 높은 가격의
--    상품명과 제조사, 가격 	
	select name,maker,price from jdbc_product
	where price=(
		select max(price) from jdbc_product
		where price<(	select avg(price) from jdbc_product)
	)
	
	
	
	
	
	
	
	
	
	
	
	
	