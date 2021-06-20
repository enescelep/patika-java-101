package nearestnumber;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*int[] list = {56, 34, 1, 8, 101, -2};
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;
        System.out.print("Please enter a number: ");
        int value = scanner.nextInt();
        for (int i = 0; i<list.length; i++) {
            if (list[i]-value>max) {
                min = list[i];
            }
            if (list[i]-value<min) {
               max =  list[i];
            }
        }
        System.out.println(findMaxValue(list,value));
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + max);
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + min);*/
        list();
    }
    /*public static int findMaxValue(int[] array, int value) {
        int max = 0;
        for(int i = 0; i<array.length; i++) {
            if (array[i]-value<min) {
                max =  array[i];
            }
        }
        return max;
    }*/

    public static void list() {
        int[] list = {56, 34, 1, 8, 101, -2};
        Arrays.sort(list);
        /*
    girilen sayıdan küçük olanı sürekli olarak bir "min" adında bir değişkene ata.
    Bu sayede minimum değeri elde edebilirsin.
    Maksimum değer için de girilen değerden büyük bir değeri "max" adında bir değişkene ata
    sonrasında break komutu ile sonlandır.
         */
        int value = 5;
        int min = 0;
        int max = 0; // -2 1 8 34 56 101
        int[] buyukSayilar = new int[3];
        int[] kucukSayilar = new int[3];
        buyukSayilar[0] = list[5]; buyukSayilar[1] = list[4];buyukSayilar[2] = list[3];
        kucukSayilar[0] = list[2]; kucukSayilar[1] = list[1];kucukSayilar[2] = list[0];

        for(int i = 0; i< buyukSayilar.length; i++) {
            if(value < buyukSayilar[i]) {
                max = buyukSayilar[i];
            }
            if(value > buyukSayilar[i]) {
                min = buyukSayilar[i];
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
