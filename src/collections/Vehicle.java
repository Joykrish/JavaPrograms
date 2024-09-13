package collections;

public class Vehicle {
	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", fourWdrive=" + fourWdrive + "]";
	}
	String make;
	String model;
	int price;
	boolean fourWdrive;
	
	
	Vehicle(String make,String model,int price,boolean fourWdrive){
		this.make=make;
		this.model=model;
		this.price=price;
		this.fourWdrive=fourWdrive;
		
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean isFourWdrive() {
		return fourWdrive;
	}
	public void setFourWdrive(boolean fourWdrive) {
		this.fourWdrive = fourWdrive;
	}
	
	

}
