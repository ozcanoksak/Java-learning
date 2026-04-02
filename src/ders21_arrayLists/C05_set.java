package ders21_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C05_set {

    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};

        // list.set(index, yeniDeger) method'u
        // istenen index'deki eski degeri silip bize yeni değeri döndürür
        // ve o indexdeki degeri verdigimiz yeni deger olarak atar


        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

                sayilar.add(arr[i]);
        }

        // Java'da set() u update icin kullanir
        // add() (ekleme yapar) ile set() (güncelleme yapar) farklidir

        //set(index, deger)Mevcut bir elemanı günceller.Değiştirilen (eski) elemanı döndürür.

        System.out.println(sayilar.set(0, 8)); //0. indekste 1 vardı.
        // Java oraya 8 yazdı ama ekrana "Ben az önce buradan 1 değerini
        // sildim" demek için 1 değerini döndürdü.

        int eskiDeger= sayilar.set(1,9);

        System.out.println(eskiDeger);
        System.out.println(sayilar);


    }
}
