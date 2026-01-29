package ders12_forLoops;

public class C05_DikkatEdilecekler {
    static void main() {


        /* sonsuz loop

        for (int i=0; i>-10; i++) {
            System.out.println(i + " ");

        }
*/

        //ilk değer için bitiş şartı true olmuyorsa
        // for body'si hiç devreye girmez
        for (int i = 0; i > 10; i++) {
            System.out.println(i);
        }

       // bir loop'un sonunu beklemeden bitirmek istersek

        // kullanıcıdan verdiği bir sayının asal sayı olup olmadığını bulun
        // asal sayi:1 ve kendisi dışında hiç bir tam sayıya bölünmeyen sayıdır

        int sayi=103;
        int bayrak=0;


        for (int i = 2; i< sayi-1; i++) {

            if (sayi % i==0) {
                //herhangi bir bölmesinin olması yeterli

              bayrak++;
              break; //durmasını istediğimiz için break koyuyoruz
            }
        }

        System.out.println(bayrak);

        if (bayrak==0)
            System.out.println("asal sayı");

        else System.out.println("asal sayı değil");


    }
}
