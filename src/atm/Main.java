package atm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    String userName, password;
        Scanner sc = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        int quantity;

        while (right > 0) {

            System.out.println("Kullan�c� ad�: ");
            userName = sc.next();
            System.out.println("�ifre: ");
            password = sc.next();
            if (userName.equals("HNK") && password.equals("1234")) {
                do {
                    System.out.println("Ho�geldiniz say�n " + userName);
                    System.out.println("L�tfen yapmak istedi�iniz i�lemi se�iniz ");
                    System.out.println("1- Para Yat�rma \n 2- Para �ekme \n 3- Bakiye sorgulama\n 4- ��k�� yap");
                    select = sc.nextInt();
                    switch (select ) {
                        case 1:
                        System.out.println("Yat�r�lacak para miktar�: ");
                        quantity = sc.nextInt();
                        System.out.println("Yeni bakiyeniz: " + (balance + quantity));
                        break;
                        case 2:
                        System.out.println("�ekilecek para miktar�: ");
                        quantity = sc.nextInt();
                        if (quantity>balance) {
                            System.out.println("Yetersiz bakiye. Mevcut bakiyeniz: " + balance);
                        }
                        else {System.out.println("Kalan bakiyeniz: " + (balance - quantity));}
                        break;
                        case 3:
                         System.out.println("Mevut bakiyeniz: " + balance);
                    break;
                    }

                } while (select != 4);

                break;
            } else {
                right--;

                System.out.println("Hatal� kullan�c� ad� veya �ifre.");
                if (right == 0) {
                    System.out.println("Hesab�n�z bloke olmu�tur. L�tfen banka ile ileti�ime ge�iniz.");
                }
                System.out.println("Kalann hakk�n�z: " + right);
            }
        }
    }
}