
		// TODO Auto-generated method stub
		  class student {
			int rollno;
			String name;
			float marks;
			
		public student(int  x, String y, float z) {
			rollno=x;
			name=y;
			marks=z;
				System.out.println("USER DEFINED PARAMETERIZED CONSTRUCTOR");
			}
		void display() {
			System.out.println("student rollno"+":"+rollno+" "+"student name"+":"+name+" "+"student marks"+":"+marks);
		}}
		public class cod1 {
			public static void main(String arg[]) {
				student s1=new student(101,"Ajay",81.5f);
				s1.display();
			}
	}


