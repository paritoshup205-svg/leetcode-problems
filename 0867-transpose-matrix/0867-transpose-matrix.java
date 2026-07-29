class Solution {
    public int[][] transpose(int[][] matrix) {
        int col = matrix[0].length;
        int row = matrix.length;
        int [][] b = new int[col][row];
        for(int i =0;i<b.length;i++){
            for(int j = 0;j<b[0].length;j++){
                b[i][j] = matrix[j][i];
                // int temp = matrix[i][j];
                // matrix[i][j] = matrix[j][i];
                // matrix[j][i] = temp;
            }
        }
        return b;
    }
}