package MinMaxDe�erliBulanProgram;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	        System.out.print("Ka� adet say� gireceksiniz: ");
	        int number = in.nextInt();

	        int max, min, i=2;
	        System.out.print("1. say�y� giriniz: ");
	        int a = in.nextInt();
	        max =a;
	        min =a;
	        while (i<=number){
	            System.out.print(i+". say�y� giriniz: ");
	            int b = in.nextInt();
	            if (b>max){
	                max = b;
	            } else if (b<min){
	                min =b;
	            }
	            i++;
	        }
	        System.out.println("Maximum say� : "+max);
	        System.out.println("Minimum say� : "+min);
	    }
	}