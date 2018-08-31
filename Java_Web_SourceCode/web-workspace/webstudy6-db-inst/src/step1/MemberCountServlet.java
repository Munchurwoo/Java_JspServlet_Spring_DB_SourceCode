package step1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberCountServlet
 */
public class MemberCountServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberCountServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out=response.getWriter();			
			String url=getServletContext().getInitParameter("url");
			try {
				Connection con=DriverManager.getConnection(url,"scott","tiger");
				String sql="select count(*) from member";
				PreparedStatement pstmt=con.prepareStatement(sql);
				ResultSet rs=pstmt.executeQuery();
				if(rs.next()) {					
				out.println("<h3>총 회원수:");
				out.println(rs.getString(1));
				out.println("명</h3>");
				}
				rs.close();
				pstmt.close();
				con.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
			
			out.close();
	}
}









