package ListConcepts;

// Finally keyword is always use with the try catch block
public class FinallyConcept {

	public static void main(String[] args) {
		test1(); // test1 method call 
		//test2();
		test3();
		//test4();
	}

	public static void test1() {
		
		try 
		{
			System.out.println("Inside try block1");
			throw new RuntimeException("test"); // throw an exception 
		}
		catch(Exception e)  //as soon as exception is throws, it comes inside the catch block
		{
			System.out.println("Inside Catch block1");	
		}
		finally //executed after the try catch block
		{
			System.out.println("Inside Finally block1");
		}
		System.out.println("......................");
	}
	
	public static void test2() { 
	//method without any exception throws ( finally will executed for sure, even exception is their or not)
	
	try 
		{
			System.out.println("Inside try block2");
		}
	finally 
	{
		System.out.println("inside finally block2");
	}
	System.out.println("......................");
   }
	
	public static void test3() {
	
		int i = 20;
		try 
		{
			System.out.println("Inside try block of dividion");
			int j = 20/0;
			 // throw an exception because divided by 0 is infinity and infinite can't handled in Java
		}
		catch(ArithmeticException e)  //as soon as exception is throws, it comes inside the catch block
		{
			System.out.println("Inside Catch block3");
			System.out.println("divided by zero error");
		}
		finally //executed after the try catch block
		{
			System.out.println("Execution Complete");
		}
		System.out.println("......................");
	}
	
	public static void test4() 
	{
	
	int a = 20;
	try 
	{
		System.out.println("Inside try block of dividion");
		int b = a/0;
		System.out.println(b);                           // throw an exception because divided by 0 is infinity and infinite can't handled in Java
	}
	catch(NullPointerException e)                       //as soon as exception is throws, it comes inside the catch block
	{		
														// nullpointerexception in catch so this block will skipped
		System.out.println("Inside Catch block4");
		System.out.println("divided by zero error");
	}
	finally //executed after the try catch block
	{
		System.out.println("Execute this even after any exception");
	}
	System.out.println("......................");
	}
	
}
