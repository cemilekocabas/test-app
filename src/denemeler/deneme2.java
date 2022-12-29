package denemeler;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {
        double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;




            Scanner input = new Scanner(System.in);
            System.out.print("ücreti gir kardesim");
            tutar = input.nextDouble();

            kdvTutar = tutar * kdvOran;
            kdvliTutar = tutar + kdvTutar;

            System.out.println("KDV'siz Tutar: " + tutar);
            System.out.println("KDV oranı:" + kdvOran);
            System.out.println("KDV tutarı:" + kdvTutar);
            System.out.println("KDV 'l i tutar: " + kdvliTutar);

    }}