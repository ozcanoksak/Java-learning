package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {

 public static void main(String[] args) {

     System.out.println('a' + 'b');  // 97 + 98 =195,

     char harf = 'a';
     int sayi= 100;
     System.out.println(harf + sayi); //197
     System.out.println(harf + 1);  //98




     /* Kullanıcıdan char bir karakter alın o o karakterden gelen sonraki 3 karakteri yazdirin,
     örnek : input: a , output :bcd   */

     Scanner scan = new Scanner(System.in);

     System.out.println("Lütfen bir karakter girin");

     char girilenKarakter = scan.next().charAt(0);

     System.out.println("" + (char) (girilenKarakter+1) + (char) (girilenKarakter+2) + (char) (girilenKarakter+3));



}}
