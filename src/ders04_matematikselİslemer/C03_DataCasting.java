package ders04_matematikselİslemer;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        /* kullanıcıdan iki int değer alıp
        bunları birbirine bölün ve sonucu double olarak yazdırın */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki tam sayı giriniz");

        int sayi1=scan.nextInt(); // 20
        int sayi2=scan.nextInt(); // 6

        double OndalikliSonuc =(double) (sayi1/sayi2); // (double)(3) ==> 3.0

        System.out.println(OndalikliSonuc); // 3.0


        // java işlem önceliğine dikkat eder

        double dogruSonuc =((double) (sayi1) / (sayi2)); // double / int ==> geniş olana göre sonuç verir.

        System.out.println(dogruSonuc); // 3.3333333333333335



    }
}
