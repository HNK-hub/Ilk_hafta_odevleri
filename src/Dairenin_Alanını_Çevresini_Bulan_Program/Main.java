package Dairenin_Alan�n�_�evresini_Bulan_Program;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner info =new Scanner(System.in);
		System.out.print("Yar��ap Giriniz : ");
		double pi=3.34;
		int r;
		r=info.nextInt();
		double alan = (r*r*pi);
		double cevre =(2*pi*r);
		System.out.println("Dairenin Alan� : "+ alan);
		System.out.print("Dairenin �evresi : "+ cevre);

	}

}
