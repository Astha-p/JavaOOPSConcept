package Practice1210;

public class ForWhileLoop {

	public static void main(String[] args) {
		
		int i = 0;
		
// print numbers from 0 to 10, Except 10
		
		while (i<10) {
			System.out.println(i);
			i = i+1;
		}
		System.out.println("It's Over");
	
// print numbers from 10 to -5, Except -5		
		
		for (int a=10;a>-5;a--) {
			System.out.println(a);
		}
	}

}
