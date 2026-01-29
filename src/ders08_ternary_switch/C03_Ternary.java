package ders08_ternary_switch;

public class C03_Ternary {
    static void main() {

        int a=5;

        /* ternary operatörü tek başına kullanılmaz ternary bize bir sonuç üretir
        bu sonucu ya direkt yazdırmalı veya bir variable'a atamalıyız */

        String sonuc = a%2==0 ? "çift sayı" : "tek sayı";
        System.out.println(sonuc);

        /* ternary 'nin sonucunu bir veriableye atayacaksak true ve false durumlarında üretebilecek sonucun
        aynı data türüne uygun olması gerekir aksi halde CTE hatası oluşur


        ama ternary'i sout içinde kullanırsak sonuçların data türünün aynı olması şart olmaz */

        //String sonuc2 = a>10 ? "büyük sayı" : + 2*a; CTE hatası verir

        String sonuc2 = a>10 ? "büyük sayı" : "" + 2*a; //CTE vermemesi için Stringe çevirdik

        System.out.println(sonuc2);

        System.out.println(a>10 ? "büyük sayı" : 2*a); //sout içinde kullandık




    }
}
