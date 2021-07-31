    static TreeNode a = null, b=null, prev = null;

    public static void recoverTree(TreeNode root){
        sol(root);
        if(a!=null){
            int temp = a.val;
            a.val = b.val;
            b.val = temp;;
        }
    }

    public static boolean sol(TreeNode root) {
        if(root==null){
            return true;
        }
        if(!sol(root.left))
            return false;
        if(prev!=null && prev.val>root.val){
            b = root;
            if(a==null){
                a = prev;
            }else{
                return false;
            }
        }    
        prev = root;
        if(!sol(root.right)){
            return false;
        }
        return true;
    }