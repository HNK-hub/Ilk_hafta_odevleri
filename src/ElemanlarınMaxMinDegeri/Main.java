package Elemanlar�nMaxMinDegeri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 
		int[] list = {56, 34, 1, 8, 101, -2, -33};
	      Scanner info =new Scanner(System.in);
	      System.out.println("Bir Sayi Giriniz : ");
	      int sayi =info.nextInt();
	        int min = list[0];
	        int max = list[0];

	        for (int i : list) {
	            if (i < min) {
	                min = i;
	            }
	            if (i > max) {
	                max = i;
	            }
	        }

	        System.out.println("Minimum De�er " + min);
	        System.out.println("Maximum De�er " + max);

	    }
		
	}
