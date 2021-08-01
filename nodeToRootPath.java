  public static ArrayList<TreeNode> nodeToRootPath(TreeNode node, int data) {
    ArrayList<TreeNode> list = new ArrayList<>();
    find(node, data, list);
    return list;
    // write your code here
  }

  public static boolean find(TreeNode root, int data, ArrayList<TreeNode> list){
      if(root==null){
          return false;
      }
      if(root.val==data){
          list.add(root);
          return true;
      }
      boolean res = find(root.left, data, list)||find(root.right, data, list);
      if(res){
          list.add(root);
      }
      return res;
  }