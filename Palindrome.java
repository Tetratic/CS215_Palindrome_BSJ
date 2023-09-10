/**
    A class to take a String and test whether or not it is a palindrome using a stack.
    @author Brian Johnston
    @version 1.0
*/
import java.util.Stack;

public class Palindrome {

	public String pali,palih;
	public String sub1,sub2;
	public char c1,c2;
	
	/**Preferred constructor that takes a string to check for the palindrome property.
	 * @param pali  a String to test.*/
	public Palindrome(String pali) {
		setPali(pali);
	}

	public String getPali() {
		return pali;
	}

	public void setPali(String pali) {
		this.pali = pali;
	}
	
	/**tests the String to see if it is a palindrome using a Stack.
	 * @return true if and only if the String is a palindrome, otherwise, false.*/
	public boolean test() {
		palih = this.pali.toLowerCase();
		palih = palih.replaceAll("[^0-9a-zA-Z]", "");//removes all special characters using a regex.
		StringBuilder sb = new StringBuilder(palih);
		//System.out.println(sb.toString());
		//uncomment to test the simplifying of the string.
		int l;
		if (palih.length() % 2 == 1) {
			l = sb.length() - 1;
			sb.deleteCharAt(l/2);
		}
		else {
			l = sb.length();
		}
		Stack<Character> s = new Stack<Character>();
		for (int i=0;i<l/2;i++) {
			s.push(sb.charAt(i));
			s.push(sb.charAt(l-i-1));
		}
		//System.out.println(s.toString());
		//uncomment to test the contents of the Stack
		int counter = 0;
		for (int i=0;i<l/2;i++) {
			c1=s.pop();
			c2 = s.pop();
			if (c1 == c2) {} 
			else if (c1 != c2) {
				break;
			}
			counter++;
		}
		
		if (counter == l/2) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
