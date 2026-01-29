package ders10_stringManipulations;

public class C01_concatenation {
    static void main() {

        //concat string variablelerini birleştimek için kullanılır

        String str1= "Java";
        String str2= "Guzeldir";
        boolean bl= true;
        int sayi= 20;
        double dbl = 3.54;

        System.out.println(str1+bl+sayi); //Javatrue20

        // System.out.println(bl+sayi); //hata verir
        // String disindaki data turlerinde toplama yapmamiza izin vermeyebilir

        System.out.println(sayi + dbl); // 23.54


        // concat() sadece String variable'lari birlestirmek icin kullanilir
        // System.out.println(str1.concat(bl)); //hata verir

        System.out.println(str1.concat(" ").concat(str2)); //Java Guzeldir

    }}
