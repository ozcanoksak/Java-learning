package ders03_datacastingWrapperClass;

public class C02_ExplicitNarrowing {
    public static void main(String[] args) {

        int sayi =20;

        short sh= (short)sayi;
        System.out.println(sh); // 20



        /* geniş data türündeki bir değeri, dar data türündeki bir variableye atamak isterseniz
        java sorumluluğu almanızı ister

        bu sorumluluğu almak için cast edeceğiniz değer'in önüne parantez içerisinde ()
        cast etmek istediğimiz data türü yazılır.

        ancak bu durumda data kayıpları (doublede'den int'e geçerken virgülden sonrası silinir) */


        double dbl=23.5;
        int say= (int) dbl;
        System.out.println(say); // 23 (virgülden sonrasını atar)



        /* veya başkalaşım olabilir (int'i byte'a çevirirsek tekrar tekrar başa döner)  */

        say= 132; //int
        byte byt= (byte)say;
        System.out.println(byt); //-124

        int a= 12;
        int c= 567;

        byte b= (byte) a;
        System.out.println(b); //12

        byte d= (byte) c;
        System.out.println(d);  //55


    }
}
