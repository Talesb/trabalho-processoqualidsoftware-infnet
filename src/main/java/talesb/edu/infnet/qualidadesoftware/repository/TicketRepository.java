package talesb.edu.infnet.qualidadesoftware.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import talesb.edu.infnet.qualidadesoftware.domain.Message;
import talesb.edu.infnet.qualidadesoftware.domain.Person;
import talesb.edu.infnet.qualidadesoftware.domain.Product;
import talesb.edu.infnet.qualidadesoftware.domain.Ticket;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Country;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Email;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Height;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.MetricHeight;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Name;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.PhoneNumber;

@Component
public class TicketRepository {
 
	
	Map<Integer, Ticket> tickets = new HashMap<>();
	
	public TicketRepository( ) {
		Person person = getPerson();
		Person agent = getAgent();
		List<Product> products = getProducts();
		Ticket ticket = new Ticket(person,products,agent);
		ticket.addMessage(new Message("Package Damaged", "Hi I want to complain about my package, my xbox almost was damaged too"));
		ticket.addMessage(new Message("Tv Image", "The Tv Image is not good at all, sometimes all screen show black lines"));
		tickets.put(1, ticket);
	}

	private List<Product> getProducts() {
		Product product = new Product();
		product.setName("Plasma TV");
		product.setPrice(500);

		Product product2 = new Product();
		product2.setName("XBOX One");
		product2.setPrice(700);
		
		List<Product> products = new ArrayList<>();
		products.add(product);
		products.add(product2);
		return products;
	}

	private Person getAgent() {
		Name agentName= new Name("Dominick", "Toretto");
		PhoneNumber agentMainPhone = new PhoneNumber(55,11,255258599);
		PhoneNumber agentMobilePhone = new PhoneNumber(55,11,994778787);
		Email agentEmail = new Email("dom.family@yahoo.com.br");
		MetricHeight agentHeight = Height.METRIC(183);
		Country agentCountry = new Country("BR");
		
		Person agent = new Person(agentName,agentMainPhone,agentMobilePhone,agentEmail,agentHeight,agentCountry);
		return agent;
	}

	private Person getPerson() {
		Name name= new Name("Paul", "Walker");
		PhoneNumber mainPhone = new PhoneNumber(55,11,25588599);
		PhoneNumber mobilePhone = new PhoneNumber(55,11,994766387);
		Email email = new Email("paul.walker@yahoo.com.br");
		MetricHeight height = Height.METRIC(181);
		Country country = new Country("BR");
		
		Person person = new Person(name,mainPhone,mobilePhone,email,height,country);
		return person;
	}

	public Ticket getById(int ticketId) {
		return this.tickets.get(ticketId);
	}
	
	
	
	

}
