package ders11_stringManipulations;

public class C01_nullPointer {
    static void main() {

        String str1= "";
        // str1'e değer atanmıştır

        System.out.println(str1); //hiçlik yazdırır
        System.out.println(str1.concat("Java")); //Java

        String str2;

        //str2 oluşturuldu ama değer atanmadı

        // System.out.println(str2); // str2'ye deger atanmadigi icin yazdirilamaz, CTE hatası verir
        // System.out.println(str2.concat("Java")); // deger atanmadigi icin method'la kullanilamaz

        str2="Java candir";
        System.out.println(str2); //Java candir
        System.out.println(str2.concat( ".")); //Java candir.

        String str3=null; // str3'e deger atanmamistir
        //null  pointer ile javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz

        System.out.println(str3); // null isaretlendigini yazdirir

        //System.out.println(str3.concat("Java")); // NullPointerException hatası verir

        //System.out.println(str3.toUpperCase()); // NullPointerException hatası verir

        System.out.println(str3+ "Java"); // null Java (yazdırır)

        //sadece normal toplama işleminde null yazdırılabilir diğer methotlarla kullanılamaz





    }
}
