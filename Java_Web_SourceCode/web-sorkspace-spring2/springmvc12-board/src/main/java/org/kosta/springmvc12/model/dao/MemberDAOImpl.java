package org.kosta.springmvc12.model.dao;

import javax.annotation.Resource;

import org.kosta.springmvc12.model.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Resource
	private SqlSessionTemplate template;
	@Override
	public MemberVO login(MemberVO memberVO) {
		
		return template.selectOne("member.login",memberVO);
	}
}
