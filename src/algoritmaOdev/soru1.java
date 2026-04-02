package algoritmaOdev;

import java.util.ArrayList;
import java.util.Collections;

public class soru1 {

        public static void main(String[] args) {

            // 1. String türünde ArrayList oluşturma ve 5 isim ekleme
            ArrayList<String> ogrenciler = new ArrayList<>();
            ogrenciler.add("Özcan");
            ogrenciler.add("Berfin");
            ogrenciler.add("Delal");
            ogrenciler.add("Öznur");
            ogrenciler.add("Mert");



            // 2. listenin başına yeni bir öğrenci ekleme
            // (0. indekse ekleyerek en başa koymuş oluyoruz)
            ogrenciler.add(0, "Elif");


            // 3. listeden 2. sıradaki öğrenciyi silme
            ogrenciler.remove(1);


            // 4. İsimleri alfabetik sıraya göre sıralama
            Collections.sort(ogrenciler);


            // Sıralanmış listeyi ekrana yazdırma
            System.out.println("Sıralı Öğrenci Listesi:" + ogrenciler);


            // 5. Listede kaç öğrenci olduğunu yazdırma
            System.out.println("Toplam öğrenci sayısı: " + ogrenciler.size());

            /*
            output:
            Sıralı Öğrenci Listesi:[Berfin, Delal, Elif, Mert, Öznur]
            Toplam öğrenci sayısı: 5
             */
        }
    }

