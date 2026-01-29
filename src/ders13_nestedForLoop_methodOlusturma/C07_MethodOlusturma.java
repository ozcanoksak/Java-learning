package ders13_nestedForLoop_methodOlusturma;

import java.util.Scanner;

public class C07_MethodOlusturma {
    static void main() {

        String str = "Java muhtesemdir";

        // metni buyuk harfe cevirin

        String buyukStr = str.toUpperCase();

        System.out.println(str); // Java muhtesemdir
        System.out.println(buyukStr); // JAVA MUHTESEMDIR

        // metnin buyuk harflerle cevrilmis hali S icerir mi ?

        System.out.println(buyukStr.contains("S")); // true



    }
}
