import java.util.Random;
import java.util.Scanner;

class GuessTheNumber {
	public static void main (String[] args){
	Random random = new Random();
	Scanner sc = new Scanner(System.in);
	do {
		int count = 0;
		int guess = -1;
		int number = random.nextInt(10);
		while (count < 5 && guess != number) {
			System.out.print("Enter the number from 0 to 9: ");
			guess = sc.nextInt();
			if (number != guess) {
				System.out.println ("Your N is " + ((guess > number)? "greater" : "less"));
				count++;
			}
		}
		System.out.println ("You" + ((count == 5)? "lose" : "WIN!"));
		System.out.println ("Repeat game? Yes enter 1, No enter 0");
		} while (sc.next().equals("1"));	
	}
}