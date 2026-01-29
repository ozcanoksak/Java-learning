package ders01_programlamayaGiris;

public class C01_HelloWorld {

    static void main() {
        System.out.println("Hello World");

    }

    public static class C02_Variables {
        static void main() {

            int sayi=111;

            System.out.println("Hello Java");

            System.out.print(sayi);

            System.out.println("sayi");

            /* javada'da iki türlü yazdırma yapabiliriz; eğer çift tırnak içinde bir bilgi yazarsak java ne yazmışsak
             konsolda aynen onu yazar

             ancak " " olmayan bir şey görürse onu yazdırılacak bir metin değil bir değer taşıyan veriable
             olduğunu anlar veriablede ne değer varsa onu yazar
             */

            int not;
            not=50;
            System.out.println(not);
        }
    }
}