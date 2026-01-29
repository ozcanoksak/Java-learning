package ders11_stringManipulations;

public class C04_replaceAll {

    public static void main(String[] args) {
     // Kullanicinin girdigi metinde
     // harf disinda kalan tum karakterleri temizleyen bir kod yazin
     // NOT: space silinmemeli

        /* Regex (Regular Expressions)
       \\s: space
       \\S: space olmayan hersey
       \\s+: yanyana birden fazla space
       \\d: digits
       \\D: digit olmayan hersey
       \\w: harf veya rakam
       \\W: harf veya rakam olmayan herseyi sil */

        String input = "Ja5+va cok 1*guzel";

        input=input.replaceAll( "\\d", ""); // Ja+va cok guzel

        input=input.replace(" " ,"5"); // Ja+va5cok5*guzel

        input=input.replaceAll("\\W", ""); // Java5cok5guzel

        input=input.replace("5"," "); // Java cok guzel

        System.out.println(input);
    }
}
