class Animals{
	
   void	eat(){
		System.out.print("eating");
	}
}

class fish extends Animals{
	
	void swim(){
		System.out.print("swimming");
	}
	
}


public class Example1 {

	public static void main(String[] args) {
		// single inheritance
        
		fish f = new fish();
		
		f.eat();
		f.swim();
		
	}

}
