package ders04_matematikselİslemer;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {

        /* Kullanıcıdan iki double sayı alin, ikinci sayıyı, ilk sayıya bölün ve bölüm işleminin
        sonucunun tam sayı kısmını yazdırın.
        */


        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen iki sayı giriniz");

        double sayi1=scan.nextDouble();
        double sayi2=scan.nextDouble();


        int bolmeSonucuTamSayi = (int)(sayi1/sayi2); //ondalıklı sayıyı tam sayıya çevirir

        System.out.println(bolmeSonucuTamSayi);



    }



}
