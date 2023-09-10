/**
    A class to test the Palindrome class.
    @author Brian Johnston
    @version 1.0
*/
public class Application {

	public static void main(String[] args) {
		
		Palindrome p1 = new Palindrome("raCEcar!!!");
		Palindrome p2 = new Palindrome("This is not a palindrome, I'm sure of it.");
		System.out.println(p1.test());
		System.out.println(p2.test());
		
		
	}

}
