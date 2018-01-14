package demo2;

public class AutomaticCar extends AbstractCar{

	@Override
	public void run() {
		System.out.println("汽车行驶");
	}
	
	public void autoRun(){
		System.out.println("自动行驶");
	}

}
