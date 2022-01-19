package OOPConceptPart1;

public class CallByReference {
	
	int a; // global variables
	int b;

	public static void main(String[] args) {
		CallByReference obj= new CallByReference();
		
		obj.a = 100;
		obj.b = 200;
		
		obj.swap(obj);
		//after swap
		System.out.println(obj.a);
		System.out.println(obj.b);
		

	}
	
	public void swap(CallByReference r) {
	
	// r is reference of the object
	
	int ref; // define new variable
	ref = r.a ; // value of "a" is assigned to new defined variable
	r.a = r.b ;  // value of "b" is assigned to variable "a"
	r.b = ref ;  // value of new defined variable is assigned to "b"
	
	}
}
