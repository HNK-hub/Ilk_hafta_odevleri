package Cin_Zodyagi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		 int yil;
	        Scanner info = new Scanner(System.in);
	        System.out.println("Hangi Y�lda Do�dunuz: ");
	        yil = info.nextInt();
	        double sonuc= yil/12;
	        if(sonuc==0) {
		        System.out.println(sonuc+"Maymun");
	        }
	        if(sonuc==1) {
		        System.out.println(sonuc+"Horoz");
	        }
	        if(sonuc==2) {
		        System.out.println(sonuc+"K�pek");
	        }
	        if(sonuc==3) {
		        System.out.println(sonuc+"Domuz");
	        }
	        if(sonuc==4) {
		        System.out.println(sonuc+"Fare");
	        }
	        if(sonuc==5) {
		        System.out.println(sonuc+"�k�z");
	        }
	        if(sonuc==6) {
		        System.out.println(sonuc+"Kaplan");
	        }
	        if(sonuc==7) {
		        System.out.println(sonuc+"Tav�an");
	        }
	        if(sonuc==8) {
		        System.out.println(sonuc+"Ejderha");
	        }
	        if(sonuc==9) {
		        System.out.println(sonuc+"Y�lan");
	        }
	        if(sonuc==10) {
		        System.out.println(sonuc+"At");
	        }
	        if(sonuc==11) {
		        System.out.println(sonuc+"Koyun");
	        }
        

	}

}
