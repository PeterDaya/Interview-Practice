public class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        
        for (int i = 0; i < t.length(); i++) {
            int val = t.charAt(i) - 'a';
            count[val]++;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i) - 'a';
            count[val]--;
        }
        
        for (int i = 0; i < 26; i++)
            if (count[i] == 1)
                return (char) ('a' + i);
        
        return 0;
    }
}