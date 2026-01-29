package ders04_matematikselİslemer;

public class C07_Pre_Post_İncrement {
    public static void main(String[] args) {

        int a = 10;


        int b = a++;//(önce eşitle sonra arttır) a=11 b=10


        int c = ++b; // (önce arttır sonra eşitle) a=11 b=11 c=11

        System.out.println("a: "+ a + " b: "+ b + " c: "+ c);


        a=20;

        b=++a; // a=21 b=21

        c=a++; // a=22 b=21 c=21

        System.out.println("a: "+ a + " b: "+ b + " c: "+ c);


        a=30;

        System.out.println(a++); // önce eşitle sonra arttır a=30 sonra 31
        System.out.println(--a); // önce azalt sonra eşitle a=30
        System.out.println(a--); // önce eşitle sonra arttır a=30 sonra 29
        System.out.println(a); // a=29




    }
}
