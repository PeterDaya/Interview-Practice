/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null)
            return null;
        
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            if (temp != null) {
                sb.append(Integer.toString(temp.val) + ",");
                q.add(temp.left);
                q.add(temp.right);
            }
            else
                sb.append("null,");
        }
        
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data == null || data.length() == 0)
            return null;
        
        String[] arr = data.split(",");
        TreeNode root = new TreeNode(Integer.parseInt(arr[0]));
        
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int i = 1;
        
        while (!q.isEmpty()) {
            TreeNode temp = q.poll();
            
            if (temp == null)
                continue;
            
            if (!arr[i].equals("null")) {
                temp.left = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(temp.left);
            }
            else {
                temp.left = null;
                q.offer(null);
            }
            i++;
            
            if (!arr[i].equals("null")) {
                temp.right = new TreeNode(Integer.parseInt(arr[i]));
                q.offer(temp.right);
            }
            else {
                temp.right = null;
                q.offer(null);
            }
            i++;
            
        }
        
        return root;
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.deserialize(codec.serialize(root));