public static class HPair{
        int wrob;
        int worob;
        
        HPair(int wrob, int worob){
            this.wrob = wrob;
            this.worob = worob;
        }
    }
    

    public static int HouseRobber(TreeNode root) {
        
        HPair res = find(root);
        return Math.max(res.wrob, res.worob);
        
    }

    public static HPair find(TreeNode node){
        if(node == null){
            return new HPair(0,0);
        }
        HPair left = find(node.left);
        HPair right = find(node.right);
        
        int wRob = node.val + left.worob + right.worob;
        int wORob = Math.max(left.wrob, left.worob) + Math.max(right.worob, right.wrob);
        
        return new HPair(wRob