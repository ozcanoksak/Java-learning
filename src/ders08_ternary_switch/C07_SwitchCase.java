package ders08_ternary_switch;

import java.util.Scanner;

public class C07_SwitchCase {
    static void main() {

        // J: Java,  D: Devolepment,  K: Kit
        //kullanıcıdan bir harf alın alınan harf J,D,K'dan biri ise yukarıdaki kelimeleri yazdırın
        //bu harflerden biri değil ise "geçersiz harf" yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf girin");
        char harf = scan.next().charAt(0);

        switch (harf) {
            case 'J':
            case 'j':
                System.out.println("Java");
                break;

             case 'D':
             case 'd':
                 System.out.println("Devolepment");
                 break;

             case 'K':
             case 'k':
                 System.out.println("Kit");
                 break;

             default:
                 System.out.println("Geçersiz harf girişi");

        }//switch

    }
}
