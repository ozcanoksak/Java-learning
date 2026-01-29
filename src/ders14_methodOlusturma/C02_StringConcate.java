package ders14_methodOlusturma;

public class C02_StringConcate {
    static void main() {

        // verilen iki String'i parametre olarak kabul edip
        // bu iki String'i arasında bir boşluk olan tek bir String alarak
        // main method'a döndüren bir method oluşturun

        String str1=  "Java";
        String str2 = "Candır";

        System.out.println(birlestirmeMethodu(str1, str2));
        System.out.println(birlestirmeMethodu("BU da", "oldu"));
        System.out.println(birlestirmeMethodu("Anladınız", "mı"));

    }//main

    public static String birlestirmeMethodu (String str1, String str2) {

        return str1 + " " + str2;

    }//method

}//class
