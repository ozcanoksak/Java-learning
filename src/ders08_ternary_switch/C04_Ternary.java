package ders08_ternary_switch;

public class C04_Ternary {
    static void main() {

        // soru 2 - kullanıcıdan bir üçgenin 3 kenar uzunluğunu alın
        // üçgen eşkenar ise "Eşkenar üçgen" yazdırın değilse  "eşkenar üçgen değil" yazdırın

        int kenar1 =10;
        int kenar2 =12;
        int kenar3 =10;

        System.out.println(kenar1==kenar2 && kenar2==kenar3 ? "Eşkenar üçgen" : "eşkenar üçgen değil");


        // kullanıcıdan iki sayı alın ve büyük olmayanı yazdırın

        int sayi1=10;
        int sayi2=11;

        System.out.println(sayi1>sayi2 ? sayi2:sayi1);







    }
}
