package ders13_nestedForLoop_methodOlusturma;

public class C02_StringTersineCevirme {
    static void main() {


        String input = "Java her gecen gun guzellesiyor"; //
        String tersInput = "";

        for (int i = input.length()-1; i >=0 ; i--) {

            tersInput += input.substring(i , i+1);
        }

        System.out.println("Ters hali : " + tersInput);
        // Ters hali : royisellezug nug neceg reh avaJ
    }
}
