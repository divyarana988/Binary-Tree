  public static ArrayList<Integer> exactlyOneChild(TreeNode root) {
    ArrayList<Integer> ans = new ArrayList<>();
    helper(root, ans);
    return ans;
  }

    public static void helper(TreeNode root, ArrayList<Integer> ans){
        if(root==null || (root.left==null && root.right==null))
            return;
        if(root.left==null || root.right==null)
            ans.add(root.val);
        helper(root.left, ans);
        helper(root.right, ans);
    }
