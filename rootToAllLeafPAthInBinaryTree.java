  public static ArrayList<ArrayList<Integer>> rootToAllLeafPath(TreeNode root) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    ArrayList<Integer> path = new ArrayList<>();
    
    pathH(root, path, ans);
    return ans;
  }
  
  public static void pathH(TreeNode root, ArrayList<Integer>path, ArrayList<ArrayList<Integer>> ans){
      if(root==null)
        return;
      if(root.left==null && root.right==null){
          ArrayList<Integer> temp = new ArrayList<>();
          for(int val: path)
            temp.add(val);
          temp.add(root.val);
          ans.add(temp);
          return;
      }    
      path.add(root.val);
      pathH(root.left, path, ans);
      pathH(root.right, path, ans);
      path.remove(path.size()-1);
  }