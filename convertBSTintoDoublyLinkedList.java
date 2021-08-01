    public static void getAllLeft(Node curr, Stack<Node> st){
        while(curr!=null){
            st.push(curr);
            curr = curr.left;
        }
    }

  public static Node bToDLL(Node root) {
      Stack <Node> st = new Stack<>();
      getAllLeft(root, st);
      Node dummy = new Node(-1);
      Node prev = dummy;
      while(st.size()>0){
          
          Node curr = st.pop();
          curr.left = prev;
          prev.right = curr;
          prev = curr;
          getAllLeft(curr.right, st);
      }
      Node hed = dummy.right;
      hed.left = null;
      dummy.right = null;
      hed.left = prev;
      prev.right = hed;
      
    return hed;
  }
