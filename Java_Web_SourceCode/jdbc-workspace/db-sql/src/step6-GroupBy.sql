/*
 * Group by : ���̺� 
*/

select * from JDBC_PRODUCT;
-- �����纰 ��ǰ���� ��ȸ (��ǰ�� �������� )
select maker, count(*) ��ǰ��
from JDBC_PRODUCT
group by maker
order by ��ǰ�� desc

-- �����纰 ��ǰ��հ��� ��ȸ, ��հ� ������~ ������ (��������)
select maker, avg(price) ��հ�
from JDBC_PRODUCT
group by maker
order by ��հ� asc

-- �����纰 ��ǰ��հ��� ��ȸ, ��հ� ������~ ������ (��������)
-- �� �ݿø��� ��հ��� 30�� �ʰ��ϴ� �����縦 ������� �Ѵ�
-- having �������� �̿��Ѵ�. 

select maker, round(avg(price)) ��հ�
from JDBC_PRODUCT
group by maker
having round(avg(price))> 30
order by ��հ� asc

select * from member;

select address, count(*) from MEMBER group by address 


