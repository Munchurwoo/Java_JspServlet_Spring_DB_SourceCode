/* 	Group By : ���̺��� Ư�� �÷��� �������� �׷�ȭ�� �� ��� 
 *  
 * having : group by���� ����ϴ� ������ 
 * 
 * ��) ��ǰ���̺��� �����纰 ��ǰ�� , ��հ��� 
 */ 
select * from jdbc_product;
-- �����纰 ��ǰ���� ��ȸ ( ��ǰ�� �������� ) 
select maker,count(*) as ��ǰ��
from jdbc_product
group by maker
order by ��ǰ�� desc
-- �����纰 ��ǰ��հ��� ��ȸ, ��հ� ���� ��~ ���� ��( �������� ) 
select maker,round(avg(price)) as ��հ�
from jdbc_product
group by maker
order by ��հ� asc

-- �����纰 ��ǰ��հ��� ��ȸ, ��հ� ���� ��~ ���� ��( �������� ) 
-- �� �ݿø��� ��հ��� 30�� �ʰ��ϴ� �����縦 ������� �Ѵ� 
-- having �������� �̿��Ѵ� 
select maker,round(avg(price)) as ��հ�
from jdbc_product
group by maker
having round(avg(price))>30
order by ��հ� asc


select address,count(*) as ȸ����
from member
group by address
order by ȸ���� desc













