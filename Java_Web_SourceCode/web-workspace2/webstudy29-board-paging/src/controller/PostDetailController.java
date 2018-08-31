package controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BoardDAO;
import model.PostVO;

public class PostDetailController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null){
			return "redirect:index.jsp";
		}
		int no=Integer.parseInt(request.getParameter("no"));
		@SuppressWarnings("unchecked")
		ArrayList<Integer> noList=(ArrayList<Integer>) session.getAttribute("noList");
		//noList에 게시글번호가 존재하지 않으면 조회수를 증가시킨다. 
		if(noList.contains(no)==false) {
			BoardDAO.getInstance().updateHit(no);
			noList.add(no);
		}
		// 개별 게시물 조회  
		PostVO vo = BoardDAO.getInstance().getPostingByNo(no);	
		request.setAttribute("pvo", vo);
		request.setAttribute("url", "/board/post_detail.jsp");
		return "/template/layout.jsp";
	}
}






