static int bstIdx =0;
    public static TreeNode constructBSTFromPreOrder(int[] arr, int lr, int rr) {
        if (bstIdx <0 || arr[bstIdx] < lr || arr[bstIdx] > rr)
            return null;

        TreeNode node = new TreeNode(arr[bstIdx--]);
        node.right = constructBSTFromPreOrder(arr, node.val, rr);
        node.left = constructBSTFromPreOrder(arr, lr, node.val);
        

        return node;
    }

    


    public static TreeNode bstFromPostorder(int[] preorder) {
        bstIdx = preorder.length-1;
        return constructBSTFromPreOrder(preorder, -(int) 1e8, (int) 1e8);
    }