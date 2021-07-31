public static String serialize(Node root) {
    StringBuilder sb = new StringBuilder();
    sol(root, sb);
    return sb.toString();
  }
  
  public static void sol(Node root, StringBuilder sb){
      sb.append(root.val+",");
      for(Node child: root.children)
        sol(child, sb);
      sb.append("null,");    
  }

  // Decodes your encoded data to tree.
  public static Node deserialize(String str) {
    String arr[] = str.split(",");
        Stack<Node> st = new Stack<>();
        Node root = new Node(Integer.parseInt(arr[0]));
        int idx = 1;
        st.push(root);
        while(st.size()>0){
            String v1 = arr[idx++];
            if(v1.equals("null"))
                st.pop();
            else{
                Node newNode = new Node(Integer.parseInt(v1));
                st.peek().children.add(newNode);
                st.push(newNode);
            }    
        }
        return root;
  }