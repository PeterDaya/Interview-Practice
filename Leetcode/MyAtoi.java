public class Solution {
    public int myAtoi(String str) {
        if (str == null || str.equals(""))
            return 0;
        
        str = str.trim();
        char op = '+';
        int i = 0;
        
        if (str.charAt(0) == '+')
            i++;
        if (str.charAt(0) == '-') {
            i++;
            op = '-';
        }
        
        double result = 0;
        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = (result*10) + (str.charAt(i) - '0');
            i++;
        }
        
        if (op == '-')
            result *= -1;
        
        if (result >= Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        
        if (result <= Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        
        return (int) result;
    }
}