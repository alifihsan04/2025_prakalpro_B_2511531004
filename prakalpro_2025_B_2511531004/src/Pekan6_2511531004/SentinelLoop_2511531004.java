package Pekan6_2511531004;
import java.util.Scanner;
public class SentinelLoop_2511531004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		int sum =  0;
		int number= 12;
		
		while (number != 0) {
			System.out.println("Masukkan angka (0 untuk keluar) : ");
			number = console.nextInt();
			sum = sum + number;
		}
		System.out.println("Totalnya adalah " + sum);
		
		
	}

}
