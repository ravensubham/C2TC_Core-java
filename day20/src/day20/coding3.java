package day20;
import java.util.Scanner;


interface customer{
	void input();
	void output();
}
 class coding3 implements customer {
	
	String name;
	int custid ;
	
	public void input() {
		
		Scanner s = new Scanner(System.in);
	System.out.println("Enter name");
	name=s.nextLine();
	System.out.println("Enter customer id");
	custid=s.nextInt();
	
	}
	
	public void output() {
		System.out.println(name+" "+custid);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     coding3 obj = new coding3();
     obj.input();
     obj.output();
	}

}
