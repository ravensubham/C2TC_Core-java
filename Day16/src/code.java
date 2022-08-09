import java.util.Scanner;
public class code {
	public static void main(String args[]) {
		Scanner ab =new Scanner(System.in);
		int var=ab.nextInt();
		String name=ab.next();
		String company1=ab.next();
		char gender=ab.next().charAt(0);
		System.out.println("Name="+ name);
		System.out.println( company1);
		System.out.println(" gender="+ gender);
		System.out.println(var);
		
	}

}
