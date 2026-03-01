package ders17_scope;

public class C02_ClassLevelVariables {

    // class level variable'lar method'larin disinda olusturulur
    // genel kullanim en ustte olusuturulmalaridir.
    // genel kullanım varsa static kullanılır
    // bireysel kullanım varsa static kullanılmaz

    //herkes için değişmeyen şeyler olduğu için ststic kullanıldı
    static String hastaneismi="Yildiz hastanesi";
    static int hastaSayisi= 23453;
    static String basHekimIsmi; //oluşturduk ama atama yapmadık


    // başka başka personeller olabileceğinden static kullanmadık
    String persIsmi="Isim girilmedi";
    String persTelefonu="Telefon girilmedi";
    int persYasi; //oluşturduk ama atama yapmadık


    public static void main(String[] args) {
        System.out.println(hastaneismi); // Yildiz hastanesi
        System.out.println(basHekimIsmi); // null (string olduğu için null yazık)

        //System.out.println(persIsmi); // static olmadigi icin static main method'dan kullanilamaz yani staticler
        // sadece classın altındaki staticleri muhattap alır


        /*
         Class level variabler'a deger atamasi yapilmamis olursa
         Java bu variable'lara data turune gore
         default olarak tanimlanan degerleri atar
         default degerler,


         sayisal variable'lar : 0

         boolean : false

         char : ''

         Objeler (String dahil) : null

         */
    }


    public static void method1(){
        System.out.println(hastaSayisi);
        hastaSayisi++;
        // System.out.println(persIsmi); static olmadığı static methodta da kullanamayız
    }


    public void method2(){

        //staticler static olmayan methodların altında kullanılabilir yani static istediği yerde olabilir
        System.out.println(hastaneismi); // Yildiz hastanesi
        hastaSayisi++;

        System.out.println(persIsmi); // Isim girilmedi

        System.out.println(persYasi); // 0 (değer atanmadığı için default değeri olan 0 atandı)
    }
}
