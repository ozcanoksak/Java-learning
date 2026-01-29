package ders10_stringManipulations;

public class C09_Soru {
    static void main() {

        String cumle="Java cok guzeldir cok.";
        String metin= "cok";

        int ilkIndex= cumle.indexOf(metin);
        int sonIndex= cumle.lastIndexOf(metin);

        if (ilkIndex==(-1)) {
            System.out.println("cumle metni icermiyor");

        } else if(ilkIndex==sonIndex) {
            System.out.println("cumle metni sadece 1 kere iceriyor");

        }else {
            System.out.println("cumle metni birden fazla iceriyor");
        }






    }
}
