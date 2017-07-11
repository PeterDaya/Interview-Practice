public class IsPalindrome {
    public boolean isPalindrome(int x) {
        String input = Integer.toString(x);
        Stack<Character> mystack = new Stack<Character>();
        
        for (int i = 0; i < input.length(); i++)
            mystack.push(input.charAt(i));
        
        String reverse = "";
        
        while (!mystack.isEmpty())
            reverse += mystack.pop();
            
        return reverse.equals(input);
    }
}