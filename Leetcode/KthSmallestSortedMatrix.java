class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int len = matrix.length;
        int left = matrix[0][0];
        int right = matrix[len-1][len-1];
        
        while (left < right) {
            int mid = left + ((right-left) >> 1);
            int temp = 0;
            
            for (int i = 0; i < len; i++)
                temp += search(matrix[i], mid, len);
            
            if (temp < k)
                left = mid+1;
            else
                right = mid;
        }
        
        return left;
    }
    
    public int search(int[] arr, int x, int right) {
        int left = 0;
        
        while (left < right) {
            int mid = (left+right)/2;
            
            if (arr[mid] <= x)
                left = mid+1;
            else
                right = mid;
        }
        return left;
    }
}