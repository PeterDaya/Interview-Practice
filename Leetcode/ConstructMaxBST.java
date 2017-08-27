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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0)
            return null;
        
        return help(nums, 0, nums.length-1);
    }
    
    public TreeNode help(int[] nums, int begin, int end) {
        if (begin > end)
            return null;
        
        int indexMax = begin;
        for (int i = begin+1; i <= end; i++) {
            if (nums[i] > nums[indexMax])
                indexMax = i;
        }
        
        TreeNode root = new TreeNode(nums[indexMax]);
        root.left = help(nums, begin, indexMax-1);
        root.right = help(nums, indexMax+1, end);
        
        return root;
    }
}