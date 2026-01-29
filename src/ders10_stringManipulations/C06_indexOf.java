package ders10_stringManipulations;

public class C06_indexOf {
    static void main() {

        //indexOf stringte aranan karakter veya kelimelerin kaçıncı indexte başladığını verir
        //char olarakta kabul edebilir

    String str = "Ahmet hoca ile herşey clear";


        System.out.println(str.indexOf("a")); // 9  (ilk a'nin index'ini söyler)

        System.out.println(str.indexOf('c')); // 8

        System.out.println(str.indexOf("herşey")); // 15



        System.out.println(str.indexOf("e", 9)); // 13
        // verilen index değerinden hemen sonraki karakteri veya kelimeyi arar onun index değerini verir

        System.out.println(str.indexOf("hoca", 12)); //-1 (olmadığı için -1 verir)

        // 13.index'deki e'den bir sonraki e'nin index'ini bulalim
        System.out.println(str.indexOf("e",14)); //16

        //cümledeki 2.c nin indexini yazdırın

        int ilkcIndex = str.indexOf("c"); //8

        System.out.println(str.indexOf("c", ilkcIndex)); //22






    }
}
