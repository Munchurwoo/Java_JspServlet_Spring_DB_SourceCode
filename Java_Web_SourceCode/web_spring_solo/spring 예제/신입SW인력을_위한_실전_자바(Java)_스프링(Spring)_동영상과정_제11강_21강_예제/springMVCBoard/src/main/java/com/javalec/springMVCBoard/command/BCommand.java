package com.javalec.springMVCBoard.command;

import org.springframework.ui.Model;

public interface BCommand {
	
	void execute(Model model);
	
}