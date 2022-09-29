package listInterace;

import java.util.LinkedList;

public class Linkledlist1 {
		public static void main(String args[]){
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("Ravi");
		ll.add("rana");
		LinkedList<String> ll3=new LinkedList<String>();
		ll3.add("subham");
		ll3.add("Rahul");
		ll.addAll(1, ll3);
		System.out.println("After invoking addAll method: "+ll);

		}

		}


