package Pekan6_2511531004;
import java.util.Scanner;
public class PerulanganWhile1_2511531004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int counter = 0;
		String Jawab;
		boolean running = true;
	
		// deklarasi scanner 
		Scanner scan = new Scanner(System.in);
		
		while (running) {
			counter++ ;
			System.out.println("Jumlah = " + counter);
			System.out.println("Apakah lanjut  (ya / tidak)");
			Jawab = scan.nextLine();
			
			// cek jawab = tidak, perulangan berhenti
			if (Jawab.equalsIgnoreCase("tidak")) {
				running = false;
				
			}
			
			
		}
		System.out.println("Anda sudah melakukan perulangan sebanyak " + counter + " kali"  );
	}

}
