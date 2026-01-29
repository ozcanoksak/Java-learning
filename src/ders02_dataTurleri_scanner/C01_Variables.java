package ders02_dataTurleri_scanner;

public class C01_Variables {
    public static void main(String[] args) {
        int okulNo= 885;
        System.out.println(okulNo); //885

        System.out.println("okulNO"); //okulNO

        System.out.println("okulNo = " +okulNo); //okulNo = 885

        okulNo=976;
        System.out.println("Yeni okulNo = " +okulNo);

        int not2= 60;

        not2= not2 + 10;

        System.out.println(not2); //70

        double HesapBakiyesi= 1000.58;

        HesapBakiyesi= HesapBakiyesi +120; //1120.58
        HesapBakiyesi= HesapBakiyesi -50; //1170.58

        System.out.println(HesapBakiyesi);

        System.out.println("HesapBakiyesi = " +HesapBakiyesi);



        int not3, not4, not5, ortNot;
        not3=50; not4=94; not5=48; ortNot=(not3+not4+not5)/3;

        System.out.println(ortNot);

        }
    }