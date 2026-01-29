package ders00_Alistirma;

import java.util.Scanner;

public class A11_doWhile {
    static void main() {
        int sayi=10;

        do {
            System.out.println("2");

        }while (sayi<5); //önce do'yu bir kere yazdırır şart gerçekleşmediği için döngü devam etmez



        int secim =0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("ATM menüsü: ");
            System.out.println("1- Bakiye Görüntüleme");
            System.out.println("2- Para Yatır");
            System.out.println("3- Para Çek");
            System.out.println("0- Çıkış yap");
            System.out.print("Seçim yapınız: ");
            System.out.println(" ");
            secim=scan.nextInt();

            switch (secim) {
                case  1:
                    System.out.println("Bakiyeniz = 1000TL");
                    break;
                case 2:
                    System.out.println("Paranız yatırıldı");
                    break;
                case 3:
                    System.out.println("Para çekme işlemi gerçekleşti");
                    break;
                case 0:
                    System.out.println("çıkış yapılıyor");
                    break;
                default:
                    System.out.println("Geçersiz seçim lütfen tekrar deneyiniz");
            }
        }while (secim!=0);

        System.out.println("Görüşmek üzere");


    }
}
