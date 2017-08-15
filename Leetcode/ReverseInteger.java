public class Solution {
    public int reverse(int x) {
        String rev = new StringBuilder(Integer.toString(x)).reverse().toString();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < rev.length(); i++) {
            if (rev.charAt(i) != '-')
                sb.append(rev.charAt(i));
        }
        long num = Long.parseLong(sb.toString());
        
        if (rev.charAt(rev.length()-1) == '-')
            num *= -1;
        
        if (num < Integer.MIN_VALUE || num > Integer.MAX_VALUE)
            return 0;
        
        return (int) num;
    }
}