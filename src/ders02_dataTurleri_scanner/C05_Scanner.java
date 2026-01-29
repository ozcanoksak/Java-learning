package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

    /* kullanıcıdan bir double bir de int sayi alıp bunların toplamını ve çarpımını yazddırın */

    Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen ondalıklı bir sayı giriniz");

        double ondalikliSayi = scan.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz");
        int tamSayi = scan.nextInt();

        System.out.println("Girilen Sayıların Toplamı : " + (ondalikliSayi+tamSayi));

        System.out.println("Girilen Sayıların Çarpımı : " + (ondalikliSayi*tamSayi));





}}
