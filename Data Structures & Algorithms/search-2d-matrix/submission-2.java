class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int l = 0, m = matrix[0].length-1,mid=0;
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][l] <= target && matrix[i][m] >= target ) {
                while (l <= m) {
                    mid = (l+m)/2;
                    if(target == matrix[i][mid])
                    {
                        return true;
                    }
                    else if(target < matrix[i][mid]){
                        m = mid-1;
                    }
                    else{
                        l = mid +1;
                    }
                }
                break;
            }
        }
        return false;
    }
}
