package talesb.edu.infnet.qualidadesoftware.domain.valueobject;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email {

	private String email;

	private static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern
			.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

	protected Email() {
		super();
	}

	public Email(String email) {
		super();
		if(!isValid(email)) {
			throw new RuntimeException("Please fill with a valid e-mail");
		}
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	protected void setEmail(String email) {
		this.email = email;
	}

	public static boolean isValid(String email) {
		Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(email);
		return matcher.find();
	}

}
