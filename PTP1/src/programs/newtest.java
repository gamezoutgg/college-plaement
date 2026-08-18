package programs;

public class newtest {
	int a = 20;
	int b = 10;

	void m1(int a,int b ) {
		System.out.println("asdfas"+(this.a+this.b));

		System.out.println("dfasdf "+(a+b));
//		System.out.println("dfasdf "+(c+d));
	}

	public static void main(String[] args) {
		newtest   vv = new newtest();
		vv.m1(4,3);
	}
}