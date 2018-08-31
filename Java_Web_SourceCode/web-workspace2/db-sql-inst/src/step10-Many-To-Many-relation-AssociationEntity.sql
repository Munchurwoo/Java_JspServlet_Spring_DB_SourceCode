/*   다 대 다 관계(many-to-many relation)는 Association Entity로 해소한다 
 *   
 *   회원과 취미종류는 다 대 관계이다 
 *   ex)  아이유 회원은 0 or 1 or 다수의 취미를 가질 수 있다 
 *      프로그래밍 취미는 0 or 1 or 다수 회원의 취미가 될 수 있다 
 * 
 *   이 경우 Association Entity 를 적용해 회원과 취미종류의 일반정보외의
 *   회원과 취미종류 연관정보를 저장하는 테이블을 별도로 만든다  
 * 
 *   회원일반정보    ----0|<  회원취미연관정보  >|0---- 취미종류일반정보
 * 
 *   위의 설계에서 특징적인 부분은 
 *   회원취미연관정보는 
 *   회원아이디를 참조하고 
 *   취미종류아이디를 참조, 
 *   회원아이디와 취미종류아이디를 복합 primary key로 설정해서
 *   데이터 무결성을 보장하게 한다  
 */
 -- 회원테이블 
 create table h_member(
  id varchar2(100) primary key,
  password varchar2(100) not null,
  name varchar2(100) not null
 )
 -- 취미종류테이블 
 create table hobby_type(
  hid varchar2(100) primary key,
  name varchar2(100) not null
 )
 -- 회원 취미 연관 정보 테이블 
 create table member_hobby(
  id varchar2(100),
  hid varchar2(100),
  constraint fk_h_member foreign key(id) references h_member,
  constraint fk_hobby_type foreign key(hid) references hobby_type,
  constraint pk_member_hobby primary key(id,hid) -- 복합 pk 제약조건 설정 
 )
 insert into h_member(id,password,name) values('java','1234','아이유')
 
 insert into hobby_type(hid,name) values('1','독서');
 insert into hobby_type(hid,name) values('2','영화감상');
 insert into hobby_type(hid,name) values('3','프로그래밍');
 insert into hobby_type(hid,name) values('4','자전거');
 insert into hobby_type(hid,name) values('5','필라테스');
 insert into hobby_type(hid,name) values('6','음악감상');
  -- 복합pk 테스트 
 insert into MEMBER_HOBBY(id,hid) values('java','4');
 -- error  복합 pk 제약조건에 위배 
 insert into MEMBER_HOBBY(id,hid) values('java','4');
 -- success
 insert into MEMBER_HOBBY(id,hid) values('java','5');
 
 select * from H_MEMBER;
 
 select * from member_hobby;
 

 select * from h_member where id='aop';
 
 select * from member_hobby where id='ajax';
 
 SELECT ht.name
 FROM member_hobby mh, hobby_type ht
 WHERE mh.hid=ht.hid  AND mh.id='java';
 
 
 
 
 
 
 
 
 
 
 
 
