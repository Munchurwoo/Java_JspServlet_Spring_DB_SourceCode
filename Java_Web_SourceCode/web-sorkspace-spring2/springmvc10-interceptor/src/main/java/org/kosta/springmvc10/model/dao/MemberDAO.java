package org.kosta.springmvc10.model.dao;

import org.kosta.springmvc10.model.vo.MemberVO;

public interface MemberDAO {

	MemberVO login(MemberVO memberVO);

	void updateMember(MemberVO memberVO);

	MemberVO findMemberById(String id);

}
