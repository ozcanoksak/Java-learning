package ders05_concatenation_operatorler;

import java.util.Scanner;

public class C03_IfStatements {
    static void main() {

        /* kullanıcıdan iki tam sayı alın
        eğer birinci sayı 100'den büyükse "ilk sayı 100'den büyük" yazdırın
        eğer ikinci çayı çiftse "ikinci sayı çift" yazdırın
        eğer ilk sayı, ikinci sayıdan büyükse "ilk sayı daha büyük" yazdırın */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen iki tam sayı giriniz");
        int s1= scan.nextInt();
        int s2 = scan.nextInt();

        //eğer birinci sayı 100'den büyükse "ilk sayı 100'den büyük" yazdırın
        if (s1>100) {
            System.out.println("ilk sayı 100'den büyük");
        }

        // eğer ikinci çayı çiftse ikinci sayı çift yazdırın
         if (s2%2==0){
             System.out.println("ikinci sayı çift");
         }

         //eğer ilk sayı, ikinci sayıdan büyükse "ilk sayı daha büyük" yazdırın
        if (s1>s2){
            System.out.println("ilk sayı daha büyük");}



            int a=10;
            int b=20;

            boolean sonuc= a>b;

            if (sonuc){
                System.out.println("a, b'den büyük");}

            sonuc = a<100;
            if (sonuc){
                System.out.println("a, 100'den küçük");

            }


    }}
