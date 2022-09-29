package listInterace;

import java.util.ArrayList;

public class Exmp3 {
	public static void main(String[] args) {
		ArrayList <Object> li=new ArrayList<>();
		li.add("257");
		li.add(0, "first");
		System.out.println(li.contains("257"));	
		li.size();
		ArrayList <Object> set =new ArrayList<>();
		set.addAll(li);
		set.containsAll(li);
		System.out.println(li);
		System.out.println(set);

	}

}
