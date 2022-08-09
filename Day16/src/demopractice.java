class practice{
	practice(){
		System.out.println(" a hello");
	}
	practice(int x){
		this();
		System.out.println(x);
	}
}
public class demopractice {
	public static void main(String args[]) {
		practice obj=new practice(50);
	}
}
