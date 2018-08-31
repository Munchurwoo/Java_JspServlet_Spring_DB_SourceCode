package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.BoardDTO;

public class BoardPostFormDetailController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<BoardDTO> dlist = BoardDAO.getInstance().getAllBoardList();
		request.setAttribute("dlist", dlist);
		request.setAttribute("url","/boardDetailList.jsp");
		return "/template/layout.jsp";
	}

}
