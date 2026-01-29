package ders04_matematikselİslemer;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        // kullanıcıdan girdiği 4 basamaklı bir sayının rakamlar toplamını veren bir kod yazınız

        int input= 1453;

        int birlerBasamagi= 0;
        int rakamlarToplami= 0;


        // 1- birler basamağını al
        birlerBasamagi = input % 10 ; //3 (1453 % 10 = 145.3 noktadan sonrası birler basamağı olarak alınır)

        // 2- birler basamagını rakamlar toplamına ekle
        rakamlarToplami = birlerBasamagi + rakamlarToplami ; //3  (3+0=3)

        // 3- birler basamağından kurtul
        input= input/10; //145



        birlerBasamagi = input % 10 ; //5
        rakamlarToplami = birlerBasamagi + rakamlarToplami ; // 8
        input= input/10; //14



        birlerBasamagi = input % 10 ; //4
        rakamlarToplami = birlerBasamagi + rakamlarToplami ; // 12
        input= input/10; //1



        birlerBasamagi = input % 10 ; //1
        rakamlarToplami = birlerBasamagi + rakamlarToplami ; // 13
        input= input/10; //0

        System.out.println("verilen sayının rakamlar toplamı : " + rakamlarToplami);


   }}