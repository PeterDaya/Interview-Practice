public class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = s.length() - 1; i >= 0;) {
            while (i >= 0 && s.charAt(i) == ' ')
                i--;
            
            StringBuffer buf = new StringBuffer();
            
            while (i >= 0 && s.charAt(i) != ' ') {
                buf.append(s.charAt(i--));
            }
            
            buf.reverse();
            if (sb.length() > 0 && buf.length() > 0)
                sb.append(" ");
            
            sb.append(buf);
        }
        return sb.toString();
    }
}