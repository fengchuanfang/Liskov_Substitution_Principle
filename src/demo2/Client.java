package demo2;

public class Client {
	public static void main(String args[]){
		drive(new CommonCar());
		drive(new AutomaticCar());
		
		autoDrive(new AutomaticCar());
	}
	
	public static void drive(AbstractCar car){
		car.run();
	}
	
	public static void autoDrive(AutomaticCar car){
		car.autoRun();
	}
}
