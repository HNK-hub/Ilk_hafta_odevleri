package Burc;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	     int day, month;
	        Scanner inp = new Scanner(System.in);
	        System.out.println("Hangi Ayda Do�dunuz: ");
	        month = inp.nextInt();
	        System.out.println("Ay�n Ka��nda Do�dunuz ");
	        day = inp.nextInt();
	        if (month==1) {
	            if (day<22) {
	                System.out.println("O�lak Burcu");
	            }
	            else if (day<=31) {
	                System.out.println("Kova Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==2) {
	            if (day<20) {
	                System.out.println("Kova Burcu");
	            }
	            else if (day>=20 && day<=29) {
	                System.out.println("Bal�k Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==3) {
	            if (day<=20) {
	                System.out.println("Bal�k Burcu");
	            }
	            else if (day>=21 && day<=31) {
	                System.out.println("Ko� Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==4) {
	            if (day<=20) {
	                System.out.println("Ko� Burcu");
	            }
	            else if (day>=21 && day<=30) {
	                System.out.println("Bo�a Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }


	        if (month==5) {
	            if (day<=21) {
	                System.out.println("Bo�a Burcu");
	            }
	            else if (day>=22 && day<=31) {
	                System.out.println("�kizler Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }


	        if (month==6) {
	            if (day<=22) {
	                System.out.println("�kizler Burcu");
	            }
	            else if (day>22 && day<=30) {
	                System.out.println(" Yenge� Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==7) {
	            if (day<=22) {
	                System.out.println("Yenge� Burcu");
	            }
	            else if (day>22 && day<=31) {
	                System.out.println("Aslan Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==8) {
	            if (day<=22) {
	                System.out.println("Aslan Burcu");
	            }
	            else if (day>22 && day<=31) {
	                System.out.println("Ba�ak Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }


	        if (month==9) {
	            if (day<23) {
	                System.out.println("Ba�ak Burcu");
	            }
	            else if (day>23 && day<=30) {
	                System.out.println("Terazi Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==10) {
	            if (day<23) {
	                System.out.println("Terazi Burcu");
	            }
	            else if (day>=23 && day<=31) {
	                System.out.println("Akrep Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==11) {
	            if (day<=21) {
	                System.out.println("Akrep Burcu");
	            }
	            else if (day>=22 && day<=30) {
	                System.out.println("Yay Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }

	        if (month==12) {
	            if (day<=21) {
	                System.out.println("Yay Burcu");
	            }
	            else if (day>=22 && day<=31) {
	                System.out.println("O�lak Burcu");
	            }

	            else {
	                System.out.println("Hatal� giri�");
	            }
	        }
	}
	}
