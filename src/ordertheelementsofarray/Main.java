package ordertheelementsofarray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] array = new int[n];
        for(int i = 0; i<array.length; i++){
            array[i] = scan.nextInt();
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
