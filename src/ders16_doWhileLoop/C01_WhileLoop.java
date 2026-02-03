package ders16_doWhileLoop;

public class C01_WhileLoop {

    // 10, 11, 12 sayılarını toplayan bir while loop oluşturalım

    static void main() {

        //10, 11, 12 sayılarını toplayan bir while loop oluşturalım


        int sayi=10;
        int toplam=0;

       while (sayi<=12){
           toplam+=sayi;
           sayi++;
       }

       // while loop'da önce kontrol sonra işlem yapılır

        /* while loop'da 2 problem oluşabilir
         1- önce değeri kontrol edip sonra işlem yaptığımızdan
         body'de bir kere daha kontrol etmemiz gerekebilir

         2- yapılan işlem sayısından 1 fazla while bitiş şartı kontrol edilir

         3- while loop öncesinde değerleri kontrol edeceğimiz bir variable oluşturuyorsak
         ona yapacağımız atamayı dikkatli yapmamız gerekir
         */





    }
}
