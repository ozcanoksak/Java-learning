package ders11_stringManipulations;

public class C02_replace {
    static void main() {

        String str= "Java candir";

        // replace seçilen değerleri verilen yeni değerlerle değiştirilmesini sağlar

        System.out.println(str.replace('a','A')); // JAVA CAndir
        System.out.println(str.replace(' ','_')); // Java_candir
        System.out.println(str.replace("candir",  "cok guzeldir.")); // Java cok guzeldir.
        System.out.println(str.replace( " ", "")); // Javacandir


        // String'deki tum a'lari silin
        System.out.println(str.replace("a", "")); // Jv cndir


        // Java yerine "Hava", candir yerine "cok guzel" yazdiralim
        System.out.println(str.replace("Java", "Hava")

                .replace("candir", "cok guzel"));// Hava cok guzel


        System.out.println(str.replace("", "_"));
        //_J_a_v_a_ _c_a_n_d_i_r_


        // sadece 1.a'yi A yapin
        System.out.println(str.replaceFirst( "a","A")); // JAva candir


    }
}
