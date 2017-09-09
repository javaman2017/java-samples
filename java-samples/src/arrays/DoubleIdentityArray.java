package arrays;

public class DoubleIdentityArray {
    static float[][] initIdentityMatrix(float[][] mat){
        int rowCount = mat.length;
        for(int row = 0; row < rowCount; row++){
            int colCount = mat[row].length;
            for(int col = 0; col < colCount; col++){
                if (row == col)
                    mat[row][col] = 1.0f;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        float[][] mat = new float[4][4];
        mat = DoubleIdentityArray.initIdentityMatrix(mat);
        int rowCount = mat.length;
        for(int row = 0; row < rowCount; row++){
            int colCount = mat[row].length;
            for(int col = 0; col < colCount; col++)
                System.out.print(mat[row][col] + " ");
            System.out.println();
        }
    }
}