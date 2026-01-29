package ders05_concatenation_operatorler;

public class C02_LogicalOperators {

    static void main() {

        // != eşit değildir demektir doğruysa true değilse false

        // == iki tarafın birbirine eşit olup olmadığına bakar eşitse true değilse false

         // && mantık konusundaki "ve" gibidir bir tane bile false olursa cevap false olur (mükemmeliyetçi)

        // || mantık konusundaki "veya" gibidir bir tane bile true varsa cevap true olur

        int a =20;
        int b =30;


        System.out.println(a != b); //true

        System.out.println(a == b); //false

        System.out.println(a>b && a>0); //false


        boolean sonuc  = 3*a <= 2*b && a>10 && b>20;

        System.out.println(a<=19 || b==30); //true










    }
}
