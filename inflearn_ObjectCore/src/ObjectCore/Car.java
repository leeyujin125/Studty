package ObjectCore;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void fuel();
	
	public void startCar() {
		System.out.println("시동 킴");
	}
	
	public void turnOff() {
		System.out.println("시동 끔");
	}
	
	public void washCar() {}
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		fuel();
		washCar();
	}
}
