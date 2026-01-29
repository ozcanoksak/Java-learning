package ders10_stringManipulations;

public class C07_Soru {
    static void main() {

        /* KULLanicidan bir cumle ve bir metin atin
        cumlede metnin durumuna gore
        1- cumle metni icermiyor
        2- cumle metni sadece 1 kere iceriyor
        3- cumle metni birden fazla iceriyor
        seceneklerinden uygun olani yazdirin */

        String cumle= "Java cok guzeldir cok.";
        String metin= "cok";


        if (!cumle.contains(metin)) {
            System.out.println("cumle metni icermiyor");

        } else{
            int ilkIndex= cumle.indexOf(metin); // 5

            int ikinciIndex=cumle.indexOf(metin,ilkIndex+1);
            // ya -1 (başka olmaması durumu) olacak ya da bir index (5+1=6)

            if (ikinciIndex==(-1)) {
                    System.out.println("cumle metni sadece 1 kere iceriyor");
            }else {
                    System.out.println("cumle metni birden fazla iceriyor");}









    }
}}
