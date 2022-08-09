class key{
	// Defining this keyword
	
	void m() {
		System.out.println(this);
	}
}



public class code4 {

	public static void main(String[] args) {
	
		key obj=new key();
		System.out.println(obj);
		obj.m();
	}
}