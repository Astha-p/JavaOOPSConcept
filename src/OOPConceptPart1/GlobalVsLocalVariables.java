package OOPConceptPart1;

public class GlobalVsLocalVariables {
	
	String location= "A'bad"; // global variable
	int num = 07;
	
	// variables created before main method are the global variable
	// we can use it anywhere in the program 
	// we have to create an object to call global variables in method
	
	public static void main(String[] args) {
		
		int a= 111; // local variables
		int b= 222;
		System.out.println(a);
		System.out.println(b);
		
		GlobalVsLocalVariables obj = new GlobalVsLocalVariables();
		System.out.println(obj.location);
		System.out.println(obj.num);
		
		int x= obj.abc();
		System.out.println(x); // calling a non static method abc inside the main method

		

	}
	
	public int abc() {
		
		int a= 100; //If methods are different then we can create the variable with similar name..because "a" is local variable
		System.out.println("Print a="+a);
		
		GlobalVsLocalVariables obj = new GlobalVsLocalVariables();
		System.out.println(obj.location);
		
		return a;
		
	}

}
