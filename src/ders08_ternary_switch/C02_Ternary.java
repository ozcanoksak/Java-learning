package ders08_ternary_switch;

public class C02_Ternary {
    static void main() {

        String str1 ="Ali";
        String str2 ="ali";

        // verilen metinler birbirleriyle aynı ise "metinler aynı" farklı ise "metinler farklı" yazırın"

        if (str1.equals(str2)) {
            System.out.println("metinler aynı");

        } else {
            System.out.println("metinler farklı");}


            System.out.println(str1==str2 ? "metinler aynı": "metinler farklı"); //if else yapısı ile aynı sonucu verir

        // equals denkliğe bakar ve büyük küçük harfe kadar dikkat eder her şeyin aynı olması lazım



}}
