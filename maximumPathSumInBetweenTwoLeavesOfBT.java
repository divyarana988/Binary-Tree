  static int LTLMS;
  public static int maxPathSum(TreeNode root) {
      LTLMS = Integer.MIN_VALUE;
      maxPathSumH(root);
      return LTLMS;
  }

    public static int maxPathSumH(TreeNode node){
        if(node==null)
            return 0;
        int LNTLMS = maxPathSumH(node.left);
        int RNTLMS = maxPathSumH(node.right);
        
        if(node.left!=null && node.right!=null){
            LTLMS = Math.max(LTLMS, LNTLMS + RNTLMS + node.val);
        }
        return Math.max(LNTLMS, RNTLMS) + node.val;
    }