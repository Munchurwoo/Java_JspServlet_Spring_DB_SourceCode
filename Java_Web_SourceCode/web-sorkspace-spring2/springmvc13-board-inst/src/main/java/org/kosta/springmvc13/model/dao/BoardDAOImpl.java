package org.kosta.springmvc13.model.dao;


import java.util.List;

import javax.annotation.Resource;

import org.kosta.springmvc13.model.service.PagingBean;
import org.kosta.springmvc13.model.vo.PostVO;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;
@Repository
public class BoardDAOImpl implements BoardDAO {
	@Resource
	private SqlSessionTemplate sqlSessionTemplate;	
	
	@Override
	public void write(PostVO postVO){
		sqlSessionTemplate.insert("board.write",postVO);
	}			

	@Override
	public PostVO getPostDetail(int no) {
		return sqlSessionTemplate.selectOne("board.getPostDetail",no);
	}


	@Override
	public void updateHits(int no) {
		sqlSessionTemplate.update("board.updateHits",no);
	}


	@Override
	public void deletePost(int no) {
		sqlSessionTemplate.delete("board.deletePost", no);
	}


	@Override
	public void updatePost(PostVO postVO) {
		sqlSessionTemplate.update("board.updatePost", postVO);
	}


	@Override
	public int getTotalPostCount() {
		return sqlSessionTemplate.selectOne("board.getTotalPostCount");
	}


	@Override
	public List<PostVO> getPostList(PagingBean pagingBean) {
		return sqlSessionTemplate.selectList("board.getPostList", pagingBean);
	}	
}














