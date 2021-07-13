  public static TreeNode build(int[]pre, int prsi, int prei, int[]post, int posi, int poei){
        if(prsi>prei){
            return null;
        }
        int val = post[poei];
        TreeNode node = new TreeNode(val);
        if(prsi == prei){
            return node;
        }
        int idx = posi;
        while(post[idx]!=pre[prsi+1]){
            idx++;
        }
        int tnel = idx-posi+1;
        
        node.left = build(pre, prsi+1, prsi+tnel, post, posi, idx);
        node.right = build(pre, prsi+tnel+1, prei, post, idx+1, poei-1);
        
        return node;
    }

    public static TreeNode constructFromPrePost(int[] pre, int[] post) {
        return build(pre, 0, pre.length-1, post, 0, post.length-1);
    }