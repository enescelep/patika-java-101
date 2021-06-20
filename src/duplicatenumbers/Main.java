package duplicatenumbers;

import java.util.Arrays;

public class Main {

    static boolean isDuplicateNumberAlreadyExists(int[] array, int number) {
        for (int i : array) {
            if (i == number) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {15, 5, 5, 64, 67, 23, 76, 87, 9, 64, 67};
        int[] duplicateNumbers = new int[list.length];
        int startIndex = 0;
        for(int i = 0; i <list.length; i++) {
            for (int j = 0; j <list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (!isDuplicateNumberAlreadyExists(list, list[i])){
                        duplicateNumbers[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicateNumbers) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}
