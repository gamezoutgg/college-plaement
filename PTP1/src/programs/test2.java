package programs;

public class test2 {
	int a ;
	int b ;

	void m1(int c,int d ) {
	 a=c;
	 b=d;
	}
	void m2() {
	 System.out.println(a+b);
	}

	public static void main(String[] args) {
		test2   vv = new test2();
		vv.m1(4,3);
		vv.m2();
	}
}
