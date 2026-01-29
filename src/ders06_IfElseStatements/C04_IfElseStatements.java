package ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    static void main() {

        // Kullanıcıdan bir karakter girmesini isteyin, girilen karakterin büyük harf olup olmadığını yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir karakter giriniz");

        char krk=scan.next().charAt(0);

        if (krk>='A' && krk<='Z') {
            System.out.println("Büyük Harf");}

        else {
            System.out.println("Büyük Harf Değil");}
    }
}
