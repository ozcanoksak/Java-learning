package ders10_stringManipulations;

public class C08_LastİndexOf {
    static void main() {

        // lastIndexOf() aramaya cümlenin sonundan başlar
        // sonuncu terimin kaçıncı index olduğunu bulur

        String str = "Java hafiften beyin yakıyor";
        System.out.println(str.lastIndexOf("a")); //21

        System.out.println(str.lastIndexOf('e')); //15

        System.out.println(str.lastIndexOf("java")); //-1 (böyle bir kelime olmadığı için) (baş harfi büyük)

        System.out.println(str.lastIndexOf("Java")); //0

        System.out.println(str.lastIndexOf("e", 14)); //11




    }
}
