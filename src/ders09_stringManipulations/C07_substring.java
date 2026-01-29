package ders09_stringManipulations;

public class C07_substring {
    static void main() {

        String str = "Java gün geçtikçe güzelleşiyor";

        System.out.println(str.substring(5,8)); //"gün"
        //5. index dahil 8. index hariç yazar


        //geçtikçe yazdırın

        System.out.println(str.substring(9,17)); // geçtikçe

        System.out.println(str.substring(3,7)); // a gu



        // verilen ismin ilk harfini büyük geriye kalanları küçük yazdırın

        String isim = "HASAN";

        System.out.println( isim.substring(0, 1).toUpperCase() + isim.substring(1, 5).toLowerCase());



        // sadece 4.harfi yazdırın (A)
        System.out.println(isim.substring(3, 4));


        System.out.println(isim.substring(2, 2)); //hiçlik yazdırır ""

        // System.out.println(5, 2); //hata verir










    }
}
