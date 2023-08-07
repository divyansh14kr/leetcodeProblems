class Solution {
    public void rotate(int[][] matrix) {
        rot(matrix);
    }
    static void swap(int row, int coloumn, int[][] matrix){
        int length= matrix.length-1;
        int temp1 = matrix[row][coloumn];
        int temp2 = matrix[length-row][coloumn];
        matrix[row][coloumn]= matrix[length-row][coloumn];
        matrix[length-row][coloumn]= temp1;

    }
      static void rot(int[][] matrix){
        for (int row = 0; row <matrix.length/2 ; row++) {
            for (int coloumn = 0; coloumn <matrix[row].length ; coloumn++) {
                swap( row,coloumn, matrix);
            }

        }
        
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j <i ; j++) {
                swap1(i,j, matrix);

            }

        }
      
    }
    static void swap1(int i, int j, int[][] matrix){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[j][i];
        matrix[j][i] = temp;
    }
}
