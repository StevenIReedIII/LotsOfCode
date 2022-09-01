import java.util.Arrays;

public class Rounding {

	public static void main(String[] args) {
		
		
		
		
		
		//you enter the number you want rounded in the first parameter
		//the second number is the placing you want
		//1 for 10ths
		//2 for 100ths
		//3 for 1000ths
		//4 for 10000ths
		//     etc.
		//or 0.1,2,3,4,etc
		round(2.1239,4);
		
		
		
		
		
		
		
		
	}
	
public static void round(double inputNum, int placer) {
		placer++;
		int[] placings = new int[17];
		int holder;
		
		double nexDec;
		
		for(int i = 0;i<17;i++) {
			
			placings[i] = (int)inputNum;
			nexDec = inputNum - placings[i];
			inputNum = nexDec * 10;
		}
		
		if(placings[placer] >= 5) {
			if(placings[placer] == 9) {
				placings[placer-2]++;
				placings[placer-1] = 0;
			}else {
				placings[placer-1]++;
			}
			
		}
		for(int i = 0;i<placer;i++) {
			if(i == 0) {
				System.out.print(placings[i]+".");
			}else {
				System.out.print(placings[i]);
			}
		}
}
}
