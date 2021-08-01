    public static void width(TreeNode node, int hl, int[]arr){
        if(node==null) return;
        arr[0] = Math.min(arr[0], hl);
        arr[1] = Math.max(arr[1], hl);
        width(node.left, hl-1, arr);
        width(node.right, hl+1, arr);
    }
    
    public static class vPair{
        TreeNode node = null;
        int hl = 0;
        vPair(TreeNode node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }

    public static ArrayList<Integer> BottomView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        int[]arr = new int[2];
        width(root, 0, arr);
        int len = arr[1]-arr[0]+1;
        
        for(int i=0; i<len; i++){
            ans.add(null);
        }
        LinkedList<vPair> que = new LinkedList<>();
        que.addLast(new vPair(root, Math.abs(arr[0])));
        while(que.size()!=0){
            int size = que.size();
            while(size-->0){
                vPair rp = que.removeFirst();
                TreeNode node = rp.node;
                
                ans.set(rp.hl, node.val);
                if(node.left!=null) que.addLast(new vPair(node.left, rp.hl-1));
                if(node.right!=null) que.addLast(new vPair(node.right, rp.hl+1));
            }
        }
        return ans;


    }