package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayı alıp ikisinin değerlerini değiştirin (swap)

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen birinci tam sayıyı giriniz");

        int birinciSayi = scan.nextInt();

        System.out.println("Lütfen ikinci tam sayıyı giriniz");
        int ikinciSayi = scan.nextInt();

        int bos;

        bos=ikinciSayi;

        ikinciSayi=birinciSayi;

        birinciSayi=bos;

        System.out.println("birinciSayi'in değeri :" + birinciSayi);
        System.out.println("ikinciSayi'nin değeri :" + ikinciSayi);













    }}