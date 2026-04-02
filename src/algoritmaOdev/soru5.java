package algoritmaOdev;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 3x3 boyutunda iki matris oluşturuyoruz
        double[][] matris1 = new double[3][3];
        double[][] matris2 = new double[3][3];


        System.out.print("Birinci matrisi giriniz (9 sayı): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matris1[i][j] = input.nextDouble();
            }
        }


        System.out.print("İkinci matrisi giriniz (9 sayı): ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matris2[i][j] = input.nextDouble();
            }
        }

        double[][] toplamMatris = addMatrix(matris1, matris2);


        System.out.println("Matrislerin toplamı şu şekildedir:");
        for (int i = 0; i < 3; i++) {

            // Birinci matrisin satırı
            yazdirSatir(matris1[i]);


            if (i == 1) System.out.print("  +   ");
            else System.out.print("      ");

            // İkinci matrisin satırı
            yazdirSatir(matris2[i]);

            if (i == 1) System.out.print("  =   ");
            else System.out.print("      ");

            // Sonuç matrisinin satırı
            yazdirSatir(toplamMatris[i]);

            System.out.println(); // Yeni satıra geç
        }
    }

    // İki matrisi toplayan metod
    public static double[][] addMatrix(double[][] a, double[][] b) {
        double[][] c = new double[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }

    // Yardımcı metod: Bir satırı yan yana yazdırır
    public static void yazdirSatir(double[] satir) {
        for (int i = 0; i < satir.length; i++) {
            System.out.print(satir[i] + " ");
        }
    }
}