package denemeler;

import javax.swing.*;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        int mat, fizik, turkçe ;

        Scanner inp = new Scanner(System.in);  //scanner sınıfımızı tanımladık

        // kullanıcıdan değerleri alalım

        System.out.println("Matematik notunuz:");
        mat= inp.nextInt();

        System.out.println("fizik notunuz:");
        fizik= inp.nextInt();

        System.out.println("türkçe notunuz:");
        turkçe= inp.nextInt();

        int toplam = (mat + fizik + turkçe);
        double sonuc = toplam /3;
        System.out.println("not ortalamanız : "  +sonuc);
        System.out.println("Not Ortalamanız:" + sonuc);

        boolean mec= sonuc>=60;
        String str = mec ? "Sınıfı Geçtiniz." : "Sınıfta Kaldınız";
        System.out.println(str);




    }
}