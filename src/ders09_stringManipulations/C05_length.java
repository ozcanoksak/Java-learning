package ders09_stringManipulations;

public class C05_length {
    static void main() {

        String str = "fenerbahcesencokyasa";

        System.out.println(str.length()); //20

       //  son karakteri yazdırmak için aşağıdaki iki method kullanılabilir (n-1)

        System.out.println(str.charAt(19)); // (a)
        System.out.println(str.charAt(str.length()-1)); // (a)

        // sondan 3. karakteri yazdırmak için

        System.out.println(str.charAt(str.length()-3)); // (a)











    }
}
