package talesb.edu.infnet.qualidadesoftware.domain;

import java.util.ArrayList;
import java.util.List;

public class Ticket {

	private int id;
	private Person person;
	private List<Product> product;
	private Person assignedAgent;
	private List<Message> messages;
	
	

	public Ticket(Person person, List<Product> product, Person assignedAgent) {
		super();
		this.person = person;
		this.product = product;
		this.assignedAgent = assignedAgent;
		this.messages = messages;
	}

	public Person getPerson() {
		return person;
	}

	protected void setPerson(Person person) {
		this.person = person;
	}

	public List<Product> getProduct() {
		return product;
	}

	protected void setProduct(List<Product> product) {
		this.product = product;
	}

	public Person getAssignedAgent() {
		return assignedAgent;
	}

	protected void setAssignedAgent(Person assignedAgent) {
		this.assignedAgent = assignedAgent;
	}

	public List<Message> getMessages() {
		return messages;
	}

	protected void setMessages(List<Message> messages) {
		this.messages = messages;
	}

	public void addMessage(Message message) {
		if (this.messages == null) {
			this.messages = new ArrayList<>();
		}
		this.messages.add(message);
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	
	
	
}
