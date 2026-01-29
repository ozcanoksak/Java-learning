package ders06_IfElseStatements;

import java.util.Scanner;

public class C10_IfElseStatements {
    static void main() {

        // Kullanıcıdan cinsiyetini ve yaşını alın, kadın 60 yaş ve üzeri
        // erkek 65 yaş ve üzeri emekli olabilir
        // Cinsiyet ve yaşını dikkate alarak
        // Emekli olabilirsin veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın

        Scanner input = new Scanner(System.in);

        System.out.print("lütfen cinsiyetinizi giriniz: ");
        char cinsiyet = input.next().charAt(0);


        System.out.println("Lütfen yaşınızı giriniz: ");
        double yas = input.nextDouble();


        if (cinsiyet =='E' || cinsiyet=='e' && yas>=65){
            System.out.println("Emekli Olabilirsin");}

            else if (cinsiyet=='E' || cinsiyet=='e' && yas<65 ){
            System.out.println("Emekli Olmak için " + (65-yas) + " sene daha çalışmalısın ");}

            else if (cinsiyet =='K' || cinsiyet=='k' && yas>=60){
                System.out.println("Emekli Olabilirsin");}

            else if (cinsiyet=='K' || cinsiyet=='k' && yas<60 ){
            System.out.println("Emekli Olmak için " + (60-yas) + " sene daha çalışmalısın ");}







    }
}
