package taksimetre;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int acilisUcreti = 10;
        double kmBasiUcret = 2.20;
        System.out.print("Taksi ile kaç kilometre yol alacağınızı giriniz: ");
        double yol = s.nextInt();
        yol = (yol * kmBasiUcret) + acilisUcreti;
        double ucret = yol > 20 ? yol : 20.0;
        System.out.print("Ücret: "+ucret);
    }
}
