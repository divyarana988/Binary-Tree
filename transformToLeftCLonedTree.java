public static Node createLeftCloneTree(Node node){
    // write your code here
    if(node == null){
        return null;
    }
    
    Node left = createLeftCloneTree(node.left);
    Node right = createLeftCloneTree(node.right);
    
    Node newnode = new Node(node.data, null, null);
    newnode.left = left;
    node.left = newnode;
    
    return node;
  }