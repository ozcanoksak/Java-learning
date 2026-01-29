package ders10_stringManipulations;

public class C02_contains {
    static void main() {

        String str = "Java ile kodlama çok zevkli";

        // contains () çift tırnak içerisindeki ifadeyi arayıp bulmaya çalışır
        // bulursa true bulamazsa false çıkar
        // büyük küçük harf duyarlılığı vardır

        System.out.println(str.contains("Java")); //true
        System.out.println(str.contains("odla")); //true
        System.out.println(str.contains("a")); //true

        //System.out.println(str.contains('s')); parametre olarak char kabul etmez
        // çift tırnak dışında olmaz
        // CharSequence : char dizisi

        System.out.println(str.contains("java")); //false (küçük j ile java yazdığı için yoktur)

        String str2 = "Java";
        System.out.println(str.contains(str2)); //true


    }
}
