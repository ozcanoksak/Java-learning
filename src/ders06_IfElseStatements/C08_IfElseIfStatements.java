package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    static void main() {

        /* kullanıcıdan bir üçgenin üç kenar uzunluğunu alın, üçgen eşkenar ise "Eşkenar Üçgen" yazdırın
        değilse "Eşkenar üçgen değil" yazdırın */

        // kenar uzunlukları 0 veya negatifse "Geçersiz Kenar Uzunluğu" yazdırın

        Scanner sc = new Scanner(System.in);

        System.out.println("Lütfen üçgenin 3 kenarını giriniz");

        int kenar1 = sc.nextInt();
        int kenar2 = sc.nextInt();
        int kenar3 = sc.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0) {
            System.out.println("Geçersiz Kenar Uzunluğu");}

            else if (kenar1==kenar2 && kenar2==kenar3) {
                System.out.println("Eşkenar Üçgen");}

                else { System.out.println("Eşkenar Üçgen Değil");
            }
        }


}
