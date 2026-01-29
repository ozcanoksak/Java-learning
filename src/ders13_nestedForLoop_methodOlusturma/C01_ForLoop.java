package ders13_nestedForLoop_methodOlusturma;

public class C01_ForLoop {
    static void main() {

        // Soru 9 (interview)- Kullanıcıdan bir String isteyin ve String'i tersten yazdırın.

        String str="Java ne kadar güzel";

        System.out.println(str.length()-1);//18

            for (int i = str.length()-1; i >=0 ; i--) {
                System.out.print(str.charAt(i)); //lezüg radak en avaJ
            }






    }
}
