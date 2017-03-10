package com.proxy.ticket;

public class Station implements TicketService{

	@Override
	public void sellTicket() {
		System.out.println("---售票---");
	}

	@Override
	public void inquire() {
		System.out.println("---问询---");
	}

	@Override
	public void withdraw() {
		System.out.println("---退票---");
	}

}
