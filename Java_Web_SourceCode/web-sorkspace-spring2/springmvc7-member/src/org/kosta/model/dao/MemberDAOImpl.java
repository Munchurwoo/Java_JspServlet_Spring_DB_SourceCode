package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO{
	@Autowired
	private SqlSessionTemplate template;
	
	@Override
	public int getTotalMemberCount() {
		return template.selectOne("member.getTotalMemberCount");
	}

	@Override
	public MemberVO findMemberById(String id) {
		return template.selectOne("member.findMemberById", id);
	}

	@Override
	public List<String> getAddressKind() {
		return template.selectList("member.getAddressKind");
	}

	@Override
	public List<MemberVO> getInfoByAddress(String address) {
		return template.selectList("member.getInfoByAddress", address);
	}

	@Override
	public MemberVO login(MemberVO memberVO) {
		// TODO Auto-generated method stub
		return template.selectOne("member.login",memberVO);
	}

	@Override
	public MemberVO update(MemberVO memberVO) {
		
		template.update("member.update",memberVO);
	
		return template.selectOne("member.findMemberById",memberVO.getId());

	}

	@Override
	public MemberVO register(MemberVO memberVO) {
		template.insert("member.register",memberVO);
		return template.selectOne("member.findMemberById",memberVO.getId());

	}

}
