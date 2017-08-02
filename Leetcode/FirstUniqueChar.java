public class Solution {
    public int firstUniqChar(String s) {
        char[] string = s.toCharArray();
        int[] count = new int[26];
        
        for (int i = 0; i < string.length; i++) {
            int val = string[i] - 'a';
            count[val]++;
            
        }
        
        for (int i = 0; i < string.length; i++) {
            int val = string[i] - 'a';
            
            if (count[val] == 1)
                return i;
        }
        return -1;
    }
}