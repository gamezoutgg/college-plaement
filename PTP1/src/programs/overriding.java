package programs;


// poly morphism
//method overloading
// method overriding

public class Dmeo {
	void minbal() {
		System.out.println("sdfa");
	}
	void minbal(int a) {
	
		System.out.println("dfasdfasdfasfas");
	}
	public static void main(String[] args) {
		Dmeo test = new Dmeo();// object
		test.m1();
		test.m2(3);
	}
}