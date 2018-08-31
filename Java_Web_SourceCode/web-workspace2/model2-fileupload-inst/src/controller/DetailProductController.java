package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.ProductDAO;
import model.ProductVO;

public class DetailProductController implements Controller {
	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String pno=request.getParameter("pno");
		ProductVO pvo=ProductDAO.getInstance().findProductByNo(pno);
		request.setAttribute("pvo", pvo);
		return "upload_result.jsp";
	}
}
