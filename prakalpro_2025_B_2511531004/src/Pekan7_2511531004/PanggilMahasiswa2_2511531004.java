package Pekan7_2511531004;
import java.util.Scanner;
public class PanggilMahasiswa2_2511531004 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in) ;
		System.out.println("Nim: ");
		String x = input.nextLine();
		System.out.println("Nama: ");
		String y = input.nextLine();
		
		Mahasiswa_2511531004 a = new Mahasiswa_2511531004();
		a.setNim2(x);
		a.setNama(y);
		if(x.startsWith("25")) {
			System.out.println(y + "Anda angkatan 2025");
			
		}
		if (x.contains("1153")) {
			System.out.println("Anda Mahasiswa Informatika");
		}
		a.Cetak2();
		input.close();
	}

}
