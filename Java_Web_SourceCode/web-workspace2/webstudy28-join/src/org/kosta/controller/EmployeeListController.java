package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CompanyDAO;
import org.kosta.model.EmployeeVO;

public class EmployeeListController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<EmployeeVO> list = null;
		list = CompanyDAO.getInstance().employeeList();
		request.setAttribute("list",list);
		return "employee_list.jsp";
	}

}
