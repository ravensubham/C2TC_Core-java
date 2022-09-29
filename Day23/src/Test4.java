
public class Test4 
{
	int length ;
	int width;
	void get(int a,int b)
	{
		length =a;
		width =b;
	}
	int area() {
		int rectarea=length*width;
		return rectarea;
	}
	public static void main(String args[]) {
		Test4 obj=new Test4();
		obj.get(3,4);
		int result=obj.area();
		obj.get(2, 5);
		int result1=obj.area();
		System.out.println(result);
		System.out.println(result1);
		
	}

}
