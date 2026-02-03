package ders16_doWhileLoop;

public class C02_doWhileLoop {
    static void main() {

        //10, 11, 12 sayılarını toplayan bir while loop oluşturalım

        int sayi=10;
        int toplam=0;

        do {
            toplam+=sayi;
            sayi++;

        }while (sayi<=12);

        /*

        do while loop'un 2 avantajı vardır
        1- Loop body'si en az bie kere çalışır
        (while loop'da başlangıç değeri uygun değilse, loop body'si hiç çalışmayabilir)

        2- while bitiş kontrolü loop kadar çalışır
        (while loop'da bir kere fazla çalışırdı)
         */

    }
}
