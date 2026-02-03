package ders16_doWhileLoop;

public class C04_doWhile {
    static void main() {

        //Soru 3
        // kullanıcıdan bir pozitif sayı isteyin
        // sayının tam kare olup olmadığını bulun
        // tam kare ise true değilse false yazdırın
        // örnek input: 16, output:4

        int input= 123;
        int baslangic=1;
        int bayrak=0;

        do {

            if (baslangic*baslangic==input){
                System.out.println("true");
                break;

            }//if

            baslangic++;

        } while (baslangic*baslangic<=input);

        if (bayrak==0) System.out.println("false");

    }
}