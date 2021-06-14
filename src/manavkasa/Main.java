package manavkasa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        double armut, elma, domates, muz, patlican;
        double armutKg = 2.14, elmaKg = 3.67, domatesKg = 1.11, muzKg = 0.95, patlicanKg = 5;

        System.out.print("Armut Kaç Kilo ? :");
        armut = s.nextDouble() * armutKg;

        System.out.print("Elma Kaç Kilo ? :");
        elma = s.nextDouble() * elmaKg;

        System.out.print("Domates Kaç Kilo ? :");
        domates = s.nextDouble() * domatesKg;

        System.out.print("Muz Kaç Kilo ? :");
        muz = s.nextDouble() * muzKg;

        System.out.print("Patlıcan Kaç Kilo ? :");
        patlican = s.nextDouble() * patlicanKg;

        double toplam = (armut + elma  + domates + muz + patlican);
        System.out.print("Toplam tutar : " + toplam);

    }
}
