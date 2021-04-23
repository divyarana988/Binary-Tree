static boolean isBalanced = true;
  
  public static int isTreeBalanced(Node node){
      if(node == null){
          return -1;
      }
      
      int lht = isTreeBalanced(node.left);
      int rht = isTreeBalanced(node.right);
      
      int bf = Math.abs(lht-rht);
      
      if(bf>1){
          isBalanced = false;
      }
      
      return Math.max(lht, rht) + 1;
  }