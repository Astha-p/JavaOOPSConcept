package OOPConceptPart2;
// India is the parents class
public class India implements Gujarat,Manali 
{

	public static void main(String[] args)
	{
		 India a = new  India();
		 a.method1();
		 a.method2();
		 a.method3();
		 a.method4();
		 a.only();
		 a.trip(); 
		 
	}
	
		public void method1() 
		{
		System.out.println("Method 1");
		}
		
		public void method2() 
		{
		System.out.println("Method 2");
		}
		public void method3() 
		{
		System.out.println("Method 3");
		}
		public void method4() 
		{
		System.out.println("Method 4");
		}
		
		public void only() 
		{
		System.out.println("only mehod");
		}
		
		public void trip() 
		{
		System.out.println("Waiting...");	
		}
	

	
}		
	// multiple Parent class- multiple interfaces 	
		

