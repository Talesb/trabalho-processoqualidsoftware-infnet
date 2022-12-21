package talesb.edu.infnet.qualidadesoftware.domain;

public class Message {

	private String subject;
	private String messageBody;

	private Message() {
		super();
	}

	public Message(String subject, String messageBody) {
		super();
		this.subject = subject;
		this.messageBody = messageBody;
	}

	public String getSubject() {
		return subject;
	}

	protected void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessageBody() {
		return messageBody;
	}

	protected void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

}
