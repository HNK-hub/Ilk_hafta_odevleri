package UsluSayiHesab�;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner (System.in);
		System.out.print("Taban Say�y� Giriniz : ");
	    int taban=info.nextInt();
	    int a = taban;
		System.out.print("�s Olacak Say�y� Giriniz : ");
		int us=info.nextInt();
		 for (int i = 1; i < us; i++)
         {
			 a = taban * a;
         }
		System.out.println("Cevap : "+a);
	}

}
