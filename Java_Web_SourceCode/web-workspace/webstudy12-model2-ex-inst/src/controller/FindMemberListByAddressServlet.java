package controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MemberDAO;
import model.MemberVO;

/**
 * Servlet implementation class FindMemberListByAddressServlet
 */
@WebServlet("/FindMemberListByAddressServlet")
public class FindMemberListByAddressServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address=request.getParameter("address");
		try {
			ArrayList<MemberVO> list= MemberDAO.getInstance().findMemberListByAddress(address);
			String viewName=null;
			if(list.isEmpty()) {
				viewName="findbyaddress_fail.jsp";
			}else {
				request.setAttribute("list", list);
				viewName="findbyaddress_ok.jsp";
			}
			request.getRequestDispatcher(viewName).forward(request, response);
		} catch (ClassNotFoundException | SQLException e) {			
			e.printStackTrace();
		}
	}
}














