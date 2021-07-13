 private static TreeNode buildTree(int pre[], int psi, int pei, int in[], int isi, int iei){
        if(psi>pei){
            return null;
        }
        int val = pre[psi];
        int idx = isi;
        
        while(in[idx]!=val){
            idx++;
        }
        int tnel = idx- isi;
        TreeNode node = new TreeNode(val);
        
        node.left = buildTree(pre, psi+1, psi+tnel, in, isi, idx-1);
        node.right = buildTree(pre, psi+tnel+1, pei, in, idx+1, iei);
        
        return node;
    }
    
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1);
    }