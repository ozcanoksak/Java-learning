package ders00_Alistirma;

import java.util.Scanner;

public class A05 {
    static void main() {

    // Kullanıcıdan cinsiyetini ve yaşını alın, kadın 60 yaş ve üzeri
    // erkek 65 yaş ve üzeri emekli olabilir
    // Cinsiyet ve yaşını dikkate alarak
    // Emekli olabilirsin veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen cinsiyetinizi girin");
        String cinsiyet = scan.next();

        System.out.println("lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();

        if (cinsiyet.equalsIgnoreCase("E")) {

            if (yas < 15) System.out.println("çocuk statüsündesiniz");

            else if (yas < 65)
                System.out.println("emekli olabilmeniz için " + (65 - yas) + " sene daha çalışmalısınız");

            else System.out.println("emekli olabilirsiniz");



        } else if (cinsiyet.equalsIgnoreCase("k"));{

            if  (yas<15) System.out.println("çocuk statüsündesiniz");

            else if (yas<60) System.out.println("emekli olabilmeniz için " + (60-yas) + " sene daha çalışmalısınız");

            else System.out.println("emekli olabilirsiniz");}




    }}
