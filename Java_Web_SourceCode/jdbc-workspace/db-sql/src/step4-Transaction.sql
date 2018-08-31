/*	Database Transaction 
 * : Ʈ������̶� �����ͺ��̽� �۾� ������ ���Ѵ�. 
 * 		Ʈ����� ó���� ������ �������� ���Ἲ( ������, integrity )�� ���ؼ��� 
 *  *���Ἲ : ������ ���� ����
 * 	DCL �� COMMIT : ���� �����ͺ��̽��� �۾� ����� �ݿ� 
 * 			  ROLLBACK : �۾��� ��� 
 * ��1) �ſ�ī�� �߱޽� ����Ʈ�� �����Ѵ�. 
 * 		 ���� �ſ�ī�� �߱ް� ����Ʈ ���� �� ���� �߻��ÿ��� 
 * 		 ��ü �۾��� �ּҵǵ���( ROLLBACK ) ó���ϰ� ī��� ����Ʈ ������ ��� ���������� ����Ǿ��� ���� 
 * 		 ���� �����ͺ��̽��� �����͸� �����ϵ��� Ʈ������� 
 * 		 ó���Ѵ�.  
 * 	
 * Application ( DAO ) Transaction ó�� 
 * 
 * try{ connection.setAutoCommit(false); // �ڵ� Ŀ�� ��� ���� 
 * 		ī�����۾�
 * 		����Ʈ ��� �۾� 
 * 		connection.commit() // ���� db�� �ݿ�
 * }catch(){
 * 		connection.rollback(); // ���� �߻��� ��� 
 * }finally{
 * }
 */
 
create table card(
	id varchar2(100) primary key,
	name varchar2(100) not null
)
insert into card(id,name) values('jsp','�ں���')
select * from card
create table point(
	id varchar2(100) primary key,
	point_type varchar2(100) not null,
	point number not null
)
insert into POINT(id,point_type,point) values ('jsp','�Ե�',200)
select * from POINT,card

delete from card;
delete from POINT
commit
