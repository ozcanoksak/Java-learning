package ders13_nestedForLoop_methodOlusturma;

public class C04_NestedForLoop {
    static void main() {

     /*
     Asagidaki sekli yazdiran bir kod hazirlayin
     * * * * * *
     * * * * * *
     * * * * * *
     * * * * * *
       */
            for (int i = 1; i <=4 ; i++) {//dış yukarıdan aşağıya dış olur

            for (int j = 1; j <=6; j++) {//İç soldan sağa iç olur

                System.out.print("* ");
            }//iç
                System.out.println(""); // iç loop bitince alt satira geç
            }//dış








    }
}
