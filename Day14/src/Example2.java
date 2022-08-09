class Car{
   public Car()
   {
	System.out.println("Class Car");
   }
   public void vehicleType()
   {
	System.out.println("Vehicle Type: Car");
   }
}
class Audi extends Car{
   public  Audi()
   {
	System.out.println("Class Audi");
   }
   public void brand()
   {
	System.out.println("Brand: Audi");
   }
   public void speed()
   {
	System.out.println("Max: 210Kmph");
   }
}
 class AudiQ6 extends Audi{

   public void model()
   {
	System.out.println("Audi Model: Q6");
   }
   public void speed()
   {
	System.out.println("Max: 250kmph");
   }
  
}





public class Example2 {

	public static void main(String[] args) {
		// multiple inheritance
		
		Audi obj=new Audi();
		 obj.vehicleType();
		 obj.brand();
		 obj.speed();

	}

}
