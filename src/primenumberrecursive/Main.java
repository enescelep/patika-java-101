package primenumberrecursive;

public class Main {

    public static boolean isPrimeNumber(int number, int i) {

        if (number == 1) return false;
        if (number == 2) return true;
        if (number % i == 0) return false;
        return isPrimeNumber(number, i - 1);
    }

    public static void main(String[] args) {
        System.out.println(isPrimeNumber(10,2));
    }
}
