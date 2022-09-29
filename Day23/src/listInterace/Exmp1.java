package listInterace;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Exmp1 {

	public static void main(String[] args) {
		List <String> st=new ArrayList<>();
	    st.add( "subham");
        st.add("raj");
        st.isEmpty();
        st.add("ajay");
        st.add("rahul");
        st.add(0, "from");
        System.out.println(st);
        Iterator e=st.iterator();
        while(e.hasNext()) {
        	System.out.println(e.next());
        }
	}

}
