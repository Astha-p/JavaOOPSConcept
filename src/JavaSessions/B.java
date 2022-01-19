package JavaSessions;

// "super" keyword is used to call parent class constructor
// only one super keyword in one constructor can be used

public class B extends A {

	public B() {
		super(10); // 1 parameter Constructor from class A is called
		// super(100,101); ---> this is not possible
		System.out.println("Parent Class constructor - 1 parameter");

	}

	public B(int i, int j) {

		super(100, 101); // 2 parameter Constructor from class A is called
		System.out.println("Parent Class constructor - 2 parameter ");

	}

	public static void main(String[] args) {

		B obj = new B();

	}
}
