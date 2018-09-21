package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.MemberVO;

public interface MemberDAO {
	int getTotalMemberCount();
	MemberVO findMemberById(String id);
	List<String> getAddressKind();
	List<MemberVO> findMemberListByAddress(String address);
	MemberVO login(MemberVO memberVO);
	void updateMember(MemberVO memberVO);
	void registerMember(MemberVO memberVO);
	int checkId(String id);
}


















