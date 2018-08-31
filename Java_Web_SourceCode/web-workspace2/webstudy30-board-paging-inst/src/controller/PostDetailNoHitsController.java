package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BoardDAO;
import model.PostVO;

public class PostDetailNoHitsController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null){
			return "redirect:index.jsp";
		}
		int no=Integer.parseInt(request.getParameter("no"));		
		// 개별 게시물 조회  
		PostVO vo = BoardDAO.getInstance().getPostingByNo(no);	
		request.setAttribute("pvo", vo);
		request.setAttribute("url", "/board/post_detail.jsp");
		return "/template/layout.jsp";
	}
}







