package vki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Kilonuzu kg cinsinden giriniz: ");
        double kilo = s.nextDouble();

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double boy = s.nextDouble();

        double vki = kilo / (boy * boy);
        System.out.println("Vücut Kitle Endeksi: " + vki); // Kilo (kg) / Boy(m) * Boy(m)

    }
}
