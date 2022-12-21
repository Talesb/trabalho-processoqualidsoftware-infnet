package talesb.edu.infnet.qualidadesoftware.domain.valueobject;

public class PhoneNumber {

	private int countryCode;
	private int areaCode;
	private int number;

	protected PhoneNumber() {
		super();
	}

	public PhoneNumber(int countryCode, int areaCode, int number) {
		super();
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
	}

	public int getCountryCode() {
		return countryCode;
	}

	protected void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}

	public int getAreaCode() {
		return areaCode;
	}

	protected void setAreaCode(int areaCode) {
		this.areaCode = areaCode;
	}

	public int getNumber() {
		return number;
	}

	protected void setNumber(int number) {
		this.number = number;
	}

}
