package day20;


interface vech{
	void speed();
}
interface bike extends vech{
	void milege();
}
  class coding4 implements bike{
	public void speed() {
		System.out.println("speed is 40km/hr");
	}
	public void milege(){
		
		System.out.println("miledge is 80");
	}




	public static void main(String[] args) {
		// TODO Auto-generated method stub
       coding4 obj=new coding4();
       obj.speed();
       obj.milege();
	}


}
