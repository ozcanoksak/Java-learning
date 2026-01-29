package ders08_ternary_switch;

public class C05_NestedTernary {
    static void main() {

        // kullanıcıdan bir tam sayı alın
        //sayı pozitifse, çift tam sayı veya çift sayı değil seçeneklerinden uygun olanı yazdırın
        // sayı pozitif değilse, 3 basamaklı veya 3 basamaklı değil seçeneklerinden uygun olanı yazdırın;

        int sayi=20;

        if (sayi>0){
        //çift tam sayı veya çift sayı değil seçeneklerinden uygun olanı yazdırın

            System.out.println(sayi%2==0 ? "çift sayi" :"çift sayı değil");

        }else {
            // "üç basamaklı" veya "üç basamaklı değil" seçeneklerinde uygun olanı yazdırın
            System.out.println(sayi<-99 && sayi>-1000 ? "üç basamaklı" : "üç basamaklı değil");
        }


        //string ile de yapılabilir

        String sonuc = sayi>0 ?
                sayi%2==0 ? "çift sayı" : "çift sayı değil"
                :
                sayi<-99 && sayi>-1000 ? "üç basamaklı" : "üç basamaklı değil";



    }
}
