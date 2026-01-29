package ders15_overloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    static void main() {

// kullanıcıdan bir şifre oluşturmasını isteyin
// şifrenin ilk harfi büyük olmalı
// şifrenin son karakteri rakam olmalı
// şifre en az 8 basamaklı olmalı

        Scanner scan = new Scanner(System.in);
        boolean sifreGecerliMi = false;
        String sifre = "";
        int bayrak = 0;

        while (sifreGecerliMi!=true) {

            System.out.println("Lütfen şifrenizi giriniz");
            sifre = scan.next();
            bayrak=0;

            if (!(sifre.charAt(0) >= 'A' && sifre.charAt(0) <= 'Z')) {
                System.out.println("Şifrenin ilk karakteri büyük olmalı");
                bayrak++;

            }
            if ((sifre.charAt(sifre.length() - 1) >= '0' && (sifre.charAt(sifre.length() - 1) >= '9'))) {
                System.out.println("Şifrenin son karakteri rakam olmalı");
                bayrak++;

            }
            if (sifre.length() < 8) {

                System.out.println("şifre en az 8 basamaklı olmalı");
                bayrak++;

            }
            if (bayrak == 0) {
                sifreGecerliMi = true;
                System.out.println("Şifreniz başarıyla kaydedildi");
            }
        }//while

    }//main
}//class
