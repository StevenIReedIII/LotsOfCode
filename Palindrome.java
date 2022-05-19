import java.util.Scanner;

public class Palindrome {

	static boolean isPalindrome(String string) {//beginning of the module
		int i, j;
		j = string.length()-1;
		i = 0;
		
		while(i < j) {
			
			if(string.charAt(i) != (string.charAt(j))) {
				return false;
			}
			
			
			i++;
			j--;
			return true;
		}
		return false;
		}//end of the module


	
	//creates the main method
	public static void main(String[] args) {//beginning of the module
		
		//creates a scanner object
		Scanner scan = new Scanner(System.in);
		
		//declares a variable
		String str;
		
		//prompts
		System.out.println("Enter a string to check if it is a palindrome>>");
		
		//gets input from the string
		str = scan.nextLine();
		
		System.out.println((isPalindrome(str))?  "The string is a palindrome.":"The string is not a palindrome.");
		
		System.out.println("Enter an integer to check if it is a palindrome>>");
		
		int numericPalin = scan.nextInt();
		
		String str2 = Integer.toString(numericPalin);
		
		System.out.println((isPalindrome(str2))?  "The integer is a palindrome.":"The integer is not a palindrome.");
		
		
		}//end of the module
}//end of the class
