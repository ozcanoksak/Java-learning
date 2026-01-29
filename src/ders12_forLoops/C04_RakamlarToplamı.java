package ders12_forLoops;

public class C04_RakamlarToplamı {
    static void main() {


    int sayi=1453;
    String sayiStr = "" + sayi;
    // length uzunluğunu bulabilmek için stringe çevirdik


    int birlerBasamagi= 0;
    int rakamlarToplamı=0;


        for (int i = 1; i <=sayiStr.length() ;  i++) {
            birlerBasamagi=sayi%10;
            rakamlarToplamı =rakamlarToplamı+birlerBasamagi;
            sayi=sayi/10;

        }

        System.out.println(rakamlarToplamı);




}}
