/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] findFrequentTreeSum(TreeNode root) {
        if (root == null)
            return new int[0];
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        sum(map, root);
        
        int max = Integer.MIN_VALUE;
        int counter = 0;
        
        for (int temp: map.keySet()) {
            if (map.get(temp) > max) {
                max = map.get(temp);
                counter = 1;
            }
            
            else if (map.get(temp) == max)
                counter++;
        }
        
        int[] ret = new int[counter];
        counter = 0;
        
        for (int temp: map.keySet())
            if (map.get(temp) == max)
                ret[counter++] = temp;
        
        return ret;
    }
    
    public int sum(HashMap<Integer, Integer> map, TreeNode root) {
        if (root == null)
            return 0;
        
        root.val += sum(map, root.left) + sum(map, root.right);
        
        if (map.containsKey(root.val))
            map.put(root.val, map.get(root.val)+1);
        
        else
            map.put(root.val, 1);
        
        return root.val;
    }
}