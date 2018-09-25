package org.kosta.springmvc13.model.service;

import javax.annotation.Resource;

import org.kosta.springmvc13.model.dao.MemberDAO;
import org.kosta.springmvc13.model.vo.MemberVO;
import org.springframework.stereotype.Service;
@Service
public class MemberServiceImpl implements MemberService {
	@Resource
	private MemberDAO memberDAO;	
	public MemberVO login(MemberVO vo){
		return memberDAO.login(vo);
	}	
}
