public static TreeNode buildTree(int[]in, int isi, int iei, int[]post, int psi, int pei){
        if(psi>pei){
            return null;
        }
        int val = post[pei];
        int idx = isi;
        while(in[idx]!=val){
            idx++;
        }
        TreeNode node = new TreeNode(val);
        int tnel = idx-isi;
        node.left = buildTree(in, isi, idx-1, post, psi, psi+tnel-1);
        node.right = buildTree(in, idx+1, iei, post, psi+tnel, pei-1);
        return node;
    }

    public static TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length-1, postorder, 0, postorder.length-1);
    }