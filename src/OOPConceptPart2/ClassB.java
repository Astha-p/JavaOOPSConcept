package OOPConceptPart2;

// Class A --> Parents class
// Class B --> Child class

// when same method is present in Parent class as well as in the child class with same num of arguments, 
// its called method over-riding


public class ClassB extends ClassA{

	public static void main(String[] args) {
		
		ClassB obj = new ClassB();
		obj.Similar(); //when both the class having same method,method from child class will be printed 
		obj.startB();
		obj.stopB();
		
		ClassA x= new ClassA();
		x.Similar();
		x.Similar(101);
		x.Similar(102);


	//ClassA mn = new ClassA();
		//mn.Similar(100);
		//mn.Similar(100,200);
	}
	
	public void Similar() {
		
		System.out.println("Similar Method classB");//overridden method
	}
	
	
	public void startB() {
		
		System.out.println("Class B startB Method");
	}
	
	public void stopB() {
		
		System.out.println("Class B stopB Method");
		
	}
	
	

}
