package ders14_methodOlusturma;

public class C04_Tekrar {
    static void main() {

        int a=10;
        int b= 20;

        //bu iki sayının çarpım sonucunu kod yazmadan konsola yazdırın
        System.out.println(C01_Carpim.carpimMethodu(a, b)); //200

        String c="Nasıl";
        String d="yani";
        //bu iki stringi aralarında bir boşluk bırakarak yazdırın
        System.out.println(C02_StringConcate.birlestirmeMethodu(c, d)); //Nasıl yani?


        String e="Bu da mı oldu?";
        //e stringini tersten yazdırın
        System.out.println(C03_StringTerseCevirme.StringiTerseCevir(e));


        // aşağıdaki cümleyi terse çevirin
        // "ali top at"
        System.out.println(C03_StringTerseCevirme.StringiTerseCevir("ali top at"));




    }
}
