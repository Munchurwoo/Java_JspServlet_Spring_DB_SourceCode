package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class FindMemberByIdServlet
 */
@WebServlet("/FindMemberByIdServlet")
public class FindMemberByIdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindMemberByIdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("memberId");
		try {
			MemberVO vo=MemberDAO.getInstance().findMemberById(id);
			String viewName=null;
			if(vo==null) {
				viewName="findbyid_fail.jsp";
			}else {
				request.setAttribute("memberVO", vo);
				viewName="findbyid_ok.jsp";
			}
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		
	}
}










