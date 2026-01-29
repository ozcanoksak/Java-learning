package ders07_nestedIfElseStatements;

public class C02_IfElseStatements {
    static void main() {

        /* Kullanıcıdan aldığı ürün adedi ve liste fiyatı alın,
         kullanıcıya müşteri kartı olup olmadığını sorun,
         Müşteri kartı varsa 10 üründen fazla alırsa %20 on üründen az ise %15 indirim yapın,
         Müşteri kartı yoksa 10 üründen fazla alırsa %15, on üründen az ise %10 indirim yapın */

        int urunAdedi=30;
        boolean kartVarMi=false;
        double listeFiyati=12.5;
        double toplamFiyat=0;

        if (kartVarMi==true && urunAdedi>10 ){ toplamFiyat=urunAdedi*listeFiyati * (0.8);
            System.out.println("%20 indirimli toplam fiyat : " + toplamFiyat);

        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {toplamFiyat=urunAdedi*listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

        } else if (kartVarMi == false && urunAdedi>=10) {toplamFiyat=urunAdedi*listeFiyati * (0.85);
            System.out.println("%15 indirimli toplam fiyat : " + toplamFiyat);

        } else if (!kartVarMi && urunAdedi<10 && urunAdedi>0) { toplamFiyat=urunAdedi*listeFiyati * (0.90);
            System.out.println("%10 indirimli fiyat : " + toplamFiyat);}

            else {
                System.out.println("Toplam fiyat : " + toplamFiyat);}


            // boolean değerlerde true ya da false yazmadan true ya da false değer ataması yapabiliriz
            // "kartVarMi == false" ile  "!kartVarMi" aynı şeydir baştaki ünlem false değerleri için olduğunu belirtir
            // "kartVarMi" ile "kartVarMi==true" aynı şeydir


    }}
