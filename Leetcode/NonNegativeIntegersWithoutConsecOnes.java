class Solution {
    public int findIntegers(int num) {
        if (num < 2)
            return num+1;
        
        StringBuilder sb = new StringBuilder(Integer.toBinaryString(num)).reverse();
        int len = sb.length();
        
        int[] arr = new int[len];
        arr[0] = 1;
        arr[1] = 2;
        
        for (int i = 2; i < len; i++)
            arr[i] = arr[i-1] + arr[i-2];
        
        int result = 0;
        
        for (int i = len-1; i >= 0; i--) {
            if (sb.charAt(i) == '1') {
                result += arr[i];
                
                if (i < len-1 && sb.charAt(i+1) == '1')
                    return result;
            }
        
        }
        result++;
        return result;
    }
}