package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.ListVO;
import model.PagingBean;
import model.PostVO;

public class ListController  implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {	
		int totalPostCount=BoardDAO.getInstance().getTotalPostCount();
		String pageNo=request.getParameter("pageNo");
		PagingBean pagingBean=null;
		if(pageNo==null)
			pagingBean=new PagingBean(totalPostCount);	
		else
			pagingBean=new PagingBean(totalPostCount,Integer.parseInt(pageNo));	
		ArrayList<PostVO> list
		=BoardDAO.getInstance().getPostingList(pagingBean);
		ListVO lvo=new ListVO(list,pagingBean);
		request.setAttribute("lvo", lvo);
		request.setAttribute("url", "/board/list.jsp");		
		return "/template/layout.jsp";
	}
}







