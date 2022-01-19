package AbstractionConcept;

// minimum  1 Abstract method is compulsory to create abstract class 
// abstract methods have no body  
// abstraction means hide some implementation logic 

public abstract class Bank {

	public abstract void loan(); // abstract method

	public static void main(String[] args) {

	}

	public void Credit() {

		System.out.println("Credit method - Bank class");

	}

	public void Debit() {

		System.out.println("Debit method - Bank class");

	}

}
