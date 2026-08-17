package program;

public class Variables {
	int a = 66; // instance 
   static	int cc = 99;
	void m1() {
		int a = 10;
		System.out.println("gsdfgsdkl" + a);
	}
	public Variables() {
		int b = 10;
		System.out.println("sdf" + b);
	}
	public static void main(String[] args) {
		Variables test = new Variables();// object
		test.m1();
		System.out.println("tyhank you"+test.a);
		System.out.println(cc);
		System.out.println(Variables.cc);

	}
}

/*
 * 1)create 2) display 3) rasie sal 4) exit 1)enter the name 2)enter the age
 * 3)enter the deisignation (PMT)
 */