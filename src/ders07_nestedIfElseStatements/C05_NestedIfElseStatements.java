package ders07_nestedIfElseStatements;

public class C05_NestedIfElseStatements {
    static void main() {

        /* Kullanıcıdan aldığı ürün adedi ve liste fiyatı alın,
         kullanıcıya müşteri kartı olup olmadığını sorun,
         Müşteri kartı varsa 10 üründen fazla alırsa %20 on üründen az ise %15 indirim yapın,
         Müşteri kartı yoksa 10 üründen fazla alırsa %15, on üründen az ise %10 indirim yapın */

        int urunAdedi=30;
        boolean kartVarMi=false;
        double listeFiyati=12.5;
        double toplamFiyat=0;

        // ana değişken kart olsun

        if(kartVarMi){
            // kart var
         if (urunAdedi<0) {
             System.out.println("Hatalı ürün adedi girişi");

         } else if (urunAdedi<10) {
             toplamFiyat = urunAdedi * listeFiyati * 0.85;
             System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

         }else {
             toplamFiyat = urunAdedi * listeFiyati* 0.80;
             System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);
         }



      } else{
     //kart yok
            if (urunAdedi<0) {
            System.out.println("Hatalı ürün adedi girişi");

        } else if (urunAdedi<10) {
            toplamFiyat = urunAdedi * listeFiyati * 0.90;
            System.out.println("%10 indirimli toplam fiyat : " + toplamFiyat);

        }else {
            toplamFiyat = urunAdedi * listeFiyati* 0.85;
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);
        }






        }


    }
}
