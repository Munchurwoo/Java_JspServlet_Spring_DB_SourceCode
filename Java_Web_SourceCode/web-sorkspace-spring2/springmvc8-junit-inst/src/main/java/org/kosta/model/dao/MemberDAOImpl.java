package org.kosta.model.dao;

import java.util.List;

import javax.annotation.Resource;

import org.kosta.model.vo.MemberVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MemberDAOImpl implements MemberDAO {
	@Resource
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
	public List<MemberVO> findMemberListByAddress(String address) {		
		return template.selectList("member.findMemberListByAddress", address);
	}
	@Override
	public MemberVO login(MemberVO memberVO) {		
		return template.selectOne("member.login", memberVO);
	}
	@Override
	public void updateMember(MemberVO memberVO) {
		template.update("member.updateMember",memberVO);
	}
	@Override
	public void registerMember(MemberVO memberVO) {
		template.insert("member.registerMember", memberVO);
	}
	@Override
	public int checkId(String id) {
		return template.selectOne("member.checkId", id);
	}
}








