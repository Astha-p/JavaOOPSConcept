package OOPConceptPart1;

public class WrapperClass {

	public static void main(String[] args) {
		
		String a= "100";
		System.out.println(a+10);
		
		// Data conversion
		//string to integer,double,boolean
		
		int i = Integer.parseInt(a);
		System.out.println(i);

		
		double d= Double.parseDouble(a);
		System.out.println(d);

		//String s1= "True";
		//boolean b = Boolean.parseBoolean(s1);
		
		boolean b = Boolean.parseBoolean(a);
		System.out.println(b);
		
		
		//integer to string conversion using valueOf()
	
		int p = 200;
		System.out.println(p+25);
		
		String s2= String.valueOf(p);
		System.out.println(s2);
		
		
		
		
	}

}
