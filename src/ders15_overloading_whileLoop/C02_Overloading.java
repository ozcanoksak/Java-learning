package ders15_overloading_whileLoop;

public class C02_Overloading {
    static void main() {

        carpim(3, 5); //method call sırasında method parantezine  yazılanlara argument denir
        carpim(3, 4, 2);






    }

    // bir class'da aynı isim ve aynı signature'a sahip iki method olmaz

    //method overloading olan class'larda java hangi method'un çalışacağına şu şekide karar verir
    // 1- önce method ismine bakar
    // 2- argument isim ile parametre saysınıa bakar
    // 3- argument ve parametre uyumuna bakar uyuşuyorsa onu kullanır
    // 4- yukarıdakileri bulamazsa minimum casting hangisinde varsa onu seçer

    public static void carpim (int sayi1, int sayi2) { //çarpım int int
        System.out.println("iki integer sayısının çarpımı: " + sayi1 * sayi2);
    }
        public static void carpim (int sayi3, int sayi4,  int sayi5) { //çarpım int int int
            System.out.println("üç integer sayısının çarpımı: " + sayi3 * sayi4 * sayi5);
    }

    public static void carpim (double sayi1, int sayi2) { //çarpım double int
        System.out.println("double-integer  iki sayının çarpımı: " + sayi1 * sayi2);
    }

    public static void carpim (int sayi1, double sayi2) { //çarpım int double
        System.out.println("integer-double sayının çarpımı: " + sayi1 * sayi2);
    }

    public static void carpim (double sayi1, double sayi2) { //çarpım double double        System.out.println("iki double sayısnın çarpımı: " + sayi1 * sayi2);
    }

}
