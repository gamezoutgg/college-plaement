package programs;

// poly morphism
//method overloading
// method overriding

public class morphism {
	void m1() {
		System.out.println("sdfa");
	}
	void m1(int a) {
		System.out.println("dfasdfasdfasfas");
	}
	public static void main(String[] args) {
		morphism test = new morphism();// object
		test.m1();
		test.m1(3);
	}
}