package ders00_Alistirma;

import java.util.Scanner;

public class A04 {
    static void main() {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz");
        double vizeNotu = scan.nextDouble();
        vizeNotu = (vizeNotu * 0.40);

        System.out.println("Lütfen final notunuzu giriniz");
        double finalNotu = scan.nextDouble();

        if (finalNotu < 50) {
            System.out.println("Final notunuz 50 puan barajını geçemediği için kaldınız");
        } else {
            finalNotu = (finalNotu * 0.60);

            double sonuc = vizeNotu + finalNotu;


            if (sonuc >= 50)
                System.out.println(sonuc + " puanla geçtiniz");

            else
                System.out.println(sonuc + " puanla geçemediniz");


        }
    }}
