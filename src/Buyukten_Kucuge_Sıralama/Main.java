package Buyukten_Kucuge_S�ralama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner info =new Scanner(System.in);
		int a,b,c;
		System.out.println("Birinci Say�y� Giriniz :");
	    a = info.nextInt();
	    System.out.println("�kinci Say�y� Giriniz :");
	    b = info.nextInt();
	    System.out.println("���nc� Say�y� Giriniz :");
	    c = info.nextInt();
	      if ((a<c) && (a<b)) {
	            if (b<c) {
	                System.out.println("a<b<c");
	            }
	            else {
	                System.out.println("a<c<b");
	            }
	        }
	        if ((b<c) && (b<a)) {
	            if (a<c) {
	                System.out.println("b<a<c");
	            }
	            else {
	                System.out.println("b<c<a");
	            }
	        }
	        if ((c<a) && (c<b)) {
	            if (b<a) {
	                System.out.println("c<b<a");
	            }

	            else {
	                System.out.println("c<b<a");
	            }
	        }
	}

}
