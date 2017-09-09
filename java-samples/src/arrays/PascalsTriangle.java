package arrays;

import java.util.Arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        if (args.length == 0){
            System.err.println("No triangle depth supplied");
            System.exit(0);
        }
        
        int depth = Integer.parseInt(args[0]);
        int[][] pascalsTriangle = new int[depth][];
        pascalsTriangle[0] = new int[]{1};
        int rowCount = pascalsTriangle.length;
        for(int row = 1; row < rowCount; row++){
            //Create a new row to hold the next line of pascal's numbers
            int prevRowLength = pascalsTriangle[row - 1].length;
            int newRowLength = prevRowLength + 1;
            int[] newRow = new int[newRowLength];
            
            //The start and end elements are always 1
            newRow[0] = 1;
            newRow[newRowLength - 1] = 1;
            int newCol = 1;
            
            //Populate the middle elements using pascal's recurrence relation
            for(int col = 1; col < newRowLength - 1; col++){
                int[] prevRow = pascalsTriangle[row - 1];
                for (int preCol = 0; preCol < prevRowLength - 1; preCol++){
                    int newNumber = prevRow[preCol] + prevRow[preCol + 1];
                    if (newCol < newRow.length - 1)
                        newRow[newCol++] = newNumber;
                }
            }
            
            //Assign the new row of pascal's numbers to the triangle
            pascalsTriangle[row] = newRow;
        }
        
        //Print out pascal's triangle
        for(int[] row : pascalsTriangle)
            System.out.println(Arrays.toString(row));

    }

}
