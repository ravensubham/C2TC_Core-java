package day20;

	
		// TODO Auto-generated method stub
		interface Abc
		{
			void show();	
		}
		
		interface Mno
		{
			void xyz();	
		}
		
		
		 class coding2 implements Abc,Mno
		{
			 public void show() {
				System.out.println("subham");
			}
			 public void xyz() {
					System.out.println("Raj");
				}
		
			 
			 public static void main(String[] args) {
				 coding2 obj=new coding2();
					obj.show();
					obj.xyz();
			 }
			
			
		}

