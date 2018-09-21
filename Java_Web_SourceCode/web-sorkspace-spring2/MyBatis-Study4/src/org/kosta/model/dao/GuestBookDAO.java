package org.kosta.model.dao;

import java.util.List;

import org.kosta.model.vo.GuestBookVO;
import org.mybatis.spring.SqlSessionTemplate;

public class GuestBookDAO {
	private SqlSessionTemplate template;
	public GuestBookDAO(SqlSessionTemplate template) {
		super();
		this.template = template;
	}
	public void insertGuestBook(GuestBookVO vo) {
		template.insert("guestbook.insertGuestBook2",vo);
	}

	public List<GuestBookVO> getAllGuestBookList() {
		
		return template.selectList("guestbook.getAllGuestBookList");
	}

}
