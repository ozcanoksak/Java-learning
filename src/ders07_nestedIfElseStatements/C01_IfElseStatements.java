package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseStatements {
    static void main() {

        // Kullanıcıdan kilo ve boy isteyip vücut kitle endeksini hesaplayın
        //(kg / (cm/100 * cm/100) vücut kitle endeksi
        //30 dan büyükse "obez",
        //25-30 arası ise "kilolu",
        //20-25 arası "normal",
        //20'den küçükse "zayıf" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen kg olarak kilonuzu giriniz: ");
        double kg = scan.nextDouble();

        System.out.print("Lütfen cm olarak boyunuzu giriniz: ");
        double cm = scan.nextDouble();

        double vke =(kg / (cm/100 * cm/100));
        System.out.println("Vücut Kitle endeksiniz: " + vke);

        if (vke > 30)
            System.out.println("Obez");

        else if  (vke > 25) {
            System.out.println("Kilolu");

        } else if (vke>20) {
            System.out.println("Normal");

        } else if (vke > 0) {
            System.out.println("Zayıf");
        } else {
            System.out.println("Yanlış giriş");}

    }}


