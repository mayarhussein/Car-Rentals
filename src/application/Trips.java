package application;

public class Trips {
	private enum flavor { ONESTOP, NONSTOP, MANYSTOPS };
	flavor tripStops;
	private String type;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
}
