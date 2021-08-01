  public static Node SortedDLLToBST(Node head) {
      
    if(head==null || head.right==null){
        return head;
    }  
    Node root = mid(head);
    Node back = root.left;
    Node fwd = root.right;
    
    if(back!=null){
        root.left = back.right= null;
    }
    root.right = fwd.left = null;
    
    root.left = SortedDLLToBST(back == null ? null : head);
    root.right = SortedDLLToBST(fwd);
      
    return root;
  }
  
  public static Node mid(Node head){
      Node slow = head, fast = head;
      while(fast.right != null && fast.right.right!=null){
          slow = slow.right;
          fast = fast.right.right;
      }
      return slow;
  }