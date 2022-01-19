package OOPConceptPart1;


public class Car {

	int model;
	int wheel;

	public static void main(String[] args) {
		
		// new Car() is a object of car class
		//new keyword is used to create object in Java
		// a,b,c are the object reference variables
		
		Car a = new Car();
		Car b = new Car();
		Car c = new Car();
		
		a.model = 2019;
		a.wheel = 4;
		
		b.model = 2020;
		b.wheel = 4;
		
		c.model = 2021;
		c.wheel = 4;
		
		System.out.println("Before assigning the reference");
		System.out.println(a.model);  //2019
		System.out.println(a.wheel);  //4
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("Before assigning the reference");
		

		System.out.println(a.model);
		System.out.println(a.wheel);
		
		
		System.out.println("After shifting the reference");
		
		a.model = 2222;
		System.out.println(a.model);  //2222
		c.model = 2222;
		System.out.println(c.wheel);  //4
		System.out.println(c.model); 
		
	}

}
