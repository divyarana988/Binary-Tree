public static Node transBackFromLeftClonedTree(Node node){
    // write your code here
    if(node == null){
        return null;
    }
    
    Node nleft = transBackFromLeftClonedTree(node.left.left);
    Node nright = transBackFromLeftClonedTree(node.right);
    
    node.left.left = null;
    node.left = nleft;
    
    return node;
  }