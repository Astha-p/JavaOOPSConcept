 package JavaSessions;

//"this" keyword is used to initialize the class variable
//this.globalvariable = local variable
//if we want to use global variable in constructor, use "this" keyword
//Constructor can be overloaded (default, 1 parameter, 2 parameter)

public class ConstructorWithThisKeyword {

	String n; // global variable
	int i;

	public ConstructorWithThisKeyword(String name, int i) {

		this.n = name;
		this.i = i;

		System.out.println(name);
		System.out.println(i);

	}

	public static void main(String[] args) {

		ConstructorWithThisKeyword obj = new ConstructorWithThisKeyword("Astha", 010);
		ConstructorWithThisKeyword obj1 = new ConstructorWithThisKeyword("Heli", 001);
		
		System.out.println(obj.n + " " + obj.i);
	}

}
