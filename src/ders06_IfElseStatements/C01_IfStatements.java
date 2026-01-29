package ders06_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements
{
    static void main() {

        /* kullanıcıdan bir harf alın, harf ile başlayan bir ay varsa yazdırın.
        kullanıcı o veya 0 yazdığında output ocak olsun */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ay isminin ilk harfini girin");

        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf=='0' || ilkHarf=='o') {
            System.out.println("Ocak");}

            if (ilkHarf=='s' || ilkHarf=='S') {
                System.out.println("Subat");}

                if (ilkHarf=='m' || ilkHarf=='M') {
                    System.out.println("Mart veya Mayıs");}

                    if (ilkHarf=='n' || ilkHarf=='N') {
                        System.out.println("Nisan");}

                        if (ilkHarf=='h' || ilkHarf=='H') {
                            System.out.println("Haziran");}

                            if (ilkHarf=='t' || ilkHarf=='T') {
                                System.out.println("Temmuz");}

                                if (ilkHarf=='a' || ilkHarf=='A') {
                                    System.out.println("Ağustos veya Aralık");}

                                    if (ilkHarf=='e' || ilkHarf=='E') {
                                        System.out.println("Eylül veya Ekim");}

                                        if (ilkHarf=='k' || ilkHarf=='K') {
                                            System.out.println("Kasım");}

    }
}
