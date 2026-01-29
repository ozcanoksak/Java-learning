package ders15_overloading_whileLoop;

public class C08_RakamlarToplami {

    static void main() {

        //while loop kullanarak kullanıcıdan alınan sayının rakamlar toplamını bulun

        int sayi =1453;

        int birlerBasamagi=0;
        int rakamlarToplami=0;



        while (sayi!=0){
            birlerBasamagi=sayi%10;
            rakamlarToplami +=birlerBasamagi;
            sayi/=10;

        }//while

        System.out.println(rakamlarToplami); //13

    }
}
