package Artik_Yil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int year;
		int value =4;
		Scanner inp = new Scanner(System.in);
		System.out.print("Do�um Y�l�n�z�  Giriniz :");
		year = inp.nextInt();
		
		if(year % value ==0) {
			System.out.println(year+" "+"Art�k Y�ld�r.");
		}else {
			System.out.println(year+" "+"Art�k Y�l De�ildir. ");
			
		}

	}

}
