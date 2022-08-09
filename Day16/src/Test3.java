import java.util.Scanner;
class staticvariable{
	int admissionNo;
	String name;
	static String collegename ="Acharya";
	public staticvariable(int admissionNo, String name) {
		this.admissionNo = admissionNo;
		this.name = name;
	}
	void show() {
		System.out.println("admissionNo="+admissionNo+" "+"name="+name+" "+"college name="+ collegename);
	}
}
public class Test3 {
	public static void main(String args[]) {
		Scanner sc=new  Scanner(System.in);
		int rollno1=sc.nextInt();
		String name1=sc.next();	
		int rollno2=sc.nextInt();
		String name2=sc.next();
		staticvariable a1= new staticvariable( rollno1, name1);
		staticvariable a2=new staticvariable(rollno2,name2);
		a1.show();
		a2.show();
		
		
	}

}

