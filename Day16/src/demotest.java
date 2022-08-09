


class tested{
	void method(tested a) {
		System.out.println("method is invoked");
	}
	void point() {
		method(this);
	}
	
}
public class demotest {
	// justifying the method
	public static void main(String args[]) {
		tested s1=new tested ();
		s1.point();
		
	}
	

}
