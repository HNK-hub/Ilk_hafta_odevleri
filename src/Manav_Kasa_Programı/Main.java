package Manav_Kasa_Program�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		double armut,elma,domates,muz,patl�can;
		System.out.print("Armut Miktar�n� Giriniz :");
        armut= info.nextDouble();
        System.out.print("Elma Miktar�n� Giriniz :");
        elma= info.nextDouble();
        System.out.print("Domates Miktar�n� Giriniz :");
        domates= info.nextDouble();
        System.out.print("Muz Miktar�n� Giriniz :");
        muz= info.nextDouble();
        System.out.print("Patl�can Miktar�n� Giriniz :");
        patl�can= info.nextDouble();
        double tutar=(armut*2.14+elma*3.67+domates*1.11+muz*0.95+patl�can*5.00);
        System.out.print("Toplam Tutar : "+tutar+ "TL");
	}

}
