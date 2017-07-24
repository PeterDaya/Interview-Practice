   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
       Queue<Node> nodes = new ArrayDeque<Node>();
       nodes.add(root);
       
       while (!nodes.isEmpty()) {
           Node temp = nodes.remove();
           if (temp.left != null)
               nodes.add(temp.left);
           
           if (temp.right != null)
               nodes.add(temp.right);
           
           System.out.print(temp.data + " ");
       }
}