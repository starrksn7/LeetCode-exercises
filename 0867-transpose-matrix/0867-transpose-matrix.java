class Solution {
    public int[][] transpose(int[][] matrix) {
        int column = matrix.length;
        int row = matrix[0].length;
        int[][] result = new int[row][column];
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                result[i][j] = matrix[j][i];
            }
        }
        return result;
        
    }
}