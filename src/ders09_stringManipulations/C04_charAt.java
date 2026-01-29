package ders09_stringManipulations;

public class C04_charAt {
    static void main() {

        String str="Java Candır";

        System.out.println(str.charAt(0)); //ilk harfi verir (J)

        System.out.println(str.charAt(5)); //5. index'deki char'ı verir (C)

        System.out.println(str.charAt(10)); // sonuncu karakteri yazdırır (r)

       /* bir metindeki karakter sayısı ile son index arasında 1 fark vardır sayısı
       bu metin için karakter sayısı 11 dir bu yüzden son indexi 10 dur */


        // System.out.println(str.charAt(11)); StringIndexOutOfBoundsException hatası verir



    }
}
