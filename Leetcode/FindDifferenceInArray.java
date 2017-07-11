public class FindDifferenceInArray {
    public char findTheDifference(String s, String t) {
        char[] cpS = s.toCharArray();
        char[] cpT = t.toCharArray();
        Arrays.sort(cpS);
        Arrays.sort(cpT);
        
        int len = s.length();
        
        for (int i = 0; i < len; i++) {
            if (cpS[i] != cpT[i])
                return cpT[i];
        }
        
        return cpT[len];
    }
}