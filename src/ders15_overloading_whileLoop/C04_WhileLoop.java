package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C04_WhileLoop {

    static void main() {


    /*
    kullanıcıdan tam sayılar alın kullanıcı 0'a basarsa sayı alma işlemini bitirin
    kullanıcının kaç sayı girdiğini ve bu sayıların toplamının kaç olduğunu yazdırın
     */



        int girilenSayi = 5;

        Scanner scan = new Scanner(System.in);
        int sayac=0;
        int toplam=0;

       while (girilenSayi!=0) {
           System.out.println("Lütfen toplamak için tam sayı girin" + "\nBitirmek için 0'a basın");
           girilenSayi = scan.nextInt();

           if (girilenSayi != 0) {
               sayac++;
               toplam = toplam + girilenSayi;

           }//if
       }//while

        System.out.println(sayac + " kere " + "girdiğiniz sayıların toplamı: " + toplam);

}}
