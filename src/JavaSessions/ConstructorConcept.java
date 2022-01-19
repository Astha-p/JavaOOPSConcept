package JavaSessions;

// constructor used to call the property which is aleady in another class
public class ConstructorConcept {
	
	public ConstructorConcept() { // default const. is always their, no need to write this
		
		System.out.println("Default Constructor");
		
	}
	
	public ConstructorConcept(int i) {
		
		System.out.println("One parameter Constructor");
		System.out.println(i);
		
	}
	
	public ConstructorConcept(int i,int j) {
		
		System.out.println("Two parameter Constructor");
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1= new ConstructorConcept(10);
		ConstructorConcept obj2=new ConstructorConcept(10,20);

	
}
}
