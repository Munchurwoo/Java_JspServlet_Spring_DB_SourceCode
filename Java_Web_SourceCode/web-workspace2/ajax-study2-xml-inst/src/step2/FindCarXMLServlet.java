package step2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CarDAO;
import model.CarDTO;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.output.XMLOutputter;

/**
 * Servlet implementation class FindCarXMLServlet
 */
public class FindCarXMLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindCarXMLServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/xml;charset=utf-8");
		PrintWriter out=response.getWriter();
		String maker=request.getParameter("maker");
		CarDTO dto=CarDAO.getInstance().getCarInfo(maker);
		//xml로 응답 
		Document myDocument=new Document();
		Element root=new Element("car");
		myDocument.setRootElement(root);
		root.addContent(new Element("model").addContent(dto.getModel()));
		root.addContent(new Element("price").addContent(dto.getPrice()+""));
		// xml file 생성 
		XMLOutputter xmlOut=new XMLOutputter();
		out.print(xmlOut.outputString(myDocument));
		System.out.println(xmlOut.outputString(myDocument));
		out.close();		
	}
}







