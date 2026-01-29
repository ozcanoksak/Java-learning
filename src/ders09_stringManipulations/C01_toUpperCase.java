package ders09_stringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    static void main() {
        String str = "Java Mutluluktur";

        System.out.println(str.toUpperCase()); //JAVA MUTLULUKTUR

        System.out.println(str); //Java Mutluluktur


        str = str.toUpperCase();
        System.out.println(str); // JAVA MUTLULUKTUR


        str = "ince mehmet";

        str = str.toUpperCase();
        System.out.println(str); //INCE MEHMET

        str = str.toLowerCase();
        System.out.println(str); //ince mehmet

        System.out.println(str.toLowerCase(Locale.CHINA)); //ince mehmet
        System.out.println(str.toUpperCase(Locale.forLanguageTag("TR"))); //ince mehmet















    }
}
