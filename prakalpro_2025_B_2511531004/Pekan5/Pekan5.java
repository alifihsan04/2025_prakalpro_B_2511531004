package Pekan5;

public class Pekan5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5; 
		for (int line = 1; line <= n; line++) { // untuk buat jadi 5 baris 
			// untuk buat titik dari kiri
			for (int j = 1; j <=  (-1 * line + 5); j++) {
				System.out.print(".");
			
					
				}
			// cetak angka
			System.out.print(line);
			// cetak titik dari kanan
			for (int j = 1; j < line; j++ ) {
				System.out.print(".");
				
			}
			// untuk pindah baris 
			System.out.println();
		
		}
	}


}
