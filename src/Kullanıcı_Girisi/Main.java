package Kullan�c�_Girisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String userName ,password;
		String passwordLogin ="1234";
		Scanner inp =new Scanner(System.in);
		
		System.out.println("Kullan�c� ad�n�z� giriniz");
		userName =inp.nextLine();
		
		System.out.println("�ifrenizi giriniz");
		password =inp.nextLine();
		
		if(userName.equals("HaticeNur") && password.equals(passwordLogin)) {
			System.out.println("Ba�ar�l�");
			
		}else {
		
		
			System.out.println("Kullan�c� ad�n�z yada �ifreyi yanl�� girdiniz.S�f�rlamak ister misin?");
			System.out.println("1 evet , 2 hay�r");
			int select =inp.nextInt();
			
			switch (select) {
			case 1:
				System.out.println("yeni �ifrenizi girin:");
				String newPassword = inp.next();
				
				
				if(newPassword.equals(passwordLogin)  || newPassword.endsWith(password)) {
					System.out.println("yeni olu�turdu�unuz �ifre eski �ifreniz ile ayn� olamaz ");
				
				}else {
					System.out.println("yeni �ifre olu�turuldu");
					password=newPassword; 
				}
				 break;
			case 2:
				System.out.println("�ifre s�f�rlama iptal edildi.");
			
			break;
	}

		}}}
