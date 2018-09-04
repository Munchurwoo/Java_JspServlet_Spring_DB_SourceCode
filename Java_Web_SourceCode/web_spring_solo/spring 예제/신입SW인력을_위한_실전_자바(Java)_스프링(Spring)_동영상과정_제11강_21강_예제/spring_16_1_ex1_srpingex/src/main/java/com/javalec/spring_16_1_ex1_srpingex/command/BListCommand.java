package com.javalec.spring_16_1_ex1_srpingex.command;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.spring_16_1_ex1_srpingex.dao.BDao;
import com.javalec.spring_16_1_ex1_srpingex.dto.BDto;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		
	}

}