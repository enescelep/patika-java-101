package daire;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Yarıçapı giriniz: ");
        double yaricap = s.nextDouble();

        System.out.print("Daire diliminin merkez ölçüsünü giriniz: ");
        int a = s.nextInt();

        double alan = (pi * (yaricap*yaricap) * a) / 360;
        System.out.println("Alan: " + alan);
    }
}
