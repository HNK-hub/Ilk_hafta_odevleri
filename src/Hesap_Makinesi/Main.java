package Hesap_Makinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		double x ,y;
		int select;
		System.out.println("Birinci Say�y� Giriniz : ");
		x=info.nextDouble();
		System.out.println("�kinci Say�y� Giriniz : ");
		y=info.nextDouble();
		System.out.println("�kinci Say�y� Giriniz : ");

		System.out.println("1-Toplama\n 2-��karma\n 3-B�lme\n 4-�arpma");
		select =info.nextInt();
		System.out.print("Se�iminiz : ");
		switch (select) {
		case 1: {
			 System.out.println("Toplama ��lemininin Sonucu : " + (x + y));
			break;
		}
		case 2: {
			 System.out.println("��karma ��lemininin Sonucu : " + (x - y));
			break;
		}
		case 3: {
			 System.out.println("B�lme ��lemininin Sonucu : " + (x / y));
			break;
		}
		case 4: {
			 System.out.println("�arpma ��lemininin Sonucu : " + (x * y));
			break;
		}
		default:
			 System.out.println("Yanl�� Se�im Yapt�n�z : ");
		}
	}

}
