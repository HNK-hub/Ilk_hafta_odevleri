package Dik��gendeHipoten�sBulanProgram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner not = new Scanner(System.in);
		int kenar1,kenar2,kenar3,alan,cevre;
		System.out.println("1.kenar� Giriniz :");
		kenar1 = not.nextInt();
        System.out.println("2.kenar� Giriniz :");
        kenar2 = not.nextInt();
        System.out.println("3.kenar� Giriniz  :");
        kenar3 = not.nextInt();
        cevre = kenar1+kenar2+kenar3 ;
        alan = (int) Math.sqrt(cevre * (cevre - kenar1) * (cevre - kenar2) * (cevre- kenar3));
        System.out.println("��genin alan� = " + alan);	
	}

}
