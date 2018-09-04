package com.javalec.spring_pjt_ex.command;

import com.javalec.spring_pjt_ex.dto.TicketDto;

public interface ITicketCommand {

	public void execute(TicketDto ticketDto);
	
}
