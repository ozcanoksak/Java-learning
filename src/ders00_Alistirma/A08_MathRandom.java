package ders00_Alistirma;

public class A08_MathRandom {
    static void main() {

        // 0 <= Math.random < 1

        double num = Math.random();
        System.out.println(num); // o ile 1 arası sayılar verir 1 dahil değildir


        // 0 ile 10 sayısı arasında bir değer döndürmek istersek Math.randomu 10 ile çarpmamız gerekir
        double num2 =  Math.random()*10;
        System.out.println(num2); // o ile 10 arası sayılar verir 10 dahil değildir

        // tam sayıya çevirmek istersek data casting kullanırız
        int num3 = (int) (Math.random()*10);
        System.out.println(num3);


        // Math.random() * (büyük - küçük) + küçük 10 ile 100
        // yöntemi kullanılır

        // 5 ile 15 arasında tam sayılar
        int num4 = (int) (Math.random()*10+5);
        System.out.println(num4);

        // bir zar atılıyor değerini math random ile gösterin
        //(büyük - küçük + 1)
        int zar= (int) (Math.random()*6+1);
        System.out.println("zar: " + zar);




        // -4 ile 11 arasında
        int  num5 = (int) (Math.random()*15)-4;
        System.out.println(num5);

    }
}
