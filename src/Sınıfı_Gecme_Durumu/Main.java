package S�n�f�_Gecme_Durumu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		double matematik,fizik,turkce,kimya,muzik;
		 System.out.print("Matematik notunuz:  ");
	        matematik = info.nextInt();
	        if ((matematik<0) || (matematik>100)) {
	            System.out.println("0 ile 100 aras� de�er giriniz!");
	        }
	        System.out.print("Fizik notunuz:  ");
	        fizik = info.nextInt();
	        if ((fizik<0) || (fizik>100)) {
	            System.out.println("0 ile 100 aras� de�er giriniz!");
	        }
	        System.out.print("T�rk�e notunuz:  ");
	        turkce = info.nextInt();
	        if ((turkce<0) || (turkce>100)) {
	            System.out.println("0 ile 100 aras� de�er giriniz!");
	        }
	        System.out.print("Kimya notunuz:  ");
	        kimya = info.nextInt();
	        if ((kimya<0) || (kimya>100)) {
	            System.out.println("0 ile 100 aras� de�er giriniz!");
	        }
	        System.out.print("M�zik notunuz:  ");
	        muzik = info.nextInt();
	        if ((muzik<0) || (muzik>100)) {
	            System.out.println("0 ile 100 aras� de�er giriniz!");
	        }
        double ortalama = ((matematik+fizik+turkce+kimya+muzik)/5);
        if(ortalama==55) {
        	System.out.print("Ge�tiniz. Notunuz : "+ortalama);
        }
        else
        {
        	System.out.print("Kald�n�z. Notunuz : "+ortalama);

        }
	}

}
