package listInterace;

import java.util.LinkedList;
import java.util.List;

public class Exmp2 {

	public static void main(String[] args) {
		List li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add("subham");
		System.out.println(li);
		for(Object i: li) {
			System.out.println(i);
		}

	}

}
