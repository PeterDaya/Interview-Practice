class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> mylist = new ArrayList<String>();
        generate(mylist, "", n, n);
        return mylist;
    }
    
    public void generate(List<String> mylist, String str, int left, int right) {
        if (left > right)
            return;
        
        if (left == 0 && right == 0) {
            mylist.add(str);
            return;
        }
        
        if (left > 0)
            generate(mylist, str+"(", left-1, right);
        
        if (right > 0)
            generate(mylist, str+")", left, right-1);
    }
}