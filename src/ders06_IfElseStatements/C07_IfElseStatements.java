package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    static void main() {
        /* Kullanıcıdan bir harf isteyin girilen karakter küçük harf ise onu büyük harf olarak yazdırın
        yoksa girilen harfi yazdırın
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if (krk>='a' && krk<='z') { //küçük harf girildi demektir
            System.out.println((char)(krk-32));
        }

        else { //küçük harf değil demektir
            System.out.println(krk);}
    }
}
