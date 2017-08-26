class Solution {
    public int[] countBits(int num) {
        int[] ret = new int[num+1];
        
        for (int i = 0; i <= num; i++) {
            ret[i] = count(i);
        }
        return ret;
    }
    
    public int count(int n) {
        int result = 0;
        
        while (n != 0) {
            if (n%2 == 1)
                result++;
            
            n /= 2;
        }
        return result;
    }
}