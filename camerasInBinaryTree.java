static int count;
    
    public static int MinCamerasInBT(TreeNode root) {
        
        count = 0;
         if(find(root)== -1){
            count++;
         }
        
        return count;
    }
    
    public static int find(TreeNode node){
        if(node==null){
            return 1;
        }
        int lc = find(node.left);
        int rc = find(node.right);
        
        if(lc==-1 || rc==-1){
            count++;
            return 0;
        }
        if(lc==0 || rc==0){
            return 1;
        }
        
        return -1;
    }