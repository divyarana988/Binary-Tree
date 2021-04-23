  // write your code here
    if(node == null){
        return;
    }
    
    if(node.left!=null && node.right==null){
        System.out.println(node.left.data);
        printSingleChildNodes(node.left);
    }
    else if(node.right!=null && node.left==null){
        System.out.println(node.right.data);
        printSingleChildNodes(node.right);
    }
    else {
        printSingleChildNodes(node.left);
        printSingleChildNodes(node.right);
    }
  }