public static void levelOrder(Node node) {
    // write your code here
    Queue <Node> mainQ = new ArrayDeque<>();
    Queue <Node> helperQ = new ArrayDeque<>();
    
    mainQ.add(node);
    
    while(mainQ.size()>0){
        Node temp = mainQ.remove();
        System.out.print(temp.data + " ");
        
        if(temp.left!=null){
            helperQ.add(temp.left);
        }
        if(temp.right!= null){
            helperQ.add(temp.right);
        }
        
        
        if(mainQ.size()==0){
            System.out.println();
            Queue<Node> tempQ = mainQ;
            mainQ = helperQ;
            helperQ = tempQ;
        }
    }
    
    
  }
