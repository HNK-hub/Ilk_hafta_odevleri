package Cin_Zodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	     	int yil;
	        Scanner info = new Scanner(System.in);
	        System.out.println("Hangi Y�lda Do�dunuz: ");
	        yil = info.nextInt();
	        int sonuc= (yil%12);
	        if(sonuc==0) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Maymun");
	        }
	        else if(sonuc==1) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Horoz");
	        }
	        else if(sonuc==2) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz K�pek");
	        }
	        else if(sonuc==3) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Domuz");
	        }
	        else if(sonuc==4) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Fare");
	        }
	        else if(sonuc==5) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz �k�z");
	        }
	        else if(sonuc==6) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Kaplan");
	        }
	        else if(sonuc==7) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Tav�an");
	        }
	        else if(sonuc==8) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Ejderha");
	        }
	        else if(sonuc==9) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz Y�lan");
	        }
	        if(sonuc==10) {
		        System.out.println(sonuc+"�in Zodya�� Burcunuz At");
	        }
	        if(sonuc==11) {
		        System.out.println("�in Zodya�� Burcunuz Koyun");
	        }
        

	}

}
