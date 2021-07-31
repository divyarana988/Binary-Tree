static TreeNode prev = null;
    public static boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(!isValidBST(root.left)){
            return false;
        }
        if(prev!=null && prev.val>=root.val){
            return false;
        }
        prev = root;
        if(!isValidBST(root.right)){
            return false;
        }
        return true;
    }