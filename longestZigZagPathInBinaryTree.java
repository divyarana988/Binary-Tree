    public static class pair{
        int fzpl = -1;
        int bzpl = -1;
        int zpml = 0;
    }
    
    public static pair sol(TreeNode root){
        if(root==null){
            return new pair();
        }
        pair left = sol(root.left);
        pair right = sol(root.right);
        pair ans = new pair();
        
        ans.zpml = Math.max(Math.max(left.zpml, right.zpml), Math.max(left.fzpl, right.bzpl)+1);
        
        ans.fzpl = right.bzpl+1;
        ans.bzpl = left.fzpl+1;
        
        return ans;
    }

    public static int longestZigZagPath(TreeNode root) {
        pair ans = sol(root);
        return ans.zpml;
    }