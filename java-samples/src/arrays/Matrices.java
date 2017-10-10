package arrays;

import java.util.Arrays;

public class Matrices {
    
    static void doubleUp(int[][] matrix){
        int order = matrix.length;
        column:
            for(int i = 0; i < order; i++){
                for(int j = 0; j < order; j++){
                    matrix[i][j] = matrix[j][i] = matrix[i][j] * 2;
                    if( i == j)
                        continue column;
                }
            }
    }
    
    static void printMatrix(int[][] matrix){
        for(int[] row : matrix)
            System.out.println(Arrays.toString(row));
    }

    public static void main(String[] args) {
       int[][] matrix = { {1, 1, 1} , {1, 1, 1} , {1, 1, 1}};
       System.out.println("Original matrix:");
       Matrices.printMatrix(matrix);
       System.out.println("Doubled up matrix:");
       Matrices.doubleUp(matrix);
       Matrices.printMatrix(matrix);

    }

}
