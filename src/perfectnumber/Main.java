package perfectnumber;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please type a number: ");
        int number = scanner.nextInt();

        if(isPerfectNumber(number)) System.out.println(number + " is a perfect number");
        else System.out.println(number + " isn't a perfect number");
    }

    public static boolean isPerfectNumber(int number) {
        if (number <= 1) return false;
        int sum = 0;
        for (int i = 1; i<number; i++) {
            if(number % i == 0) sum+=i;
        }
        return number == sum ? true : false;
    }
}
