package matrisandtranspoze;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int[][] transpoze = new int[3][3];

        System.out.println("Matris: ");
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("\nTranspoze: ");
        for(int i = 0; i < arr.length+1; i++) {
            for (int j = 0; j < arr.length; j++) {
                 transpoze[i][j] = arr[j][i];
                System.out.print(transpoze[i][j] + "    ");
            }
            System.out.println();
        }

    }
}
