package ders14_methodOlusturma;

public class C03_StringTerseCevirme {
    static void main() {
        //parametre olarak bir string kabul edip
        // String'in terse çevrilmiş halini döndüren bir method oluşturun

        String input = "Java kod yazdıkça öğrenilir";
        System.out.println(StringiTerseCevir(input));


    }//main

    public static String StringiTerseCevir(String input){

        String tersStr="";

        for (int i=input.length()-1; i>=0 ; i--) {

            tersStr=tersStr+input.charAt(i);
        }//for

        return tersStr;

    }//method

}//class
