class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
            int rows = matrix.length;
            int colms = matrix[0].length;

            int l = 0, r = rows* colms -1;

            while(l <= r){
                int mid = l + (r-l)/2;

                int row = mid /colms;
                int colm = mid % colms;

                if(matrix[row][colm] == target){
                    return true;
                }else if(matrix[row][colm] < target){
                    l = mid +1;
                } else {
                    r = mid -1;
                }
            }
            return false;
    }
}
