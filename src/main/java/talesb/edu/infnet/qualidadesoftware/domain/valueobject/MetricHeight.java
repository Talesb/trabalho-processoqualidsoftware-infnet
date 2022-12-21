package talesb.edu.infnet.qualidadesoftware.domain.valueobject;

public class MetricHeight {

	private double cm;

	public MetricHeight(double cm) {
		super();
		this.cm = cm;
	}

	protected MetricHeight() {
		super();
	}

	public double getCm() {
		return cm;
	}

	public void setCm(double cm) {
		this.cm = cm;
	}

	@Override
	public String toString() {
		return cm + "cm";
	}

	
	
	
}
