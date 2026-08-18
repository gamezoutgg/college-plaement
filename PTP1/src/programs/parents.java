package programs;



//poly morphism
//method overloading
//method overriding


class Parents
{
void property()
{
	   System.out.println("Property");
}
void marry()
{
	   System.out.println("famaily selected girl/boy");
}
}
public class parents extends Parents {
	void marry()
	{
		System.out.println("campus selected girl/boy");
	}
	public static void main(String[] args) {
		parents test = new parents();// object
		test.marry();
		test.property();
	
	}
}
