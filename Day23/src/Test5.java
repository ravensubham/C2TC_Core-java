
public class Test5 {
	String name;
	public static void main(String[] args) {
	Test5 c1 = new Test5();
	c1.name = " C2TC ";
	Test5 c2 = c1;
	c1 = null;
	System.out.println(c2.name);
	new Test5();
	Test5 c3;
	c3.name = " C2TC ";
	System.out.println(c3.name);}}


