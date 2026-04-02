package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_remove {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        sayilar.remove(2);
        System.out.println(sayilar);
        sayilar.remove(5);
        System.out.println(sayilar); // [1, 2, 3, 5, 3, 2, 5, 1, 2, 4, 5, 3, 4, 5]

        /*
         Listemiz integer'lardan olusuyorsa
         biz int bir deger yazdigiizda hep index kabul ettiginden
         istedigimiz elementi obje olarak girip sildirmek icin
         onceden tanimlamamiz gerekir
         */

        //index numarası ile değilde listede silmek istediğimiz objeyi
        // index girmeden aşağıdaki methodu kullanarak silebiliriz
        Integer silinecekObje= 4;
        sayilar.remove(silinecekObje); //listedeki ilk 4 objesini sildi
        System.out.println(sayilar);

        // tum 3'leri sildirin
        silinecekObje=3;

        while(sayilar.contains(silinecekObje)){
            sayilar.remove(silinecekObje);
        }

        System.out.println(sayilar); // [1, 2, 5, 2, 5, 1, 2, 5, 4, 5]


        silinecekObje=10;
         System.out.println(sayilar.remove(silinecekObje)); // false


        sayilar.remove(20); // bu index numarasında bir değer olmadığı için IndexOutOfBoundsException hatası verir




        List<Integer> sayilar2 = new ArrayList<>();
        sayilar2.add(10);
        sayilar2.add(15);
        sayilar2.add(20);
        sayilar2.add(2);

        System.out.println(sayilar2); // [10, 15, 20, 2]

        sayilar2.remove( 2);
        System.out.println(sayilar2); // [10, 15, 2]

        Integer silinecek = 10;
        sayilar2.remove(silinecek);
        System.out.println(sayilar2); // [15, 2]

        sayilar2.clear(); // tüm listeyi temizler
        System.out.println(sayilar2); // []


        List <String> liste=new ArrayList<>();
        liste.add("Fatih");
        liste.add("Levent");
        liste.add("Esra");
        liste.add("Seher");

        List<String> silinecekListe=new ArrayList<>();
        silinecekListe.add("Fatih");
        silinecekListe.add("Levent");

        //bir listede olan başka bir listeyi silmek için .removeAll(silinecekList) methodu kullanılır
        liste.removeAll(silinecekListe);
        System.out.println(liste); // [Esra, Seher]


        //iki listenin eşit olup olmadığını kontrol etmek için list.equals() methodu kullanılır
        System.out.println(liste.equals(silinecekListe)); // false
    }
}
