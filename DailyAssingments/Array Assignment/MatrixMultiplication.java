import java.util.Arrays;
import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] array1 = {{1,2},{3,4}};
        int[][] array2 = {{5,6,7},{8,9,10}};
        int[][] matrixMultiplication = new int[array1.length][array2[0].length];
        for(int i =0;i<array1.length;i++){
            for(int j=0;j<array2[0].length;j++){

                for(int k = 0;k< array2.length;k++){
                    matrixMultiplication[i][j] += array1[i][k]*array2[k][j];
                }
            }
        }
        System.out.print(Arrays.deepToString(matrixMultiplication));

    }
}
