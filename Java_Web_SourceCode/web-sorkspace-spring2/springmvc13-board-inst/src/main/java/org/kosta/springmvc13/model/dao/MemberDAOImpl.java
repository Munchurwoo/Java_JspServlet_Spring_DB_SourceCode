package org.kosta.springmvc13.model.dao;

import javax.annotation.Resource;

import org.kosta.springmvc13.model.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class MemberDAOImpl implements MemberDAO {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;
	@Override
	public MemberVO findMemberById(String id){
		return sqlSessionTemplate.selectOne("member.findMemberById",id);
	}
	public MemberVO login(MemberVO vo){
		return (MemberVO) sqlSessionTemplate.selectOne("member.login",vo);			
	}	
	public void updateMember(MemberVO vo) {
		sqlSessionTemplate.update("member.updateMember",vo);			
	}	
	public void registerMember(MemberVO vo) {
		sqlSessionTemplate.insert("member.registerMember",vo);			
	}
	public int idcheck(String id) {
		return sqlSessionTemplate.selectOne("member.idcheck",id);
		//return (count==0) ? "ok":"fail"; 		
	}
}
