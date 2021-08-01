    public static class vPair{
        TreeNode node = null;
        int hl =0;
        
        vPair(TreeNode node, int hl){
            this.node = node;
            this.hl = hl;
        }
    }
    
    public static ArrayList<ArrayList<Integer>> diagonalOrder(TreeNode root) {
        
        LinkedList<vPair> que = new LinkedList<>();
        que.addLast(new vPair(root, 0));
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        int minH = 0, maxH = 0;
        while(que.size()!=0){
            int size = que.size();
            while(size-->0){
                vPair rem = que.removeFirst();
                map.putIfAbsent(rem.hl, new ArrayList<>());
                map.get(rem.hl).add(rem.node.val);
                
                minH = Math.min(minH, rem.hl);
                maxH = Math.max(maxH, rem.hl);
                
                if(rem.node.left != null){
                    que.addLast(new vPair(rem.node.left, rem.hl+1));
                }
                if(rem.node.right != null){
                    que.addLast(new vPair(rem.node.right, rem.hl));
                }
            }
        }
        
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        while(minH<=maxH){
            ans.add(map.get(minH));
            minH++;
        }
        return ans;
    }