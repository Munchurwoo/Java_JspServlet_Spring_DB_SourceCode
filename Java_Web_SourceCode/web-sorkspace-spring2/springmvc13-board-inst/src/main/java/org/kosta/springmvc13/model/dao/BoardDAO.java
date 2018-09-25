package org.kosta.springmvc13.model.dao;

import java.util.List;

import org.kosta.springmvc13.model.service.PagingBean;
import org.kosta.springmvc13.model.vo.PostVO;

public interface BoardDAO {

	public  void write(PostVO postVO);		

	public  PostVO getPostDetail(int no);

	public  void updateHits(int no);

	public  void deletePost(int no);

	public  void updatePost(PostVO postVO);

	public  int getTotalPostCount();

	public List<PostVO> getPostList(PagingBean pagingBean);	

}