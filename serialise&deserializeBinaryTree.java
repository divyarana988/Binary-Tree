 public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        sol(root, sb);
        return sb.toString();
    }
    
    public static void sol(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("-1001 ");
            return;
        }
        sb.append(root.val+" ");
        sol(root.left, sb);
        sol(root.right, sb);
    }

    // Decodes your encoded data to tree.
    static int idx =0;
    public static TreeNode deserialize(String str) {
        String[]ar = str.split(" ");
        int arr[] = new int[ar.length];
        int i=0;
        for(String s : ar)
            arr[i++] = Integer.parseInt(s);
        return find(arr);    
    }
    
    public static TreeNode find(int[]arr){
        if(idx>= arr.length || arr[idx]== -1001){
            idx++;
            return null;
        }
        TreeNode node = new TreeNode(arr[idx++]);
        node.left = find(arr);
        node.right  = find(arr);
        return node;
    }