package pekan3;

import java.util.Scanner;

public class OperaotrAssingment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A1;
		int A2;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Input angka-1");
		A1 = keyboard.nextInt();
		System.out.println("Input angka-2");
		A2 = keyboard.nextInt();
		keyboard.close();
		System.out.println("Assingment Penambahan :");
		A1 += A2;// penambahan, sekarang A1 = 15
		System.out.println("Penambahan : " + A1);
		System.out.println("Assingment Pengurangan :");
		A1 -= A2;// pengurangan, sekarang A1 = 10
		System.out.println("Pengurangan :" + A1);
		System.out.println("Assingment Perkalian :");
		A1 *= A2;// perkalian, sekarang A1 = 50
		System.out.println("Perkalian :" + A1);
		System.out.println("Assingment hasil bagi :");
		A1 /= A2;
		System.out.println("Hasil : " +A1);
		System.out.println("Assingment sisa bagi :");	
		A1 %= A2;
		System.out.println("Hasil : " + A2);
		

	}

}
