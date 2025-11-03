package Pekan6_2511531004;
import java.util.Scanner;
import java.util.Random;
public class GamePenjumlahan_2511531004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner console = new Scanner(System.in);
		Random rand = new Random();
		
		// play untill user gets 3 wrong
		int points = 0;
		int wrong = 0;
		while (wrong < 3) {
			int result = play(console,rand);
			
			if (result > 0) {
				points++;
				
			} else  {
				wrong++;
				
			}
			
		}
		
		System.out.println("You earned " + points + "total points.");
		
	}

	// membuat soal penjumlahan dan ditampilkan ke user 
	public static int play(Scanner console, Random rand) {

		// print the operand being added, and sum them
		int operands = rand.nextInt(4) + 2;
		int sum = rand.nextInt(10) + 1;
		System.out.print(sum);
		
		for (int i = 2; i <= operands; i++) {
			int n = rand.nextInt();
			sum += n;
			
		}
		System.out.print(" = ");
	
		// read users guess and report weather it it was correct
		int guess = console.nextInt();
		if (guess == sum) {
			return 1;
		} else {
			System.out.println("Wrong ! The answer was " + sum);
			return 0;
		}
				

	}
	
	}


