class Stdn {
	String name;
	int rollno;
	Stdn(){
		name="subham";
		rollno=5001;
		System.out.println("User defined non argument constructor");
		}
}
public class Code2 {
	public static void main(String args[]) {
		Stdn s1=new Stdn();
		System.out.println(s1.name);
		System.out.println(s1.rollno);
	}

}
