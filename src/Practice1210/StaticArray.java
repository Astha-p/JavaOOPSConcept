package Practice1210;

public class StaticArray {

	public static void main(String[] args) {
		 
		//Static array 
		
		String[] s = { "Good","Vibes"};
		System.out.println(s[0]);
		System.out.println(s[1]);
		
		int[] i = {10,100,1000};
		System.out.println(i[0]);
		System.out.println(i[1]);
		
		
		System.out.println(s.length);
		System.out.println(i.length);
		
		//another syntax for array
		
		char c[]= new char[4];
		c[0] = 1;
		c[1] = 'A';
		c[2] = '&';
		c[3] = '.';
		
		System.out.println(c[1]);
		System.out.println(c[3]);
		
		
	}

}
