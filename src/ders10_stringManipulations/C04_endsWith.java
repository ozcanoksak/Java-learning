package ders10_stringManipulations;

public class C04_endsWith {
    static void main() {

        //verilen stringin neyle bittiğini kontrol etmek için kullanılır

        String str = "Java heryerde guzel";


        System.out.println(str.endsWith("guzel")); // true

        System.out.println(str.endsWith(""));// true

        System.out.println(str.endsWith("Java heryerde guzel")); // true

        System.out.println(str.endsWith("Java")); //false



    }
}
