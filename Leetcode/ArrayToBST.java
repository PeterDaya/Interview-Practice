/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return toBST(nums, 0, nums.length-1);
    }
    
    public TreeNode toBST(int[] nums, int begin, int end) {
        if (begin > end)
            return null;
        
        int mid = (end+begin)/2;
        TreeNode root = new TreeNode(nums[mid]);
        
        root.left = toBST(nums, begin, mid-1);
        root.right = toBST(nums, mid+1, end);
        
        return root;
    }
}