package org.kosta.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.CompanyDAO;

public class RegisterEmployeeController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String ename = request.getParameter("employeeName");
		int sal = Integer.parseInt(request.getParameter("employeeSal"));
		int department = Integer.parseInt(request.getParameter("department"));
		CompanyDAO.getInstance().registerEmployee(ename, sal, department);
		return "employee_list.jsp";
	}

}
