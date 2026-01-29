package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

       /* kullanıcıdan bir dikdörtgenini 2 kenar uzunluğunu alıp dikdörtgenin alanını yazdırın */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen dikdörtgenin 2 kenar uzunluğunu girin\niki kenar uzunluğu arasında enter'a basın");


        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();

        System.out.println("dikdörtgenin alanı :" + (kenar1*kenar2));






    }


}
