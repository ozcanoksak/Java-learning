package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        /* uygulama/
        kullanıcıdan bir tam sayı alın kullanıcı kaç sayı girerse girsin
         konsolda -128 ile +127 arasında bir sonuç yazdıracak kod yazınız */

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int girilenSayi= scan.nextInt();


        byte donusenSayi=(byte) girilenSayi;

        System.out.println("Girdiğiniz : " +  girilenSayi  + "\n" + girilenSayi + "'nin dönüşmüş hali : " + donusenSayi);





    }}
