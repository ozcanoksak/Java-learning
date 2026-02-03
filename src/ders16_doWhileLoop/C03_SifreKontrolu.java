package ders16_doWhileLoop;

import java.util.Scanner;

public class C03_SifreKontrolu {
    static void main() {

        /*
         Soru 2
        kullanıcıdan bir şifre girmesini isteyin
        girilen şifreyi aşağıdaki şartlara göre kontrol edin ve şifredeki hataları yazdırın
        kullanıcı geçerli bir şifre girinceye kadar bu işlemi tekrar edin
        ve geçerli şifre girdiğinde "Şifreniz kabul edilmiştir" yazdırın.

       -şifre küçük harf içermelidir
       -şifre büyük harf içermelidir
       -şifre özel karakter içermelidir
       -şifre en az 8 karakter olmalıdır

         */

        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak;
        boolean sifreDogruMu;

        do {

            System.out.println("Lütfen bir şifre giriniz");
            sifre = scan.nextLine();
            //tüm hataları birlikte söylemesini istiyorsak
            //bağımsız if cümleleri ve bayrak kullanmak zorundayız
            bayrak = 0;

           int sonuc = kucukHarfKontroluYap(sifre);
            // küçük harf kontrolü yapan bir method oluşturalım
            // küçük harf varsa 1, yoksa 0 döndürsün
            bayrak=bayrak+sonuc;

            // şifre büyük harf içermelidir

            sonuc = buyukHarfKontroluYap(sifre);
            // büyük harf kontrolü yapan bir method oluşturalım
            // büyük harf varsa 1, yoksa 0 döndürsün
            bayrak=bayrak+sonuc;


            // şifre özel karakter içermelidir
            sonuc=ozelKarakterKontroluYap(sifre);
            bayrak=bayrak+sonuc;


            // şifre en az 8 karakter olmalıdır
            if (sifre.length()<8){
                System.out.println("Şifre en az 8 karakter olmalıdır");
            } else {
                bayrak++;
            }

            // bayrak 4 ise şifre tamam, değilse hata vardır
        } while (bayrak!=4);

        if (bayrak==4){
            System.out.println("Şifreniz başarıyla0 kaydedildi");}


        }//main


    public static int ozelKarakterKontroluYap(String sifre) {
    int bayrak=0;
    String ozelKarakterler = "<>!'^+%&/()=?_-*#${[]}.,;´@-:`";

        //şifre özel karakter içermelidir
        // bunun için tüm harleri kontrol edecek bir loop oluşturalım
        // eğer şifrenin karakterlerinden bir tanesi özel karakterler stringi içeriyorsa
        // bizim için yeterli olur

        for (int i = 0; i < sifre.length(); i++) {
            if (ozelKarakterler.contains(sifre.substring(i, i+1))) {
                bayrak++;
                break;

            }

        }//for

        //bayrak==0 ise özel karakter yoktur yani bir hata var bunu yazdıralım
        if (bayrak == 0) {
            System.out.println("Şifre özel karakter içermelidir");

            return 0;
        } else return 1;
}

         public static int buyukHarfKontroluYap(String sifre) {

             int bayrak =0;
             // -şifre büyük harf içermelidir
             // bunun için tüm harfleri kontrol edecek bir for loop oluşturalım
             // 1 tane büyük harf bulmak yeterli olacak

             for (int i = 0; i < sifre.length(); i++) {

                 if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') { //şifrede büyük harf varsa bayrağı bir arttır
                     bayrak++;
                     break;
                 }

             }//for

             //bayrak==0 ise büyük harf yoktur yani bir hata var bunu yazdıralım
             if (bayrak == 0) {
                 System.out.println("Şifre büyük harf içermelidir");

                 return 0;
             } else return 1;

}




public static int kucukHarfKontroluYap(String sifre) {
        int bayrak =0;
        // -şifre küçük harf içermelidir
        //bunun için tüm harfleri kontrol edecek bir for loop oluşturalım
        // 1 tane küçük harf bulmak yeterli olacak

        for (int i = 0; i < sifre.length(); i++) {

            if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') { //şifrede küçük harf varsa bayrağı bir arttır
                bayrak++;
                break;
            }

        }//for

        //bayrak==0 ise küçük harf yoktur yani bir hata var bunu yazdıralım
        if (bayrak == 0) {
            System.out.println("Şifre küçük harf içermelidir");

            return 0;

        } else return 1;
    }
    }//public
