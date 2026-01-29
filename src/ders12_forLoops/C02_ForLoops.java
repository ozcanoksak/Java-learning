package ders12_forLoops;

public class C02_ForLoops {
    static void main() {

        for (int i=0; i <=10 ; i++) {
            System.out.print(i + " ");

        }

        System.out.println(" ");


        // 2 basamaklı sayılardan 7 ile bölünebilenleri yan yana yazdırın
        for (int i = 10; i <100 ; i++) {
            if ((i%7==0)) System.out.print(i+ " ");

        }

        System.out.println(" ");



       // 13 den başlayıp 100'e kadar 7'şer 7'şer yazdıralım
        for (int i = 13; i <=100 ; i+=7) {
            System.out.print(i + " ");

        }

        System.out.println(" ");


        // 1 den 10 kadar (sınırlar dahil) sayıların karesini yazdıralım.,

        for (int i = 1; i <=10 ; i++) {
            System.out.print(i*i + " ");

        }








    }
}
