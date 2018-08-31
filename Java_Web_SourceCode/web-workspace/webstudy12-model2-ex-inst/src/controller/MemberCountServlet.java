package controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;

/**
 * Servlet implementation class MemberCountServlet
 */
@WebServlet("/MemberCountServlet")
public class MemberCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
		try {
			int totalCount=MemberDAO.getInstance().getMemberTotalCount();
			request.setAttribute("totalCount", totalCount);
			request.getRequestDispatcher("member_count.jsp").forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
	}
}








