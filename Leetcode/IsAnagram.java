public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chS = s.toCharArray();
        char[] chT = t.toCharArray();
        
        Arrays.sort(chS);
        Arrays.sort(chT);
        
        if (chS.length != chT.length)
            return false;
        
        for (int i = 0; i < chS.length; i++) {
            if (chS[i] != chT[i])
                return false;
        }
        return true;
    }
}