package arrays;

import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        if (args.length == 0){
            System.err.println("No triangle depth supplied");
            System.exit(0);
        }
        
        int triangleDepth = Integer.parseInt(args[0]);
        int[][] pascalsTriangle = new int[triangleDepth][];
        pascalsTriangle[0] = new int[]{1};
        for(int row = 1; row < triangleDepth; row++){
            //Create a array to hold the next row of Pascal's triangle
            int prevRowLength = pascalsTriangle[row - 1].length;
            int[] newRow = new int[prevRowLength + 1];
                       
            //The start/end numbers are 1 in all rows
            int newRowLength = newRow.length;
            newRow[0] = 1;
            newRow[newRowLength - 1] = 1;
            int newCol = 1;
            
            //Compute and populate the missing Pascal numbers for the current row
            for(int col = 1; col < newRowLength - 1; col++){
                int[] prevRow = pascalsTriangle[row - 1];
                for (int preCol = 0; preCol < prevRowLength - 1; preCol++){
                    int newNumber = prevRow[preCol] + prevRow[preCol + 1];
                    if (newCol < newRow.length - 1)
                        newRow[newCol++] = newNumber;
                }
            }
            
            //Assign the new row to the triangle
            pascalsTriangle[row] = newRow;
        }
        
        //Print out Pascal's triangle
        for(int[] row : pascalsTriangle)
            System.out.println(Arrays.toString(row));
    }

}
