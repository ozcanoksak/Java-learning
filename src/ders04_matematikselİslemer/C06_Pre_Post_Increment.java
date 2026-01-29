package ders04_matematikselİslemer;

public class C06_Pre_Post_Increment {
    public static void main(String[] args) {

        int a=10;

        // a variable'nin değerini yazdırıp sonra a'nın değerini bir arttırın

        System.out.println("a : " + a); //10
        a++;  // a artık 11



        int b=10;

        // b variable'nin değerini bir arttırıp, sonra yazdırın

        b++;
        System.out.println("b : " + b); //11



        int c=10;

        // c variable'nin değerini yazdırıp sonra c'nın değerini bir arttırın (a'nın kısa yolu)

        System.out.println("c : " + c++); //10


        int d=10;
        // d variable'nin değerini bir arttırıp, sonra yazdırın (b'nin kısa yolu)


        System.out.println("d : " + ++d); //11

        /*
        c++ veya ++D yi yazdırma veya atama işleminde kullanırsaniz
        c++' e post increment denir o satır için önce işlemi yapar sonra arttırmayı yapar
        ++d'ye ise pre increment denir, önce arttırma sonra yapıp sonra işlemi yapar

        işlemin olduğu satırın bir alt satırına geçildiğinde
        c'de d' de bie artmıştır

         */












    }
}
