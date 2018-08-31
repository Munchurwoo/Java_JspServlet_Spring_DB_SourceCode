package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BoardDAO;
import model.PostVO;

public class ListController  implements Controller {
	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {				
		ArrayList<PostVO> list=BoardDAO.getInstance().getPostingList();	
		request.setAttribute("url", "/board/list.jsp");
		request.setAttribute("list", list);
		return "/template/layout.jsp";
	}
}







