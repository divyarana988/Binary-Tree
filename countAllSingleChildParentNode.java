 public static int countExactlyOneChild(TreeNode root) {
      if(root==null || (root.left==null && root.right==null))
        return 0;
    
    int ans = 0;
    ans+= countExactlyOneChild(root.left);
    ans+=countExactlyOneChild(root.right);
    
    if(root.left==null || root.right==null)
        ans = ans+1;
        
    return ans;
  }
