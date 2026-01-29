package ders06_IfElseStatements;

public class C06_IfElseStatements {
    static void main() {

        /* if else statement'da { } kullanmazsak hem if hem else body'si için sadece 1 satır kabul eder

        sonraki satırlar if-else ile ilişkilendirilmez
        her durumda çalışır */

        int not=56;

        if (not>=50)
            System.out.println("Sınıfı Geçtin");

        else
            System.out.println("Bu Dersten Kaldın"); // köşeli paarantez kullanmazsak if,else if, else sadece ilk satırı kapsar

            System.out.println("Yaz Okuluna Bekleriz"); /* else kapsamadığı için bu satırı herhangi bir kod
            gibi görüp elseden bağımsız okur*/



    }
}
