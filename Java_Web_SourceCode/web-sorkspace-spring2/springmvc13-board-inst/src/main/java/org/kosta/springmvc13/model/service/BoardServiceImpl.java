package org.kosta.springmvc13.model.service;



import javax.annotation.Resource;

import org.kosta.springmvc13.model.dao.BoardDAO;
import org.kosta.springmvc13.model.vo.ListVO;
import org.kosta.springmvc13.model.vo.PostVO;
import org.springframework.stereotype.Service;
@Service
public class BoardServiceImpl implements BoardService {
	
	@Resource(name="boardDAOImpl")
	private BoardDAO boardDAO;	
	@Override
	public void write(PostVO postVO){
		boardDAO.write(postVO);
	}	
	@Override
	public ListVO getPostList(){				
		return getPostList("1");
	}
	@Override
	public ListVO getPostList(String pageNo){			
		int totalCount=boardDAO.getTotalPostCount();
		PagingBean pagingBean=null;
		if(pageNo==null)
			pagingBean=new PagingBean(totalCount);
		else
			pagingBean=new PagingBean(totalCount,Integer.parseInt(pageNo));		
		return new ListVO(boardDAO.getPostList(pagingBean),pagingBean);
	}
	
	@Override
	public PostVO getPostDetail(int no){
		boardDAO.updateHits(no);
		return boardDAO.getPostDetail(no);
	}
	@Override
	public void updateHits(int no){
		boardDAO.updateHits(no);
	}
	@Override
	public PostVO getPostDetailNoHits(int no){		
		return boardDAO.getPostDetail(no);
	}	
	
	@Override
	public void deletePost(int no){
		boardDAO.deletePost(no);
	}
	
	@Override
	public void updatePost(PostVO postVO){
		boardDAO.updatePost(postVO);
	}
		
}








