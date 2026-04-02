package algoritmaOdev;

import java.util.ArrayList;

public class soru3 {


        public static void main(String[] args) {

                ArrayList<String> sinifA = new ArrayList<>();
                sinifA.add("Özcan");
                sinifA.add("Özge");
                sinifA.add("Mehmet");
                sinifA.add("Can");
                sinifA.add("Berfin");
                sinifA.add("Deniz");

                ArrayList<String> sinifB = new ArrayList<>();
                sinifB.add("Mehmet");
                sinifB.add("Can");
                sinifB.add("Ayfer");
                sinifB.add("Jiyan");
                sinifB.add("Selin");
                sinifB.add("Yusuf");

                // A'daki herkesi al, sonra B'de olup A'da olmayanları ekle (birleşim)

            ArrayList<String> birlesim = new ArrayList<>(sinifA);

                for (int i = 0; i < sinifB.size(); i++) {
                    if (!birlesim.contains(sinifB.get(i))) {
                        birlesim.add(sinifB.get(i));
                    }
                }

                // A ile B'dekilerin kesişimi
            ArrayList<String> kesisim = new ArrayList<>();

                for (int i = 0; i < sinifA.size(); i++) {
                    if (sinifB.contains(sinifA.get(i))) {
                        kesisim.add(sinifA.get(i));
                    }
                }

                // A'da olup B'de olmayanlar
                ArrayList<String> fark = new ArrayList<>();

                for (int i = 0; i < sinifA.size(); i++) {
                    if (!sinifB.contains(sinifA.get(i))) {
                        fark.add(sinifA.get(i));
                    }
                }

                System.out.println("Sınıf A: " + sinifA);
                System.out.println("Sınıf B: " + sinifB);
                System.out.println("Birleşim: " + birlesim);
                System.out.println("Kesişim: " + kesisim);
                System.out.println("Fark (Sadece A'da olanlar): " + fark);

                /* Çıktı:

                   Sınıf A: [Özcan, Özge, Mehmet, Can, Berfin, Deniz]
                   Sınıf B: [Mehmet, Can, Ayfer, Jiyan, Selin, Yusuf]
                   Birleşim: [Özcan, Özge, Mehmet, Can, Berfin, Deniz, Ayfer, Jiyan, Selin, Yusuf]
                   Kesişim: [Mehmet, Can]
                   Fark (Sadece A'da olanlar): [Özcan, Özge, Berfin, Deniz] */
            }
        }

