package Vucut_Kitle_Indeksi_Hesaplayan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy ;
		double kilo ;
		Scanner info = new Scanner(System.in);
		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		boy=info.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz : ");
		kilo=info.nextDouble();
		double index =(kilo / (boy * boy)) ;
		System.out.print("V�cut Kitle �ndeksiniz : " + index);
	}
}
