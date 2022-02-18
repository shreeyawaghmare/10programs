
public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 String str = "ABCDCBA", reversestr = "";
 int strlength = str.length();
 for (int i = (strlength - 1); i >=0; --i) {
	 reversestr = reversestr + str.charAt(i);
 }
 if (str.toLowerCase().equals(reversestr.toLowerCase()))
 {
	 System.out.println(str + " Is a Palindrome string.");
 }
 else {
	 System.out.println(str + " Is not a Palindrome string.");
	 
 }
	}

}
