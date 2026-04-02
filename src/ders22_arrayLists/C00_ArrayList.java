package ders22_arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C00_ArrayList {

    static void main() {


        List<String> liste=new ArrayList<>();
        liste.add("Eyup");
        liste.add("Yahya");
        liste.add("Esra");
        liste.add("Seher");

        System.out.println(liste); // [Eyup, Yahya, Esra, Seher]

        Collections.sort(liste); // Bir list’deki elemanları baştan sona sırasıyla sıralar
        System.out.println(liste); // [Esra, Eyup, Seher, Yahya

        //liste.subList(); verilen iki index arasındaki elementleri yazdırır
        System.out.println(liste.subList(1, 3)); // [Yahya, Esra]
    }
}
