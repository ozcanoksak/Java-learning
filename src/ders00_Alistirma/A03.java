package ders00_Alistirma;

import java.util.Scanner;

public class A03 {
    static void main() {

        // Kullanıcıdan cinsiyetini ve yaşını alın, kadın 60 yaş ve üzeri
        // erkek 65 yaş ve üzeri emekli olabilir
        // Cinsiyet ve yaşını dikkate alarak
        // Emekli olabilirsin veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın

        Scanner input = new Scanner(System.in);

        System.out.print("cinsiyetinizi giriniz: ");
        char cinsiyet=input.next().toUpperCase().charAt(0);

        System.out.print("yaşınızı giriniz: ");
        double yas = input.nextDouble();

        if (cinsiyet =='E' && yas>=65){
            System.out.println("Emekli Olabilirsiniz");}

        else if (cinsiyet =='E' && yas<=65) {
            System.out.println("Emekli olabilmeniz için " + (65-yas) + " sene daha çalışmalısınız") ;}

        else if (cinsiyet =='K' && yas>=60){
            System.out.println("Emekli Olabilirsiniz");}

            else if (cinsiyet =='K' && yas<60){
            System.out.println("Emekli olabilmeniz için " + (60-yas) + " sene daha çalışmalısınız");

        }}}





