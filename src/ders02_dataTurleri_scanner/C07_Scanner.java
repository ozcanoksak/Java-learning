package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

 /* Kullanıcıdan ismini, soyismini ve yaşını alıp, aşağıdaki formatta yazdırın
    İsminiz: John
    Soyisminiz: Duran
    Yaşınız:27
    Kaydınız başarıyla tamamlanmıştır. */


        /* String için kullanılabilen next() sadece ilk space'e (tek kelime) kadar olan kısmı alır,
                                      nextLine() ise o satırda yazılan tüm bilgiyi alır.
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi girin");
        String isim = scan.nextLine();

        System.out.println("Lütfen soyisminizi girin");
        String soyisim = scan.nextLine();

        System.out.println("Lütfen yaşınızı girin");
        double yas = scan.nextDouble();

        System.out.println("İsminiz : " + isim + "\nSoyisminiz : "+ soyisim + "\nYaşınız : " + yas +
                "\nKaydınız başarıyla tamamlanmıştır.");





    }




}
