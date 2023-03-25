package talesb.edu.infnet.qualidadesoftware.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talesb.edu.infnet.qualidadesoftware.domain.Ticket;
import talesb.edu.infnet.qualidadesoftware.repository.TicketRepository;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public void printTicketinformation(int TicketId) {

		Ticket ticket = ticketRepository.getById(TicketId);

		System.out.println("Ticket Owner: " + ticket.getPerson().getName().getFirstName());
		System.out.println("Ticket Agent: " + ticket.getAssignedAgent().getName().getFirstName());
		System.out.println("Commit example");

		ticket.getProduct().forEach(product -> {
			System.out.println("Ticket Product: "+product.getName());
		});


		ticket.getMessages().forEach(message -> {
			System.out.println("Ticket Messages: "+message.getSubject() + " - " + message.getMessageBody());
		});
	}

}
