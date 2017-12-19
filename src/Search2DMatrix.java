public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0)
            return false;
        int row = matrix.length;
        int col = matrix[0].length;
        int begin = 0;
        int end = col * row - 1;
        while (begin <= end){
            int mid = (begin + end)/2;
            int mid_val = matrix[mid / col][mid % col];
            if (mid_val == target)
                return true;
            else if (mid_val < target)
                begin = mid + 1;
            else
                end = mid - 1;
        }
            return false;
    }
}
