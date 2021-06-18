package methodsbypattern;

import java.util.ArrayList;

public class Main {

    public static int subtraction(int number) {
        if (number > 0) {
            return subtraction(number - 5);
        }
        else {
            return subtraction(number + 5);
        }
    }

    public static void main(String[] args) {
        System.out.println(subtraction(20)); // daha sonra yapacağım
    }

}
