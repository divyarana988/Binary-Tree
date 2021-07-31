 public static boolean hasPathSum(TreeNode root, int targetSum) {
      if(root==null)
        return false;
        
    if(root.left==null && root.right==null)
        return(targetSum-root.val==0);
        
    boolean res = hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    
    return res;
  }