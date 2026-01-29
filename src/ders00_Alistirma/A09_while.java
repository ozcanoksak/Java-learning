package ders00_Alistirma;

public class A09_while {
    static void main() {

        //birden 5 e kadar olan sayıları ekrana yazdırn

        //başlangış
        //koşul
        //koşul değiştirme

        for (int i = 1; i < 5; i++) {

        }
        int sayi =1;
        while (sayi<5) { //koşul değeri true olduğu için döngü çalışır
            System.out.print(sayi);
            sayi++; //birer arttırır
        }


            //27 den 13 e (13 dahil değil) kadar olan tek sayıları yazdırın
        int sayi2=27;
        while (sayi2>13){
            System.out.print(" "+sayi2);
            sayi2=sayi2-2;
            // sayi -=2;
        }

        System.out.println(" ");

        //2. yöntem
        int sayi3=27;
        while (sayi3>13){
            if (sayi3%2==1){
                System.out.print(" " + sayi3);
            }
            sayi3 --;




        }


    }
}
