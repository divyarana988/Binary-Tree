 static int bst_idx = 0;
    public static TreeNode constructBSTFromPreOrder(int[] arr, int lr, int rr) {
        if (bst_idx >= arr.length || arr[bst_idx] < lr || arr[bst_idx] > rr)
            return null;

        TreeNode node = new TreeNode(arr[bst_idx++]);
        node.left = constructBSTFromPreOrder(arr, lr, node.val);
        node.right = constructBSTFromPreOrder(arr, node.val, rr);

        return node;
    }

    public static TreeNode bstFromPreorder(int[] preorder) {
        return constructBSTFromPreOrder(preorder, -(int) 1e8, (int) 1e8);
    }