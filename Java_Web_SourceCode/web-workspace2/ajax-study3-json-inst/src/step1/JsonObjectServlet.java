package step1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import model.CarDAO;
import model.CarDTO;

/**
 * Servlet implementation class JsonObjectServlet
 */
@WebServlet("/JsonObjectServlet")
public class JsonObjectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonObjectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out=response.getWriter();
		String maker=request.getParameter("maker");
		CarDAO dao=CarDAO.getInstance();
		CarDTO dto=dao.getCarInfo(maker);
		//JSON 으로 클라이언트에게 응답한다 
		JSONObject json=new JSONObject(dto);//dto를 생성자에 할당해서 json을 만든다
		out.print(json.toString());
		out.close();
	}
}














