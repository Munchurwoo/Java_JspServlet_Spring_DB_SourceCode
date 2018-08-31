package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BoardDAO;
import model.PostVO;

public class UpdatePostController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session=request.getSession(false);
		if(session==null||session.getAttribute("mvo")==null||
				request.getMethod().equals("POST")==false){
			return "redirect:index.jsp";
		}
		int no=Integer.parseInt(request.getParameter("no"));
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		PostVO vo=new PostVO();
		vo.setNo(no);
		vo.setTitle(title);
		vo.setContent(content);
		BoardDAO.getInstance().updatePosting(vo);			
		String path="redirect:front?command=PostDetailNoHits&no="+vo.getNo();
		return path;
	}

}







