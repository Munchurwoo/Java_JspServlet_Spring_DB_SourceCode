package org.kosta.springmvc13;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kosta.springmvc13.model.dao.BoardDAO;
import org.kosta.springmvc13.model.service.BoardService;
import org.kosta.springmvc13.model.vo.ListVO;
import org.kosta.springmvc13.model.vo.PostVO;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
  locations={"file:src/main/webapp/WEB-INF/spring-model.xml"})
public class BoardUnitTest {
	
	@Resource
	BoardDAO boardDAO;
	
	@Resource
	BoardService boardService;
	@Test
	public void list() {
		
		/*int totalPostCount=boardDAO.getTotalPostCount();
		PagingBean pagingBean=new PagingBean(totalPostCount);
		System.out.println(pagingBean);*/
		
		//2. BOardService Test
		ListVO listVO = boardService.getPostList();
		listVO.getList();
		List<PostVO> list = listVO.getList();
		for(PostVO post:list)
			System.out.println(post);
	}
}







