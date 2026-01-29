package ders14_methodOlusturma;

public class C05_SubstringOlustur {
    static void main() {

        /*
        Soru 1- Kullanıcıdan input olarak bir String alın,
        başlangıç ve bitiş indexlerine göre başlangıç index'ini dahil, bitiş index'ini hariç olacak şekilde
        aradaki harfleri yazdıran bir method oluşturun.
        - kullanıcı başlangıç değeri olarak, bitiş değerinden büyük bir sayı girerse, hata mesajı verin
        - kullanıcı str'da olan index'lerden daha büyük bir index girerse hata mesajı yazdırın.
         */

        String input = "Java ne kadar, güzel";
        int basIndexi = 5;
        int bitIndexi = 7;

        kendiSubstringMetodumuz(input, basIndexi, bitIndexi); //
        kendiSubstringMetodumuz( "Java",1, 3); // av
        kendiSubstringMetodumuz( "Deneme",6, 3); // Başlangıç indexi, bitiş indexinden büyük
        kendiSubstringMetodumuz("Java", 6, 8); // Bitiş indexi String'in sınırları dışında

    }//main


        public static void kendiSubstringMetodumuz(String input, int basIndexi, int bitIndexi) {

            if (basIndexi > bitIndexi) {
                System.out.println("Başlangıç indexi, bitis indexinden büyük olamaz");

            } else if (bitIndexi > input.length()) {
                System.out.println("Bitis indexi String'in sinirları dışında");

            } else {

                // başlangıç ve bitis indexlerine göre başlangıç index'i dahil,
                // bitis index'i hariç olacak şekilde
                // aradaki harfleri yazdıran bir method oluşturun.

                for (int i = basIndexi; i < bitIndexi; i++) {
                    System.out.print(input.charAt(i));
                }
                System.out.println("");
            }//else
        }

    }

