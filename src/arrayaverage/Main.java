package arrayaverage;

public class Main {

    static double harmonic(int n)
    {
        double i, s = 0.0;
        for (i = 1; i <= n; i++)
            s = s + 1/i;
        return s;
    }

    public static void main(String[] args) { // Harmonik ortalama: eleman sayısı / elemanların harmonic serisi
        int[] numbers = {3, 8, 19, 500, 105, 5, 15};
        int harmonicSum = 0;
        int numbersLength = numbers.length;
        for(int i = 0; i < numbersLength; i++) {
            harmonicSum += harmonic(numbers[i]);
        }
        System.out.println(harmonicSum / numbersLength);
    }
}
