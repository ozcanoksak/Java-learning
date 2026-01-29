package ders02_dataTurleri_scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {


    // kullaniciden kullanıcı adını alip buyuk harflerle yazdirin

        // (1.adim) scan objesi oluşturma
    Scanner scan = new Scanner(System.in);

       //(2.adim) kullanıcıya ne istediğimizi yazdirma
        System.out.println("Lutfen Kullanici Adinizi Girin");

        /* (3.adım) kullanıcıdan istediğimiz bilginin turune uygun bir variable oluşturup scanner methotlarından uygun
         olanını kullanarak alinan değeri variableye atayalım
         */
         String kullaniciAdi= scan.next();


        System.out.println("Yazdığınız kullanıcı adının büyük hali : " + kullaniciAdi.toUpperCase());

    }
    }
