package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {
    static void main() {

        // Kullanıcıdan cinsiyetini ve yaşını alın, kadın 60 yaş ve üzeri
        // erkek 65 yaş ve üzeri emekli olabilir
        // Cinsiyet ve yaşını dikkate alarak
        // Emekli olabilirsin veya "Emekli olmak için ... yıl daha çalışman gerekir" yazdırın

        char cinsiyet='K';
        int yas=56;

        //nested-if-else şeklinde kullanım için önce ana değişkeni seçip ona göre yapı oluşturalım

        // cinsiyet ana değişken olsun

        if (cinsiyet=='k' || cinsiyet=='K') {
            //giriş yapılan değer bir kadına aittir

            if (yas<15) {
                System.out.println("Hatalı yaş girişi");
            } else if (yas<60) {
                System.out.println("Emekli olabilmek için daha " +(60-yas) + " yıl çalışmalısın");
            }else {
                System.out.println("Emekli olabilirsin");}

        } else if (cinsiyet=='e' || cinsiyet=='E') {
            // giriş yapılan değer bir erkeğe aittir

                if (yas<15) {
                    System.out.println("Hatalı yaş girişi");
                } else if (yas<65) {
                    System.out.println("Emekli olabilmek için daha " +(65-yas) + " yıl çalışmalısın");
                }else {
                    System.out.println("Emekli olabilirsin");}
        } else {
            System.out.println("Yanlış cinsiyet girişi");

    }
}}
