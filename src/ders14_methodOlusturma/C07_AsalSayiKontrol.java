package ders14_methodOlusturma;

public class C07_AsalSayiKontrol {
    static void main() {

        // Soru 3- Kullanıcıdan main method içinde pozitif bir tam sayı alın.
        // Girilen sayının asal sayı olup olmadığını kontrol edip,
        // sonuç olarak "asal sayı" veya "asal sayı değil"
        // sonuçlarını döndüren bir method oluşturun.

        int sayi = 24;
        System.out.println(asalSayiKontrolEt(sayi)); // asal degil
        System.out.println(asalSayiKontrolEt(23)); // asal
        System.out.println(asalSayiKontrolEt(5674532)); // asal degil
    }//main

    public static String asalSayiKontrolEt(int sayi) {

        String sonuc = "";

        for (int i = 2; i <= (sayi - 1); i++) {

            if (sayi % i == 0) {
                sonuc = "asal degil";
                break;
            }

            if (!sonuc.equals("asal degil")) {
                sonuc = "asal";
            }
        }//for

        return sonuc;
    }//method

    }//class

