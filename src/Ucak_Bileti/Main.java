package Ucak_Bileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info = new Scanner(System.in);
		int yas,yolculukTipi;
		System.out.println("Mesafe Giriniz : ");
		double km=info.nextDouble() ;
		double ucret = km * 0.10;
		System.out.println("Ya��n�z: ");
	    yas = info.nextInt();
	    System.out.println("1-Toplama\n 2-��karma\n 3-B�lme\n 4-�arpma");
		int select =info.nextInt();
		
	    System.out.println("Yolculuk Tipini Giriniz => (1 => Tek Y�n , 2 => Gidi� D�n�� ): ");
	    switch (select) {
	    case 1: {
	    //	 System.out.println(yolculukTipi+" Tek Y�n");
	    	break;
	    }
	    case 2: {
	    	// System.out.println(yolculukTipi+ "�ift Y�n ");
	    	break;
	    }
		//System.out.println("Normal Tutar : "+ucret);
		//if(yas <12 ) {
			
		//}
	 
	}
	}
}

