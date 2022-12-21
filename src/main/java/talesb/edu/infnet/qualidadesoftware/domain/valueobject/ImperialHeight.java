package talesb.edu.infnet.qualidadesoftware.domain.valueobject;

public class ImperialHeight {

	private int feet;
	private int inches;

	public ImperialHeight(int feet, int inches) {
		this.feet = feet;
		this.inches = inches;
	}
	
	
	protected ImperialHeight() {
	}

	public int getFeet() {
		return feet;
	}

	protected void setFeet(int feet) {
		this.feet = feet;
	}

	public int getInches() {
		return inches;
	}

	protected void setInches(int inches) {
		this.inches = inches;
	}


	@Override
	public String toString() {
		return  feet +" feet " + inches + " inches ";
	}
	
	
	

}
