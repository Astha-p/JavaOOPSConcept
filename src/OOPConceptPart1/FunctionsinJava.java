package OOPConceptPart1;

public class FunctionsinJava {

	public static void main(String[] args) {
		
		 FunctionsinJava obj =  new FunctionsinJava();
		 
		//new FunctionsinJava()--> is the object
		 //obj --> if the object reference name 
		 
		 obj.test();
		 
		 int i= obj.sum();
		 System.out.println(i);

		 String s= obj.abc();
		 System.out.println(s);
		 
		 int p= obj.division(50,25);
		 System.out.println(p);
		  
		 
	}
	
	// Non static methods
	
	public void test() {
	 
		//void does not return an value
		//when you use void, can't use return
		
	 System.out.println("Test Executed");  //no input, no output
 }
	
	public int sum() {
		
		System.out.println("Sum of a and b is - "); // no input,some output
		int a = 100;
		int b = 200;
		int c = a+b;
		
	
		return c;
			
	}
	public String abc() {
		System.out.println("method abc");  // no input,some output 
		String a = "Astha";
		
		return a;
	}
	
	public int division(int x,int y) {
		
		System.out.println("Output of division method");
		int d = x/y;
		
		return d;
		
		
	}
 
}

// To call non static method of any class,you have to use object 
// copy of all non static methods is assigned to our object 
// To call this non static methods in main class--> use "obj.method name()"
