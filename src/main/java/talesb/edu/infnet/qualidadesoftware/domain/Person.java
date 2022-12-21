package talesb.edu.infnet.qualidadesoftware.domain;

import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Country;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Email;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.MetricHeight;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.Name;
import talesb.edu.infnet.qualidadesoftware.domain.valueobject.PhoneNumber;

public class Person {

	private int id;
	private Name name;
	private PhoneNumber mainPhone;
	private PhoneNumber mobilePhone;
	private Email email;
	private MetricHeight height;
	private Country country;

	public Person(Name name, PhoneNumber mainPhone, PhoneNumber mobilePhone, Email email, MetricHeight height,
			Country country) {
		super();
		this.name = name;
		this.mainPhone = mainPhone;
		this.mobilePhone = mobilePhone;
		this.email = email;
		this.height = height;
		this.country = country;
	}

	protected Person() {
		super();
	}

	public int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	protected void setName(Name name) {
		this.name = name;
	}

	public PhoneNumber getMainPhone() {
		return mainPhone;
	}

	protected void setMainPhone(PhoneNumber mainPhone) {
		this.mainPhone = mainPhone;
	}

	public PhoneNumber getMobilePhone() {
		return mobilePhone;
	}

	protected void setMobilePhone(PhoneNumber mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Email getEmail() {
		return email;
	}

	protected void setEmail(Email email) {
		this.email = email;
	}

	public MetricHeight getHeight() {
		return height;
	}

	public void setHeight(MetricHeight height) {
		this.height = height;
	}

	public Country getCountry() {
		return country;
	}

	protected void setCountry(Country country) {
		this.country = country;
	}

}
