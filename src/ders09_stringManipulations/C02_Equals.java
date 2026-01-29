package ders09_stringManipulations;

public class C02_Equals {
    static void main() {

        String str1="Ali";
        String str2="Ali";

        String str3= new String("Ali");
        String str4= "Ali";

        System.out.println(str1 == str2); //true
        System.out.println(str1 == str3); //false
        System.out.println(str1 == str4); //true

        /* Stringleri karşılaştırırken beklediğimiz sonuçları vermeyebilir
        Stringlerde metinlerin aynı olup olmadığını karşılaştırmak için
        == yerine equals() kullanılır
         */

        System.out.println(str1.equals(str2)); //true
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1.equals(str4)); //true







    }
}
