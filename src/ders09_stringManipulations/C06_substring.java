package ders09_stringManipulations;

public class C06_substring {
    static void main() {

        String str= "Java öğren işi kap";

        System.out.println(str.substring(5)); //öğren işi kap

        System.out.println(str.substring(6)); //ğren işi kap


        //son karakteri string olarak kaydedin

        String sonHarf =""+str.charAt(str.length()-1); // p

        String sonHarf2=str.substring(str.length()-1); //p


        //son indexteki karakteri uppercase olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase()); //P


        // son 3 harfi büyük harf olarak yazdırın

        System.out.println(str.substring(str.length()-3).toUpperCase()); //KAP






    }
}
