
public class Test3 {
	String name;      
	public static void main(String args[]) {
		Test3 c=new Test3();
		Test3 c1=c;
		c1.name="plan";
		String d=c1.name;
		System.out.println(d);
		System.out.println(c1.name);
		
	}

}
