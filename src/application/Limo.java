package application;

public class Limo extends Vehicle{
	String model;

	public Limo(String model,String Plate,int maxPassengerNum,String driverName) {
		super(Plate, maxPassengerNum, driverName);
		this.model = model;
	}
	

}
