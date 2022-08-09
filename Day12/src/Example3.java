
public class Example3 {

	public static void main(String[] args) {
		String str1 = "programme";

		String str2 = "programme";

		String s1 = new String("programme");

		String s2 = new String("programme");

		System.out.println(str1 == str2);

		System.out.println(str2 == s1);

		System.out.println(s1 == s2);
	}
}
