package ders03_datacastingWrapperClass;

public class C05_WrapperClass {
    public static void main(String[] args) {

        int sayi =10;
        String str= "Java çok güzel";

        /* primitive data türleri sadece değer barındırırlar, hazır method'lari yoktur

        javaya yapılan talepler sonucunda java,
         primitive data türleri ile bazı hazır method'ların kullanılabilmesi için
         wrapper class'lar oluşturmuştur

         wrapper class'lar primitive data türlerindeki değerleri alırlar
         ancak method'ları da vardır */


        char krk = 'b';

        Character krkWrapper= 'c';


        System.out.println(krkWrapper.isLetter('5')); // false

        System.out.println(Character.isDigit('7')); // true



        String str1 = "123";
        String str2 = "12";


        System.out.println(str1 + str2); //12312

        //str1 ve str2'nin değerlerini matematiksel olarak toplayın

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2));  // 135

        /* Integer.parseInteger(str) içine yazılan str rakamlardaan oluşuyorsa str'i int'a çevirir
        ancak bir karakter bile rakam değilse hata verir */

        System.out.println(Integer.MAX_VALUE); // 2.147.483.647 (int'in max değeri)
        System.out.println(Integer.MIN_VALUE); // -2.147.483.648 (int'in min değeri)

        System.out.println(Short.MAX_VALUE); // 32767 (short'un max değeri)
        System.out.println(Short.MIN_VALUE); // -32768 (short'un min değeri




    }
}
