public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "").toLowerCase();
        StringBuilder sb = new StringBuilder(s);
        String reverse = sb.reverse().toString();
        
        return reverse.equals(s);
    }
}