class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (map.containsKey(c))
                map.put(c, map.get(c)+1);
            else
                map.put(c, 1);
        }
        
        ArrayList<Map.Entry<Character, Integer>> mylist = new ArrayList<>(map.entrySet());
        
        mylist.sort(new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> x, Map.Entry<Character, Integer> y) {
                return y.getValue().compareTo(x.getValue());
            }
        });
        
        StringBuffer sb = new StringBuffer();
        
        for (Map.Entry<Character, Integer> temp: mylist) {
            for (int i = 0; i < temp.getValue(); i++)
                sb.append(temp.getKey());
        }
        
        return sb.toString();
    }
}