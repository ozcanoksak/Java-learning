package ders11_stringManipulations;

public class C07_Soru {
    static void main() {

        // Soru 5: Kullanicidan isim ve soyismini ayri ayri alin.
        // - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin
        // - esit veya soyisim daha uzun ise
        // ismin ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

        String isim="MEHmet";
        String soyisim="HarUN";
        String yeniIsimSoyisim;

        if (isim.length()>soyisim.length()) {
        // isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde yazdirin

            yeniIsimSoyisim = isim.substring(0,1).toUpperCase()+
                    isim.substring(1).toLowerCase()+
                    " "+
                    soyisim.substring(0, 1).toUpperCase()+
                    soyisim.substring( 1).toLowerCase();


        } else {
            // ismi ilk harf buyuk digerleri kucuk, soyismi buyuk harflerle yazdirin.

            yeniIsimSoyisim=isim.substring(0,1).toUpperCase()+
                             isim.substring(1).toLowerCase()+
                             " "+
                            soyisim.toUpperCase();
        }





    }
}
