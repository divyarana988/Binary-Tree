 public static ArrayList<Integer> morrisInTraversal(TreeNode root) {
    ArrayList<Integer> ans = new ArrayList<>();
    while(root!=null){
        if(root.left == null){
            ans.add(root.val);
            root = root.right;
        }
        else{
            TreeNode rootp1 = root.left;
            while(rootp1.right!=null && rootp1.right!=root){
                rootp1 = rootp1.right;
            }
            if(rootp1.right == null){
                
                rootp1.right = root;
                root = root.left;
            }
            else{
                ans.add(root.val);
                rootp1.right = null;
                root = root.right;
            }
        }
    }
    return ans;
    
  }