package org.kosta.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.kosta.model.BoardDAO;
import org.kosta.model.BoardDTO;

public class BoardPostFormController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ArrayList<BoardDTO> blist = BoardDAO.getInstance().getAllBoardList();
		request.setAttribute("blist", blist);
		request.setAttribute("url","/boardList.jsp");
		return "/template/layout.jsp";
	}

}
