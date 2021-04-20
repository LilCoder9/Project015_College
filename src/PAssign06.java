import java.util.*;
public class PAssign06 {
	public static void main(String[] args) throws Exception {
			ArrayList<Vehicle> Nadeshot = new ArrayList<>();
			Nadeshot.add(new Car("Ford","Expedition",2020,8));
			Nadeshot.get(0).setReview("Big, spacious, and handy, the Expedition is a"
					+ " workhorse but falls short of more appealing rivals.");
			Nadeshot.add(new Car("Toyota","Camry",2019,5));
			Nadeshot.get(1).setReview("This latest Camry is the greatest in years.");
			Nadeshot.add(new Car("Mazda","MX5",2018,2));
			Nadeshot.get(2).setReview("A more characterful four-cylinder makes one of our favorites even better.");
			Nadeshot.add(new Truck("Ford","F-150",2016,10400));
			Nadeshot.get(3).setReview("Turns out there is a replacement for displacement.");
			Nadeshot.add(new Truck("Dodge","Ram 1500",2020,7730));
			Nadeshot.get(4).setReview("When only a pickup truck will do, the Ram 1500 is the one to choose.");
			System.out.println("All Vehicles:");
			printVehicle(Nadeshot);
			
	}
	static void printVehicle(ArrayList<Vehicle> printer) throws Exception {
		for(int i=0; i < printer.size(); i++) {
			System.out.println(printer.get(i).getDetailedInfo());
		}
	}

} 
abstract class Vehicle implements Reviewable{
	//all variables 
	private String make;
	private String model;
	private int year;
	private String review;
	private String type;
	//default constructor
	protected Vehicle() {
		type = "undefined";
		review ="none";
	}
	//convenice constructor ... also calling to default constructor
	protected Vehicle(String make, String model, int year) {
		super();
		setMake(make);
		setModel(model);
		setYear(year);	
	}
	//Getter and Setter for all the variables in this class
	String getMake() {
		return this.type;
	}
	void setMake(String make) {
		this.make = make;
	}
	String getModel() {
		return this.model;
	}
	void setModel(String model) {
		this.model = model;
	}
	int getYear() {
		return this.year;
	}
	void setYear(int year) {
		this.year = year;
	}
	String getReview() throws Exception{
		try {
		if(this.review.length() != 0) return this.review;
		}
		catch(Exception ex){
			this.review = "none";
			return this.review;
		}
		return "none";
	}
	void setReview(String review) {
		this.review = review;
	}
	String getType() {
		return this.type;
	}
	void setType(String type) {
		this.type = type;
	}
	//abstract method
	abstract String getDetailedInfo() throws Exception;
	//toString method hardcoded
	public String toString() {
		return String.format("%d %s %s (%s)\n",this.year, this.make,this.model, this.type);
	}
	
} 
class Car extends Vehicle{
	//all varaibles for car
	private int seatingCapacity;
	//constructor for Cars
	Car(String make, String model,int year, int seatingCapacity){
		super(make,model,year);
		setCapacity(seatingCapacity);	
		setType("Car");
	}
	//getters and Setter for car class
	int getCapacity() {
		return this.seatingCapacity;
	}
	void setCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}
	String getDetailedInfo() throws Exception{
		return this.toString() + String.format("Seating Capacity: %,d people\n",seatingCapacity) + this.getReview() + "\n";
	}
	@Override
	public void review(String write) {
		setReview(write);
		
	}
} 
class Truck extends Vehicle{
	//variable for truck
	private double maxLoadWeight;
	//constructor for Truck
	Truck(String make, String model,int year,double maxLoadWeight){
		super(make,model,year);
		setMax(maxLoadWeight);	
		setType("Truck");
	}
	//getters and setters for maxLoadWeight
	double getMax() {
		return this.maxLoadWeight;
	}
	void setMax(double maxLoadWeight) {
		this.maxLoadWeight = maxLoadWeight;
	}
	@Override
	String getDetailedInfo() throws Exception{
		return this.toString() +String.format("Max Load Weight: %,.02f lbs\n",maxLoadWeight) + this.getReview() + "\n";
	}
	@Override
	public void review(String write) {
		setReview(write);
		
	}

	} 




























//end