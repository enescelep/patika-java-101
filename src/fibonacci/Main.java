package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int number = scanner.nextInt();
        System.out.println(fibonacci(number));
    }
    public static int fibonacci(int number) {
        if (number <= 2) return 1;
        return fibonacci(number - 1) + fibonacci(number - 2);
    }

}
