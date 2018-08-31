/*	Database Transaction 
 * : 트랜잭션이란 데이터베이스 작업 단위를 말한다. 
 * 		트랜잭션 처리의 목적은 데이터의 무결성( 완전성, integrity )을 위해서다 
 *  *무결성 : 결점이 없는 상태
 * 	DCL 중 COMMIT : 실제 데이터베이스에 작업 결과를 반영 
 * 			  ROLLBACK : 작업을 취소 
 * 예1) 신용카드 발급시 포인트를 지급한다. 
 * 		 만약 신용카드 발급과 포인트 지급 중 문제 발생시에는 
 * 		 전체 작업이 최소되도록( ROLLBACK ) 처리하고 카드와 포인트 지급이 모두 정상적으로 수행되었을 때만 
 * 		 실제 데이터베이스에 데이터를 저장하도록 트랜잭션을 
 * 		 처리한다.  
 * 	
 * Application ( DAO ) Transaction 처리 
 * 
 * try{ connection.setAutoCommit(false); // 자동 커밋 모드 해제 
 * 		카드등록작업
 * 		포인트 등록 작업 
 * 		connection.commit() // 실제 db에 반영
 * }catch(){
 * 		connection.rollback(); // 문제 발생시 취소 
 * }finally{
 * }
 */
 
create table card(
	id varchar2(100) primary key,
	name varchar2(100) not null
)
insert into card(id,name) values('jsp','박보검')
select * from card
create table point(
	id varchar2(100) primary key,
	point_type varchar2(100) not null,
	point number not null
)
insert into POINT(id,point_type,point) values ('jsp','롯데',200)
select * from POINT,card

delete from card;
delete from POINT
commit
