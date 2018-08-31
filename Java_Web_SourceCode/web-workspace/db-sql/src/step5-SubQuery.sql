/*
 * ��������(subquery)
 * : sql ���� sql 
 */
select * from jdbc_product order by price desc;
-- ���� ���� ��ǰ������ ��ǰ����? 
-- 1. ���� ���� ��ǰ����? 
select max(price) from jdbc_product;
-- 2. ���� ���� ������ ��ǰ����? 
select name from JDBC_PRODUCT where price=150;
-- subquery �� Ȱ���ؼ� �ѹ��� ��ȸ�غ���. 
select name from JDBC_PRODUCT 
where price=(select max(price) from jdbc_product)

-- ���� ���� ������ ���� ��ǰ�� ������ ����? 
select * from JDBC_PRODUCT;

select maker from JDBC_PRODUCT 
where price=(select min(price) from JDBC_PRODUCT)
-- ���� ����Ǿ� �ִ� ��ǰ�� ��հ����� ���� ������ ���� ��ǰ �� 
-- ���� ���� ������ ���� ��ǰ�� ��ǰ��� ������, ������ ��ȸ�Ѵ�. 
SELECT name, maker, price from JDBC_PRODUCT
where price=(select max(price) from jdbc_product where price<(select avg(price)
from jdbc_product))
---------------------------
select max(price) from jdbc_product where price<(select avg(price)
from jdbc_product)

select name, salary from emp where salary=(select max(salary) from emp )
select * from JDBC_PRODUCT
--�����纰 ��ǰ�� �������� group by 
select maker,count(*) ��ǰ�� from JDBC_PRODUCT
group by maker
-- 
select address, count(*) from MEMBER group by address
order by ��ǰ�� desc

select maker, count(*) ��ǰ�� 
from JDBC_PRODUCT 
group by maker 
order by ��ǰ�� desc
