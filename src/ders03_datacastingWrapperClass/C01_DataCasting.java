package ders03_datacastingWrapperClass;

public class C01_DataCasting {
    public static void main(String[] args) {

        /* dar data türündeki bir değeri geniş data türündeki variable'a atama yaparsanız
        java bunu otomatik yapar */

        // byte < short < int < long < float < double

        short sh= 23;

        int a= sh;

        long lng= sh;

        float fl= lng;

        /* tam tersini yapmak isterseniz yani büyük data türündeki bir değeri küçük
        data türündeki variable'a atamak isterseniz java kabul etmez */

        double dbl= 20;

        /* a= dbl;  (hatalı olur)

        short abc= dbl; (hatalı olur)
        */







    }
}
