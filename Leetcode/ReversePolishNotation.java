public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> mystack = new Stack<Integer>();
        
        for (int i = 0; i < tokens.length; i++) {
            if ((tokens[i].compareTo("+") != 0) && (tokens[i].compareTo("-") != 0) 
            && (tokens[i].compareTo("*") != 0) && (tokens[i].compareTo("/") != 0))
                mystack.push(Integer.parseInt(tokens[i]));
            
            else {
                int num2 = mystack.pop();
                int num1 = mystack.pop();
                int result = 0;
                
                if (tokens[i].compareTo("+") == 0)
                    result = num1+num2;
                
                else if (tokens[i].compareTo("-") == 0)
                    result = num1-num2;
                
                else if (tokens[i].compareTo("*") == 0)
                    result = num1*num2;
                
                else if (tokens[i].compareTo("/") == 0)
                    result = num1/num2;
                
                mystack.push(result);
            }
        }
        
        return mystack.pop();
    }
}