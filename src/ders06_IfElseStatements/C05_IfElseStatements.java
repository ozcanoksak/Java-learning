package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    static void main() {

        // Kullanıcıdan yaşını isteyin, 65 yaş ve üzeri ise "Emekli Olabilirsin" yazdırın
        // yoksa emekli olması için çalışması gereken yıl sayısını yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı Giriniz");
        double yas = scan.nextDouble();

        if (yas>=65){
            System.out.println("Yaşınız emeklilik için yeterli");}

        else {
            System.out.println("Emekli olmak için " + (65-yas) + " sene daha çalışmalısnız" );}




    }
}
