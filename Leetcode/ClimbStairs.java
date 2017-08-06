public class Solution {
    public static int fib(int n) {
        if (n <= 1)
            return n;
        
        int fib = 1;
        int prev = 1;
        
        for (int i = 2; i < n; i++) {
            int temp = fib;
            fib += prev;
            prev = temp;
        }
        return fib;
    }
    
    public int climbStairs(int n) {
        return fib(n+1);
    }
}