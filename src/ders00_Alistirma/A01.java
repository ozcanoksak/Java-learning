package ders00_Alistirma;

import java.util.Scanner;

public class A01 {public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Adınız");

    String adınız = scan.nextLine();

    System.out.println("Soyadınız");
    String soyadınız = scan.nextLine();

    System.out.println("adınız :" + adınız.toUpperCase() + "\nsoyadınız : "+ soyadınız.toUpperCase() +
            "\nKAYDINIZ TAMAMLANDI");

}}
