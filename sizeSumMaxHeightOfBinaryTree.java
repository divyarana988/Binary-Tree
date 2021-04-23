public static int size(Node node) {
    // write your code here
    if(node == null){
         return 0;
    }
    int lsize = size(node.left);
    int rsize = size(node.right);
    
    return lsize+ rsize+ 1;
  }

  public static int sum(Node node) {
    // write your code here
     if(node == null){
         return 0;
    }
    int lsum = sum(node.left);
    int rsum = sum(node.right);
    
    return lsum+ rsum+ node.data;
  }

  public static int max(Node node) {
    // write your code here
    if(node == null){
        return Integer.MIN_VALUE;
    }
    
    int lmax = max(node.left);
    int rmax = max(node.right);
    
    return Math.max(node.data, Math.max(lmax, rmax));
  }

  public static int height(Node node) {
    // write your code here
    if(node == null){
        return -1;
    }
    
    int lheight = height(node.left);
    int rheight = height(node.right);
    
    return Math.max(lheight,rheight) + 1;
  }