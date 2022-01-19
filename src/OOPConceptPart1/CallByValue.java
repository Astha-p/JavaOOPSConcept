package OOPConceptPart1;

public class CallByValue {
	
	

	public static void main(String[] args) {
		CallByValue obj= new CallByValue(); 
		int a = 100;
		int b = 100;
		obj.test(a,b); //value of this variables will assign to 2 input "test" method 
						//call by value
	}
	
	// now value of a = value with p
	//     value of b = value with q
	
	public int test(int p, int q) {
		int r= p+q;
		System.out.println(r);
		return r;
	}
	

}
