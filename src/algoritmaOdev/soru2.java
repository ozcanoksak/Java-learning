package algoritmaOdev;

import java.util.ArrayList;
import java.util.Scanner;

public class soru2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double> urunler = new ArrayList<>();

            System.out.println("ürün fiyatlarını giriniz (Durdurmak için 0 girin):");

            double girilenFiyat = scanner.nextDouble();

            // Fiyat 0 olmadığı sürece
            while (girilenFiyat != 0) {
                urunler.add(girilenFiyat);
                girilenFiyat = scanner.nextDouble();
            }


            if (urunler.size() > 0) {
                double toplam = 0;
                double enPahali = urunler.get(0);
                double enUcuz = urunler.get(0);
                ArrayList<Double> pahaliUrunler = new ArrayList<>();


                for (int i = 0; i < urunler.size(); i++) {

                    // Toplam hesabı
                    toplam = toplam + urunler.get(i);

                    // En pahalı kontrolü
                    if (urunler.get(i) > enPahali) {
                        enPahali = urunler.get(i);
                    }

                    // En ucuz kontrolü
                    if (urunler.get(i) < enUcuz) {
                        enUcuz = urunler.get(i);
                    }

                    // 50 TL üstü kontrolü
                    if (urunler.get(i) > 50) {
                        pahaliUrunler.add(urunler.get(i));
                    }
                }

                double ortalama = toplam / urunler.size();


                System.out.println("Toplam Tutar: " + toplam + " TL");
                System.out.println("En Pahalı Ürün: " + enPahali + " TL");
                System.out.println("En Ucuz Ürün: " + enUcuz + " TL");
                System.out.println("Ortalama Fiyat: " + ortalama + " TL");
                System.out.println("50 TL Üzerindeki Ürünler: " + pahaliUrunler);

            } else {
                System.out.println("Sisteme hic ürün girişi yapılmadı.");

                /* input:
                {10, 20, 30, 40, 50, 60, 70}

                 output:
                 Toplam Tutar: 280.0 TL
                 En Pahalı Ürün: 70.0 TL
                 En Ucuz Ürün: 10.0 TL
                 Ortalama Fiyat: 40.0 TL
                 50 TL Üzerindeki Ürünler: [60.0, 70.0]

                 */
            }
        }
    }

