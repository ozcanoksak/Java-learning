package ders00_Alistirma;

public class A07_diziler {
    static void main() {

        //VeriTipi diziAdı [] = new VeriTipi [eleman sayısı]
        //VeriTipi [] diziAdı  = new VeriTipi [eleman sayısı]

        //VeriTipi [] diziAdı  = {v1, v2, v3}


        int [] liste = new int [4]; //bellekte 4 tane tam sayı (int) alabilecek kapasitede, adı liste olan boş bir dizi oluşturur

        int [] liste2 = {1,2,3,4};

        liste [0] = 1; // daha önce açılan boş diziyi tek tek dolduruyoruz
        liste [1] = 2;
        liste [2] = 3;
        liste [3] = 4;

        System.out.println(liste[3]); //4
        System.out.println(liste.length);//4


        int toplam =0;

        for (int i = 0; i < liste.length; i++) {

            toplam += liste[i];
        }

            double ortalma = (double) toplam / liste.length;

            System.out.println("Sayıların toplamı: " + toplam);
            System.out.println("Sayıların ortalması: " + ortalma);




    }
}
