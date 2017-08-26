class Solution {
    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end))
            return 0;
        
        HashSet<String> set = new HashSet<String>();
        HashSet<Character> valid = new HashSet<Character>();
        valid.add('A');
        valid.add('T');
        valid.add('C');
        valid.add('G');
        
        if (start.length() != 8 || end.length() != 8)
            return -1;
        
        for (int i = 0; i < bank.length; i++)
            set.add(bank[i]);
        
        int dist = 0;
        
        for (int i = 0; i < start.length(); i++) {
            char x = start.charAt(i);
            char y = end.charAt(i);
            
            if (!valid.contains(x))
                return -1;
            if (!valid.contains(y))
                return -1;
            
            if (x != y)
                dist++;
        }
        
        if (set.contains(end))
            return dist;
        else
            return -1;
    }
}