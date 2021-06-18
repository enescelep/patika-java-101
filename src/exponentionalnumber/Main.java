package exponentionalnumber;

public class Main {

    public static int exponentionalNumber(int base, int pow) {
        if (pow == 0) return 1;
        if (pow == 1) return base;
        return base * exponentionalNumber(base, pow-1);
    }

    public static void main(String[] args) {
        System.out.println(exponentionalNumber(10,2));
    }
}
