package ders13_nestedForLoop_methodOlusturma;

public class C03_NestedForLoop {
    static void main() {

        //1-4 arasındaki sayılar için çarpım tablosu oluşturalım

       // dış döngü satırları kontrol eder
        for (int i = 1; i <= 5; i++) {

            // iç döngü her satırda olan değerleri kontrol eder
            for (int j = 1; j <= 5 ; j++) {
                System.out.print(i + " ");

            }//iç döngü

            // iç döngü bittiginde javayi alt satira indirmeliyiz
            System.out.println("");


        }//dış döngü
}}
