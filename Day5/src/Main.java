class Student{
	String name;
	int rollno;
}
public class Main {

	public static void main(String[] args) {
		// created object using default constructor
       Student s1 = new Student();
       s1.name = "Subham";
       s1.rollno = 101;
       System.out.print(s1.name+" "+s1.rollno);
	}

}
