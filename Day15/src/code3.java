class employee{
	int employeeid;
	String name;
	// custom constructor with no parameters
	employee(){
		employeeid=120;
		name="MNC Company";
		System.out.println("USER DEFINED NON ARGUMENT CONSTRUCTOR");
	}
	// custom constructor with  parameters
	 employee(int a,String n){
		 employeeid=a;
		 name=n;
		 System.out.println("USER DEFINED PARAMETERIZED CONSTRUCTOR");
	 }
	 void display() {
		 System.out.println("employee id="+employeeid+" "+"name="+name);
	 }
	
}
public class code3 {
	public static void main(String args[]) {
		employee c1=new employee();
		employee c2=new employee(50,"Capegmini");
		c1.display();
		c2.display();
		}
}