package ders11_stringManipulations;

public class C03_replaceAll  {
    static void main() {
    String str = "J1ava2 69uzel5dir8";

        //str'daki sayilari silip metni Java Guzeldir haline donusturelim

        // str.replaceAll() sadece bir harf veya char sequence'i degil
        // genelleme ile soyleyebilecegimiz ortak ozellikteki tum karakterleri degistirir


       /* Regex (Regular Expressions)
       \\s: space
       \\S: space olmayan hersey
       \\s+: yanyana birden fazla space
       \\d: digits
       \\D: digit olmayan hersey
       \\w: harf veya rakam
       \\W: harf veya rakam olmayan herseyi sil*/

        System.out.println(str.replaceAll("\\d","")); // Java Guzeldir

        System.out.println(str.replaceAll("\\D",""));// 12958


        String s1= "ilk urun fiyati : 1250 tl";
        String s2= "ikinci urun fiyati : 1500 tl";

        // iki urunun fiyatini toplayin
        s1=s1.replaceAll("\\D",""); // "1250"
        s2= s2.replaceAll("\\D",""); // "1500"

        System.out.println(s1+s2); // 12501500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); // 2750





    }
}
