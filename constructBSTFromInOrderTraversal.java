public static TreeNode constructFromInOrder_(int[] in, int si, int ei) {
        if (si > ei)
            return null;

        int mid = (si + ei) / 2;
        TreeNode node = new TreeNode(in[mid]);

        node.left = constructFromInOrder_(in, si, mid - 1);
        node.right = constructFromInOrder_(in, mid + 1, ei);

        return node;
    }

    public static TreeNode constructFromInOrder(int[] inOrder) {
        int n = inOrder.length;
        return constructFromInOrder_(inOrder, 0, n - 1);
    }