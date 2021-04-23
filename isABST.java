 public static class BSTSolver{
     int max; 
     int min;
     boolean isBST;
     
     BSTSolver(int max, int min, boolean isBST){
         this.max = max;
         this.min = min;
         this.isBST = isBST;
     }
 }
  
  
  public static BSTSolver isBinarySearchTree(Node node){
      if(node == null){
          return new BSTSolver(Integer.MIN_VALUE, Integer.MAX_VALUE, true);
      }
      BSTSolver lres = isBinarySearchTree(node.left);
      BSTSolver rres = isBinarySearchTree(node.right);
      
      int max = Math.max(node.data, (Math.max(lres.max, rres.max)));
      int min = Math.min(node.data, (Math.min(lres.min, rres.min)));
      boolean isBST = lres.isBST && rres.isBST && node.data>lres.max && node.data<rres.min;
      
      return new BSTSolver(max, min, isBST);

  }