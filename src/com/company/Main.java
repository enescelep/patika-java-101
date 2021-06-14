package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int mat, fizik, turkce, tarih, muzik;

        Scanner s = new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat = s.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = s.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = s.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = s.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = s.nextInt();

        int toplam = (mat + fizik + tarih + turkce + muzik);
        double ortalama = toplam / 6.0;

        String sonuc = ortalama>60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.print(sonuc);
    }
}
