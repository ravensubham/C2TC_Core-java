class teststudent{
	int roll_no;
	String name;
	float marks;
public teststudent(int roll_no, String name, float marks) {
		this.roll_no = roll_no;
		this.name = name;
		this.marks = marks;
	}
void show() {
	System.out.println(roll_no+" "+name+" "+marks);
}}


public class code5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teststudent a1=new teststudent(41,"subham", 70.35f);
		teststudent a2=new teststudent(36,"rahul",95f);
		a1.show();
		a2.show();
		
	}

}
