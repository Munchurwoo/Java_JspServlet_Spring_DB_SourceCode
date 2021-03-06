package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.MemberVO;

public interface MemberDAO {

	int getTotalMemberCount();

	MemberVO findMemberById(String id);

	List<String> getAddressKind();

	List<MemberVO> getInfoByAddress(String address);

	MemberVO login(MemberVO memberVO);

	MemberVO update(MemberVO memberVO);

	MemberVO register(MemberVO memberVO);


}
