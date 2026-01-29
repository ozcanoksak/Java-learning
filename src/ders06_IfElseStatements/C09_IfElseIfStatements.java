package ders06_IfElseStatements;

public class C09_IfElseIfStatements {
    static void main() {
        // kullanıcıdan bir tam sayı alın
        // sayı negatif ise "geçersiz sayı"
        // tek basamaklı ise "rakam"
        // iki basamaklı ise "iki basamaklı sayı
        // bunun dışındaki sayılar için "büyük sayı" yazdırın

        int sayi=2;

        if (sayi<0){
            System.out.println("Geçersiz sayı");}

        else if (sayi<10){
            System.out.println("rakam");}

        else if (sayi<100) {
            System.out.println("iki basamaklı sayı");}

            else System.out.println("Büyük Sayı");


        }}
