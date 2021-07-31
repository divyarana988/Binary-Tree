public static ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int targetSum) {
    ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
    helper(root, targetSum, new ArrayList<>(), ans);
    return ans;
  }

    public static void helper(TreeNode root, int tar, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans){
        if(root==null)
            return;
        if(root.left==null && root.right==null){
            if(tar-root.val==0){
                ArrayList<Integer> temp = new ArrayList<>();
                for(int val: path)
                    temp.add(val);
                temp.add(root.val);
                ans.add(temp);
            }
            return;
        }    
        path.add(root.val);
        helper(root.left, tar-root.val, path, ans);
        helper(root.right, tar-root.val, path, ans);
        path.remove(path.size()-1);
    }
