class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, m = matrix[0].length-1;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][l] <= target && matrix[i][m] >= target ) {
                while (l <= m) {
                    if(target == matrix[i][l])
                    {
                        return true;
                    }
                    l++;
                }
                l=0;
            }
        }
        return false;
    }
}
