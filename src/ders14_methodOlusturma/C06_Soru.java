package ders14_methodOlusturma;

public class C06_Soru {
    static void main() {

        // Soru 2- Kullanıcıdan main method içinde
        // ayrı ayrı isim ve soyismini alın
        //  Isim ve soyadını ilk harfleri büyük harfler küçük olacak şekilde düzenleyip,
        //  ismin boşluk soyadına şeklinde bize döndüren bir method oluşturun
        //  input : isim = Ali
        //  soyisim : YILMAZ
        //  output : Ali Yılmaz


        String isim = "ÖMER";
        String soyisim = "kesen";


        System.out.println(isimSoyisimDuzenle(isim, soyisim));//Ömer Kesen
        System.out.println(isimSoyisimDuzenle("HeySeM", "RENKOĞLU")); //Heysem Renkoğlu

    }


        public static String isimSoyisimDuzenle (String isim, String soyisim){

     String yeniİsimSoyisim= isim.substring(0,1).toUpperCase()
             +isim.substring(1).toLowerCase()+
             " " + soyisim.substring(0, 1).toUpperCase()
             + soyisim.substring(1).toLowerCase();

     return yeniİsimSoyisim;

    }
}
