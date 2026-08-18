package programs;

// poly morphism
//method overloading
// method overriding

public class overloading {
	void minbal() {
		System.out.println("sdfa");
	}
	void minbal(int a) {
	
		System.out.println("dfasdfasdfasfas");
	}
	public static void main(String[] args) {
		overloading test = new overloading();// object
		test.minbal();
		test.minbal(3);
	}
}