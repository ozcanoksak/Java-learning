package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    static void main() {

        /*
        kullanıcıdan toplanmak üzere sayılar alın
        sayıların toplamı 500'e eşit olur veya geçerse

        girilen sayı adedini,
        girilen sayıların toplamını ve
         "Bu kadar yeter" yazdırın

         */
        Scanner scan = new Scanner(System.in);
        double girilenSayi=0;
        double toplam=0;
        int sayac =0;

        while (toplam<500) {

            System.out.println("Toplamak için sayı giriniz");
            girilenSayi = scan.nextDouble();

            toplam += girilenSayi;
            sayac++;
        }//while

        System.out.println("Girilen " + sayac + "sayının toplamı " + toplam + "oldu. Bu kadar yeter");


        }//main

    }//class

