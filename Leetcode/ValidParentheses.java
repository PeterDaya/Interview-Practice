public class Solution {
    public boolean isValid(String s) {
        Stack<Character> mystack = new Stack<Character>();
        
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');
        
        char[] ch = s.toCharArray();
        
        for (int i = 0; i < ch.length; i++) {
            if (map.keySet().contains(ch[i]))
                mystack.push(ch[i]);
            
            else if (map.values().contains(ch[i])) {
                if (!mystack.isEmpty() && map.get(mystack.peek()) == ch[i])
                    mystack.pop();
                else
                    return false;
            }
        }
        return mystack.isEmpty();
    }
}