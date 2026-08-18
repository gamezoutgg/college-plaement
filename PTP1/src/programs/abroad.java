package programs;

class abroad {
	private int a;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

}

public class abroad extends abroad {

	public static void main(String[] args) {
		abroad test = new abroad();// object
		test.setA(11);
		int aa = test.getA();
		System.out.println(aa);
	}
}