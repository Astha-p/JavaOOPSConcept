package AbstractionConcept;

public interface Car {
	
	//only final & static variable can be defined 
	//Always define only abstract method 
	//We achieve 100% abstraction 
	//No method body 
	//Only method declaration 
	//Can not create the object of interface 

	int wheel = 4; 

	public void start(); 
	public void stop(); 
	public void refuel(); 

}


//100% abstraction --> every method in the class is abstracted
//Partial abstraction --> few method in the class are abstract file and few are non static  