public class Solution {
    public int strStr(String haystack, String needle) {
        int stackLen = haystack.length();
        int needleLen = needle.length();
        
        if (needleLen == 0)
            return 0;
        
        if (haystack == null || needle == null || stackLen == 0)
            return -1;
        
        int i = 0, j = 0;
        
        while (i < stackLen) {
            for (j = 0; j < needleLen && (i+j) < stackLen && haystack.charAt(i+j) == needle.charAt(j); j++);
            
            if (j == needleLen)
                return i;
            i++;
        }
        return -1;
    }
}