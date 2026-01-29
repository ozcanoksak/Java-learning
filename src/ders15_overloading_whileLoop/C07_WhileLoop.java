package ders15_overloading_whileLoop;

public class C07_WhileLoop {
    static void main() {

// kullanıcıdan bir sayı ve hesaplamak istediği üssü isteyin
// while loop kullanarak verilen sayının istenen üssünü hesaplayıp yazdıran bir method oluşturun

        int sayi =3;
        int us=2;
        usHesapla(sayi, us);


    }//main

    public static void usHesapla (int sayi, int us){

        int sonuc =1;

        while (us>0){

            sonuc*= sayi;

            us--;
        }
        System.out.println(sonuc);
    }
}
