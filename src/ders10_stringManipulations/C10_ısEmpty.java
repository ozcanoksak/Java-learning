package ders10_stringManipulations;

public class C10_ısEmpty {
    static void main() {

         // isEmpty
         // verilen stringin içinin boş olup olmadığına bakar
         // boşluk(space) varsa yine dolu sayar

         //isBlank
         // verilen stringin tamamıyla boş olup olmadığına bakar
         //boşluk (space) varsa bile boş sayar


    String str= "";

        System.out.println(str.isEmpty()); //true
        System.out.println(str.isBlank()); //true

      String str2= "  ";
        System.out.println(str2.isEmpty()); //false
        System.out.println(str.isBlank()); //true

        String str3="x";
        System.out.println(str3.isEmpty()); //false
        System.out.println(str3.isBlank()); //false




    }}
