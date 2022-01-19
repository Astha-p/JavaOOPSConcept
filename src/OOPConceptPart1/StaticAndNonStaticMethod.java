package OOPConceptPart1;

public class StaticAndNonStaticMethod {

	String name = "Astha"; // global non static variable
	static int age= 21; // global static variable
	
	
	public static void main(String[] args) {
		
		// two ways to call static method and variable
		// 1. Direct calling
		num ();
		
		//2. calling by classname.method()
		StaticAndNonStaticMethod.num();
		
		System.out.println(age);
		System.out.println(StaticAndNonStaticMethod.age);
		
		// calling a non static method and variable
		
		StaticAndNonStaticMethod obj = new StaticAndNonStaticMethod();
		obj.calc();
		System.out.println(obj.name);
			
		
	}
	
	public void calc() {
		//non static method
		System.out.println("this is Non static method-calc()");
	}
	
	public static void num() {
		//static method
		System.out.println("this is static method-num() ");
	}

}
