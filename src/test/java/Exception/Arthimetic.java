package Exception;

public class Arthimetic {
	public static void main(String[] args) {
		System.out.println("main started");
		try {
			System.out.println(4/2);
		}
		catch(ArithmeticException e) {
			System.out.println("ex handled");
			
		}
		System.out.println("main ended");
	}

}
