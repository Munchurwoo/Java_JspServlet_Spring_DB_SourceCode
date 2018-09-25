package org.kosta.springmvc13.model.dao;

import org.kosta.springmvc13.model.vo.MemberVO;

public interface MemberDAO {
	public MemberVO findMemberById(String id);
	public MemberVO login(MemberVO vo);
	public void updateMember(MemberVO vo);
	public void registerMember(MemberVO vo) ;
	public int idcheck(String id) ;
}