package ders10_stringManipulations;

public class C03_starsWith {
    static void main() {

        // starsWith stringin neyle başladığını görmek için kullanılır
        // büyük küçük harfe dikkat eder


            String str = "manti acarken java ogrenilmez";

            System.out.println(str.startsWith("Manti")); // false

            System.out.println(str.startsWith("m")); // true

            System.out.println(str.startsWith("manti acarken java ogrenilmez")); // true

            System.out.println(str.startsWith("")); // true

        // str.startsWith("x",y) y = sayı
        // yazılan indexin sırasında yazılan string ile başlayıp başlamadığını
        // kontrol etmek için kullanılır


            System.out.println(str.startsWith("acarken",6)); // true

            System.out.println(str.startsWith("manti", 0)); // true

            System.out.println(str.startsWith("m",0)); //true

            System.out.println(str.startsWith("java",10)); // false

    }
}
