package ders10_stringManipulations;

public class C05_Soru {
    static void main() {

        /*
       mail kontrolu yapan bir program hazirlayin
       1 - mail isareti (@) icermiyorsa "gecersiz email"
       2 - @gmail.com icermiyorsa "gmail adresi giriniz"
       3 - @gmail.com ile bitmiyorsa "yazim hatasi"
       seklinde sonuc yazdirin */




      String email="ahmet@bulutluoz.com";

      if (!email.contains("@")){
          System.out.println("geçersiz mail");

      } else if (!email.contains("@gmail.com")){
          System.out.println("gmail adresini giriniz");

      }else if (!email.endsWith("@gmail.com")){
          System.out.println("yazım hatası");

      } else System.out.println("e-mail başarı ile kaydedildi");



    }
}
