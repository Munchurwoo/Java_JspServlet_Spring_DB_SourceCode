/*	�������� ( SubQuery ) 
 *  : SQL ���� SQL 
 * 	  
 */
select * from jdbc_product order by price desc;
-- ���� ���� ��ǰ������ ��ǰ����? 
-- 1. ���� ���� ��ǰ����? 
	select max(price) from jdbc_product;
-- 2. ���� ���� ������ ��ǰ����? 
	select name from jdbc_product where price=200;
-- subquery�� Ȱ���ؼ� �ѹ��� ��ȸ�غ��� 
	select name from jdbc_product	
	where price=(select max(price) from jdbc_product);
	
-- ���� ���� ������ ���� ��ǰ�� ���������? 	
	select maker from jdbc_product	
	where price=(select min(price) from jdbc_product);
	
-- ���� ����Ǿ� �ִ� ��ǰ�� ��հ����� ���� ������ ���� ��ǰ �� 
-- ���� ���� ������ ���� ��ǰ�� ��ǰ��� ������,������ ��ȸ�Ѵ� 
-- 1. ��ǰ�� ��հ� 
	select avg(price) from jdbc_product;
-- 2. ��ǰ�� ��հ����� ���� ������ ���� ��ǰ �� ���� ���� ����
	select max(price) from jdbc_product
	where price<(	select avg(price) from jdbc_product);	
-- 3. ��ǰ�� ��հ����� ���� ������ ���� ��ǰ �� ���� ���� ������
--    ��ǰ��� ������, ���� 	
	select name,maker,price from jdbc_product
	where price=(
		select max(price) from jdbc_product
		where price<(	select avg(price) from jdbc_product)
	)
-- ���� ����Ǿ� �ִ� ��ǰ�� ��հ����� ���� ������ ���� ��ǰ �� 
-- ���� ���� ������ ���� ��ǰ�� ��ǰ��� ������,������ ��ȸ�Ѵ� 
select * from JDBC_PRODUCT	
-- ��ǰ��� 
select avg(price) from JDBC_PRODUCT 
-- ��պ��� ���� ��ǰ 
select max(price) from JDBC_PRODUCT where price<(
select avg(price) from JDBC_PRODUCT )
-- ���� �Ϸ� 
select name,maker, price from JDBC_PRODUCT where price=(
select max(price) from JDBC_PRODUCT where price<(
select avg(price) from JDBC_PRODUCT )
)

	
	
	
	
	
	
	
	
	
	
	