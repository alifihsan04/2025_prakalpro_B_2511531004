package pekan4;
import java.util.Scanner;
public class latifl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double IPK;
      Scanner input= new Scanner (System.in);
      System.out.println("Input IPK Anda = ");
      IPK=input.nextDouble ();
      input.close ();
      if (IPK>2.75) {
    	  System.out.println("Anda harus lulus Sangat Memuaskan dengan IPK "+IPK);
      }
      
   
   
   
	}

}
