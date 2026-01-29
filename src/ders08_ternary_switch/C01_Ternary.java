package ders08_ternary_switch;

import java.util.Scanner;

public class C01_Ternary {
    static void main() {

        //kullanıcıdan bir sayı alın
        //sayı pozitif ise 2 katını yazdırın
        //sayı pozitif değilse sayıya 10 ekleyip yazdırın

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        double sayi = input.nextDouble();

        if (sayi>0) {
            System.out.println(sayi * 2);
        }else  {
            System.out.println(sayi+10);}




            System.out.println(sayi>0 ? 2*sayi : sayi+10); //yukarıdaki if else ile yapılanla aynı sonucu verir


    }
}
