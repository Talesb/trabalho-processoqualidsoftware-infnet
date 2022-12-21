package talesb.edu.infnet.qualidadesoftware.domain.valueobject;

public class Country {

	private String countryCode;

	protected Country() {
		super();
	}

	public Country(String countryCode) {
		super();
		this.countryCode = countryCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

}
