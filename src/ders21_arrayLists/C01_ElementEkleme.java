package ders21_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C01_ElementEkleme {

    public static void main(String[] args) {

        List<Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar); // [ ] boş bir liste oluşturduk

        System.out.println(sayilar.add(10)); // true (listeye ekler ve eklendi mi diye sorar)

        System.out.println(sayilar); // [10] diziyi yazdırdık

        sayilar.add(20);

        System.out.println(sayilar);  // [10, 20] tersi soylenmedikce elementi sona ekler

        sayilar.add(1,15); //1. indexe 15 ekledik

        System.out.println(sayilar); // [10, 15, 20]

        // listenin basina 44 ekleyin
        sayilar.add(0,44);

        System.out.println(sayilar); //  [44, 10, 15, 20]


        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);

        // sayilar listesinin sonuna eklenecekListeyi ekleyin

        sayilar.addAll(eklenecekListe); //listenin içine diğer listedeki elemanları ekledik

        System.out.println(sayilar); // [44, 10, 15, 20, 3, 5]

        // sayilar listesinin basindaki 44'den sonraya eklenecek listeyi ekleyin

        sayilar.addAll(1,eklenecekListe);

        System.out.println(sayilar); // [44, 3, 5, 10, 15, 20, 3, 5]
    }
}
