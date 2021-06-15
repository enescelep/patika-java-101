package dortvebesinkuvvetleri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, squareOf4 = 1, sqaureOf5 = 1;
        System.out.print("Please enter a number: ");
        number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                for(int k = 1; k <= number; k++) {
                    if (j % 4 == 0) {
                        System.out.println(j*j);
                    }
                    if (k % 5 == 0) {
                        System.out.println(k*k);
                    }
                }
            }
        }
    }
}
