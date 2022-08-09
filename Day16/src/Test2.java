class StaticMethod{
	static String college="acharya";
	 public static void display() {
		college="ABC";
		System.out.println("college="+ college);
	}		

	
}

public class Test2 {

	public static void main(String[] args) {
		StaticMethod.display();
	}

	

}
