import java.util.Scanner;

public class Encryp {
	/*
	public static void encrupt(String s) {
		String st = null;
		for(int i = 0;i < s.length();i++) {
			char a;
			int b;
			if(s.charAt(i) > 128) {
				
				b = 256 - s.charAt(i);
				a = (char) b;
			}else {
				a = (char) (128 + s.charAt(i));
			}
			st = st + a;
			System.out.print(a);
			
		}
		
	}
	
	public static void decrypt(String s) {
		String st = null;
		for(int i = 0;i < s.length();i++) {
			char a;
			int b;
			if(s.charAt(i) < 128) {
				
				b = 256 - s.charAt(i);
				a = (char) b;
			}else {
				a = (char) (s.charAt(i));
			}
			st = st + a;
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a string to get encrypted>>");
		
		String str = scan.nextLine();
		
		encrupt(str);
		
		
		System.out.println("Enter a string to decrypt");
		
		decrypt(str);
		
	}
	*/

	public static void crypto(String s) {
		for(int i = 0;i < s.length();i++) {
			char a;
			int b;				
				b = 287 - s.charAt(i);
				
				//
				a = (char) b;			
			
				//prints the char value in a character
				System.out.print(a);
		}
	}
	public static void cicada3301() {
		System.out.println("\r\n"
				+ "     \r\n"
				+ "     \r\n"
				+ "           ,,,,,,,,,,,                     ,,                        ,,,,,,,\r\n"
				+ "      ,▄@▀▀█▀▀▀▒▄▓▓▒▀▀▀▀██Ñ▄▄▄,,       ╓██▀▀▀███╖       ,,▄▄▄@█▀▀▀▀▀▀▓▓▓▀▓█▒▀▀██▄░\r\n"
				+ "     ▐█░▒▄@▀,╓░▓▌,╓╨%ÑÑ▀▀▀▀██▓▓█▓█▄▄,░░╙█▌▒▄░]▌▒░ ,,▄▄Ñ▀▀▒▄▄Ñ▀»@ÑÑ@Ñ▀▒░ ░▐█▒#▓▓▓▌\r\n"
				+ "      ▀▓▓▄█▀▒▄@┬▓█└#Ñ▀▀▓▀▓▓█▀▀▒▒████▀▀███▌▓▀╙▀▒▄███▀▓▓▓▓╢▒@@▄▓▓▀▀▀▀█▌░╙╥▄█▓▓█▓▀'\r\n"
				+ "        ░░▒▀▓▄█▀║▄╖╥▓█▀▄▄▄██▀▀▀▀▒╩╜╙,▓▓▓╙░▄▌░▄█▀▒▓▓▒╣╢▒▓▓▓▓██▄▓▓██▀░▒▄██▀▓▓▀'\r\n"
				+ "           ░╙╨▓▓▌░▄█▀▒▄▄▄█▒▓▀╙░░     j██▌╟▀╜▀▀▒H╖░░╙Ñ░░░╙╙Ñ██▌@▓▒░▒▀█▓▄▀▀ ░\r\n"
				+ "                ╙╙╙░ ▄▄▓▀▒▄█▄         ▓█▒e@╩Ñ▓░░╖░        ░██▒▀▓█▓▒░\r\n"
				+ "                   ░██▒▓▄▓▀▒#░        ╙█░╙▒╖░░▒ '        ░▐█░]▄▓█▓▀─\r\n"
				+ "                    ╙██▄▓▓▓░░▄░       ]█░']▒░╟Ü░░▓       ╓█▌░╓▓██▀\r\n"
				+ "                       ▀▓▓╬▒▀╨▀ÑM░     █▌ ╫▌╓╜░░▓░╢░ ░░▄@█▀█▀▀▀\"\r\n"
				+ "                                       ╙█▄╫Hm      `╙░   `\r\n"
				+ "                                        ╙█@░\r\n"
				+ "                                         ░█▌\r\n"
				+ "                                           ╙\r\n"
				+ "                                                                     \r\n"
				+ "                                                                     \r\n"
				+ "\t 333333333333333    333333333333333        000000000       1111111   \r\n"
				+ "\t3:::::::::::::::33 3:::::::::::::::33    00:::::::::00    1::::::1   \r\n"
				+ "\t3::::::33333::::::33::::::33333::::::3 00:::::::::::::00 1:::::::1   \r\n"
				+ "\t3333333     3:::::33333333     3:::::30:::::::000:::::::0111:::::1   \r\n"
				+ "\t            3:::::3            3:::::30::::::0   0::::::0   1::::1   \r\n"
				+ "\t            3:::::3            3:::::30:::::0     0:::::0   1::::1   \r\n"
				+ "\t    33333333:::::3     33333333:::::3 0:::::0     0:::::0   1::::1   \r\n"
				+ "\t    3:::::::::::3      3:::::::::::3  0:::::0 000 0:::::0   1::::l   \r\n"
				+ "\t    33333333:::::3     33333333:::::3 0:::::0 000 0:::::0   1::::l   \r\n"
				+ "\t            3:::::3            3:::::30:::::0     0:::::0   1::::l   \r\n"
				+ "\t            3:::::3            3:::::30:::::0     0:::::0   1::::l   \r\n"
				+ "\t            3:::::3            3:::::30::::::0   0::::::0   1::::l   \r\n"
				+ "\t3333333     3:::::33333333     3:::::30:::::::000:::::::0111::::::111\r\n"
				+ "\t3::::::33333::::::33::::::33333::::::3 00:::::::::::::00 1::::::::::1\r\n"
				+ "\t3:::::::::::::::33 3:::::::::::::::33    00:::::::::00   1::::::::::1\r\n"
				+ "\t 333333333333333    333333333333333        000000000     111111111111\r\n"
				+ "\t                                                                     \r\n"
				+ "\t                                                                     \r\n"
				+ "                                                         ");
	}

	//makes the main driver method
	public static void main(String[] args) {
		//makes a scanner object
		Scanner scan = new Scanner(System.in);
		
		//makes the loop infinite
		int i = 0;
		//infinite loop
		while(i == 0) {
			//prompt
			System.out.println("Enter a string to manipulate>>");
			
			//gets input from the user
			String str = scan.nextLine();
			if(str.length() == 3301) {
				break;
			}
			//runs the encryption method
			crypto(str);
			
			//adds a line for readability
			System.out.println("\n");
		}
		
		cicada3301();
	}
}
