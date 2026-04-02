package algoritmaOdev;

public class soru4 {

    public static void main(String[] args) {

        int[][] saatler = {
                {2, 4, 3, 4, 5, 8, 8}, // Çalışan 0
                {7, 3, 4, 3, 3, 4, 4}, // Çalışan 1
                {3, 3, 4, 3, 3, 2, 2}, // Çalışan 2
                {9, 3, 4, 7, 3, 4, 1}, // Çalışan 3
                {3, 5, 4, 3, 6, 3, 8}, // Çalışan 4
                {3, 4, 4, 6, 3, 4, 4}, // Çalışan 5
                {3, 7, 4, 8, 3, 8, 4}, // Çalışan 6
                {6, 3, 5, 9, 2, 7, 9}  // Çalışan 7
        };

        int[] toplamSaatler = new int[8];
        int[] calisanNolar = new int[8];


        //Her çalışanın toplam saatini hesaplama
        for (int i = 0; i < saatler.length; i++) {
            int satirToplami = 0;

            for (int j = 0; j < saatler[i].length; j++) {
                satirToplami = satirToplami + saatler[i][j];
            }

            toplamSaatler[i] = satirToplami;
            calisanNolar[i] = i;
        }

        // Büyükten küçüğe sıralama (Bubble Sort)

        for (int i = 0; i < toplamSaatler.length; i++) {
            for (int j = 0; j < toplamSaatler.length - 1; j++) {
                if (toplamSaatler[j] < toplamSaatler[j + 1]) {


                    // Saatleri yer değiştir
                    int geciciSaat = toplamSaatler[j];
                    toplamSaatler[j] = toplamSaatler[j + 1];
                    toplamSaatler[j + 1] = geciciSaat;

                    // Çalışan numaralarını da beraberinde yer değiştir
                    int geciciNo = calisanNolar[j];
                    calisanNolar[j] = calisanNolar[j + 1];
                    calisanNolar[j + 1] = geciciNo;
                }
            }
        }

        System.out.println("Çalışanlar ve Toplam Çalışma Saatleri:");
        for (int i = 0; i < toplamSaatler.length; i++) {
            System.out.println("Çalışan " + calisanNolar[i] + ": " + toplamSaatler[i] + " saat");

            /* output:
            Çalışanlar ve Toplam Çalışma Saatleri:

            Çalışan 7: 41 saat
            Çalışan 6: 37 saat
            Çalışan 0: 34 saat
            Çalışan 4: 32 saat
            Çalışan 3: 31 saat
            Çalışan 1: 28 saat
            Çalışan 5: 28 saat
            Çalışan 2: 20 saat
            */
        }
    }
}

