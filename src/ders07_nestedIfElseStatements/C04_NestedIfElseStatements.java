package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C04_NestedIfElseStatements {
    static void main() {

        // Kullanıcıdan cinsiyetini ve yaşını alın, kadın 60 yaş ve üzeri
        // erkek 65 yaş ve üzeri emekli olabilir
        // Cinsiyet ve yaşını dikkate alarak
        // Emekli olabilirsin veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın

        // ana değişken yaş olsun

       Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaşınızı giriniz: ");
        double yas = scan.nextInt();

        System.out.println("Lütfen cinsiyeti giriniz: ");
        char cinsiyet = scan.next().charAt(0);

        if (yas<15) {
            System.out.println("Hatalı yaş girişi");


        } else if (yas<60) {
            //emekli olamaz çalışması gerken süre cinsiyete bağlı
            System.out.println("Emekli olamazsınız");

            if (cinsiyet=='K'|| cinsiyet=='k') {
                System.out.println("daha " + (60-yas) + " sene çalışmanız gerek");

            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("daha " + (65-yas) + " sene çalışmanız gerek");

            }else System.out.println("hatalı cinsiyet girişi");



        } else if (yas<65) {
            // kadın ise emekli olabilir erkek ise olamaz

            if (cinsiyet=='K'|| cinsiyet=='k') {
                System.out.println("Emekli olabilirsiniz");

            } else if (cinsiyet=='E' || cinsiyet=='e') {
                System.out.println("daha " + (65-yas) + " sene çalışmanız gerek");
            } else {
                System.out.println("Hatalı cinsiyet girişi");}

        } else {
            System.out.println("Emekli olabilirsiniz");


    }
}}
