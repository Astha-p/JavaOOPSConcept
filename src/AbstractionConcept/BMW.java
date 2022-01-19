package AbstractionConcept;

//BMW is an abstract class - child 
//can not create a object of abstract class as well as interface 

public class BMW implements Car {

	@Override
	public void start() {
		System.out.println("BMW --> Start method");

	}

	@Override
	public void stop() {
		System.out.println("BMW --> Stop method");

	}

	@Override
	public void refuel() {
		System.out.println("BMW --> Refuel method");

	}

	public void safty() { // non overridden method
		System.out.println("BMW --> safty ");

	}

}
