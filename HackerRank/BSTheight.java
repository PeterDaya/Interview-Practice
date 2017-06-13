	/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	static int height(Node root) {
      	// Write your code here.
        int a = 0;
        int b = 0;
        if (root == null)
            return -1;
        
        else {
            a = height(root.left) + 1;
            b = height(root.right) + 1;
        }
        if (a > b)
            return a;
        else
            return b;
    }
