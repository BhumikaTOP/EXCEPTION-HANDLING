package abc;

public class ABC {

	public static void main(String[] args) {
		System.out.println("I AM FINE");
		System.out.println("YOU LOOK GREAT");
		try {
			System.out.println("HELLO");
			String s = null;
			int a = 10/0;
			System.out.println(a);
			System.out.println(s.length());
			System.out.println("code executed");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
