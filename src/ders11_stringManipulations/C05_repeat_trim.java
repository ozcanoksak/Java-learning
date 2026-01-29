package ders11_stringManipulations;

public class C05_repeat_trim {
    static void main() {


        //repeat verilen stringi istenilen adet kadar tekrarlar


        String str="java güzeldir ";

        System.out.println(str.repeat(4));
        // java güzeldir  java güzeldir  java güzeldir  java güzeldir

        System.out.println(str.repeat(str.length()));
        // 19xjava güzeldir



        String str2= "  Hello Java  ";


        System.out.println(str2.length()); //14

        //trim strinteki boşlukları siler
        str2=str2.trim();

        System.out.println(str2.length()); //10
        System.out.println(str2); //java güzeldir






    }
}
