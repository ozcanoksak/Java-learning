package ders00_Alistirma;

import java.util.Random;

public class A06 {
    static void main() {




        Random rnd = new Random(); //random kütüphanesini ekliyoruz

        int [] dizi = new int[] {rnd.nextInt(0,55)}; //istediğimiz aralıkta random sayılar yazar
        System.out.println(dizi[0]);


        int dizi2 [] = new int[10]; //10 elemanlı bir dizi oluşturduk
        System.out.println(dizi2);



    }
}
