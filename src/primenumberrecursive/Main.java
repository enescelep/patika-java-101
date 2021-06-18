package primenumberrecursive;

import java.util.Scanner;

public class Main {

    public static void primeNumber(int number) {
        //Sıfıra doğru giderken
        if(number > 0) {
            System.out.print(number + " ");
            primeNumber(number-5);
        }
        //Sıfırdan sonra tekrardan artarken
        System.out.println(number + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
    }
}
