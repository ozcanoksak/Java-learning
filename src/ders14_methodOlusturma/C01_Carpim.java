package ders14_methodOlusturma;

import java.util.Scanner;

public class C01_Carpim {
    static void main() {

            Scanner scan = new Scanner(System.in);
            System.out.println("Lütfen iki sayı giriniz");
            double sayi1 = scan.nextDouble(); // 5
            double sayi2 = scan.nextDouble(); // 3


        carpimMethodu(sayi1, sayi2);

            double carpimSonucu = carpimMethodu(6, 2); // 12.0

        }//main

    public static double carpimMethodu(double sayi1,double sayi2){

        System.out.println("çarpım methodu çalıştı");
        return sayi1*sayi2;



    }//method

    }//class

