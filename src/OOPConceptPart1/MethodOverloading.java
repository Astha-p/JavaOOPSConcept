package OOPConceptPart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading(); 
		
		obj.name();
		obj.name("Astha");//this value will automatically assigned to 1 input method
		obj.name("Astha ","Patel");//this value will automatically assigned to 2 input method
		
	}
	//you can create multiple methods with similar name , but number of inputs should be different 
	public void name() 
	{
		
		System.out.println("zero input method");
	}
	
	public  void name(String s1)
	{
		System.out.println("1 input method");
		System.out.println(s1);
	}
	
	public void name(String a1, String a2) 
	{
		System.out.println("2 input method");
		System.out.println(a1+a2);
		
	}
}
