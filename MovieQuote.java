import java.util.Scanner;

public class MovieQuote {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("Enter 3 first names>>");
		String name1, name2, name3;
		name1 = scan.nextLine();
		name2 = scan.nextLine();
		name3 = scan.nextLine();
		
		
		System.out.println(name1 + " " + name2);
		System.out.println(name2 + " " + name3);
		System.out.println(name3 + " " + name1);
		System.out.println(name1 + " " + name3);
		System.out.println(name2 + " " + name1);
		System.out.println(name3 + " " + name2);
		System.out.println();
		
		String quote = "You tell 'em I'm coming, and hell's coming with me, you hear?";
		int letter = 0;
		int digit = 0;
		int space = 0;
		int special = 0;
		for(int i = 0; i < quote.length();i++) {
			if(Character.isLetter(quote.charAt(i))) {
				letter++;
			}else {
				if(Character.isDigit(quote.charAt(i))) {
					digit++;
				}else {
					if(Character.isWhitespace(quote.charAt(i))) {
						space++;
					}else {
						special++;
					}
				}
			}
		}
		
		System.out.println(quote);
		System.out.println("It has " + letter + " letters, " + digit + " digits, " + space + " spaces, and " + special + " special characters.");
		System.out.println("\nEnter your own quote>>");
		String userQuote = scan.nextLine();
		letter = 0;
		digit = 0;
		space = 0;
		special = 0;
		for(int i = 0; i < userQuote.length();i++) {
			if(Character.isLetter(userQuote.charAt(i))) {
				letter++;
			}else {
				if(Character.isDigit(userQuote.charAt(i))) {
					digit++;
				}else {
					if(Character.isWhitespace(userQuote.charAt(i))) {
						space++;
					}else {
						special++;
					}

				}
			}
		}
		System.out.println("It has " + letter + " letters, " + digit + " digits, " + space + " spaces, and " + special + " special characters.");
	}
}
