package OOPConceptPart2;

public class TestInheritance {
	

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();//static polymorphism
		obj.Similar();
		obj.startA();
		obj.stopA();
		
		ClassB a = new ClassB();
		a.Similar();
		a.startB();
		a.stopB();
		
		//top casting
		ClassA x = new ClassB(); //child class object can be refer by parent class variable - dynamic polymorphism 
		x.Similar();
		
		//down casting
		//ClassB y = new ClassA();--> this is unavailable 
		ClassB y = (ClassB)new ClassA();
	}

}
