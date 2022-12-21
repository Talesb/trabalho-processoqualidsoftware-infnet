package talesb.edu.infnet.qualidadesoftware.domain.valueobject;

public class Height {

	public static MetricHeight METRIC(double cm) {
		return new MetricHeight(cm);
	}
	
	public static ImperialHeight IMPERIAL(int feet,int inches) {
		return new ImperialHeight(feet,inches);
	}

}
