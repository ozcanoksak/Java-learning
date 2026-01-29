package ders05_concatenation_operatorler;

public class C01_Concatenation {
    static void main() {

        //sadece aşağıda verilen variable'leri kullanarak istenen değerleri yazdıralım

        String s1="Java";
        String s2="Güzeldir";
        String s3= ""; // hiçlik
        String s4= " "; //boşluk

        int sayi1=4;
        int sayi2=3;


        // 7Java Güzeldir
        System.out.println(sayi1+sayi2+s1+s4+s2);

        // Java Güzeldir7
        System.out.println(s1+s4+s2+(sayi1+sayi2));

        // Java Güzeldir 12
        System.out.println(s1+s4+s2+s4+sayi1*sayi2);

        // 34 Java
        System.out.println(sayi2+s3+sayi1+s4+s1);

        // Java7 Güzeldir43
        System.out.println(s1+(sayi1+sayi2)+s4+s2+sayi1+sayi2);










    }
}
