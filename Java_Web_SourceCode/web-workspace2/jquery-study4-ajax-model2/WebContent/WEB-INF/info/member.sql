 CREATE TABLE member(
  id VARCHAR2(100) PRIMARY KEY,
  password VARCHAR2(100) NOT NULL,
  name VARCHAR2(100) NOT NULL,
  address VARCHAR2(100)
 )
DROP TABLE member; -- 테이블을 삭제 

select * from member;

-- 로그인시 사용할 SQL 
-- 로그인 성공시 
select name,address from member where id='spring' and password='abcd';
-- 로그인 실패시 ( 아이디 패스워드 모두가 일치하지 않으면 ) 
select name,address from member where id='spring' and password='abcd2';
/*  MemberDAO login(dto) 에서 사용할 query 
 *  select name,address from member where id=? and password=?
 */
-- update 회원정보수정 
update member set password='a',name='이연희',address='판교' where id='spring';
/* MemberDAO update 에서 사용할 sql 
 * update member set password=?,name=?,address=? where id=?
 */
commit






















