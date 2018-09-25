package org.kosta.springmvc13.model.service;

import org.kosta.springmvc13.model.vo.ListVO;
import org.kosta.springmvc13.model.vo.PostVO;

public interface BoardService {
	public  void write(PostVO postVO);	
	public  ListVO getPostList();
	public  ListVO getPostList(String pageNo);
	public  PostVO getPostDetail(int no);	
	public PostVO getPostDetailNoHits(int no);
	public  void deletePost(int no);
	public  void updatePost(PostVO postVO);
	public  void updateHits(int no);	
}