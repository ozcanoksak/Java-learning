package ders09_stringManipulations;

public class C03_equalsIgnoreCase {
    static void main() {

        String str1="Ali";
        String str2="Ali";
        String str3 ="ALİ";


        // büyük küçüğe dikkat eder her şeyin eşit olması gerekir
        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //false


        // büyük küçüğe dikkat etmez metnin aynı olup olmadığını kontrol eder
        System.out.println(str1.equalsIgnoreCase(str2)); //true
        System.out.println(str1.equalsIgnoreCase(str3)); //true

        System.out.println(str1.equalsIgnoreCase("Ali Can")); //false

        /* equalsIgnorCase aynı metnin büyük küçük harf kullanılarak oluşturulan farklı yazımlarını
        birbirine eşit olarak kabul eder

        yani equalsIgnorCase için ali, Ali, ALi  aLİ .... birbirine eşittir

        ama kelimede farklılık varsa bunları tolere etmez

        ali ile a li birbirine eşit değildir
         */





    }
}
