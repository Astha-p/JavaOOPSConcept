package OOPConceptPart2;

//Class A --> Parent class
//Class B --> Child class

public class ClassA {

	public static void main(String[] args) {
		
		ClassA obj = new ClassA();
		obj.Similar();
		//obj.startA();
		//obj.stopB();
		
		obj.Similar(1);
		obj.Similar(11);
		
	//  ClassA mn = new ClassA();
	//	mn.Similar(100);
	//	mn.Similar(100,200);
		
	}
	public void Similar()
	{
		
		System.out.println("Similar Method  ");
		
	}
	
	
	
	public void Similar(int p)
	{
		
		System.out.println("Similar Method 1 argument ");
		System.out.println(p);
	}
	
	public void Similar(int z, int v)
	{
		
		System.out.println("Similar Method 2 arguments");
		System.out.println(z+v);
	}
	
	public void startA() {
		
		System.out.println("Class A startA Method");
	}
	
	public void stopA() {
		
		System.out.println("Class A stopA Method");
		
	}

}
