 public static class Pair {
    Node node;
    int state;

    Pair(Node node, int state) {
      this.node = node;
      this.state = state;
    }
  }
 
 
 public static void iterativePrePostInTraversal(Node node) {
    // write your code here
    Stack<Pair> st = new Stack<>();
    st.push(new Pair(node, 1));
    String pre = "", post="", in="";
    
    while(st.size()>0){
        Pair top = st.peek();
        
        
        if(top.state==1){
            pre+=top.node.data + " ";
            
            if(top.node.left == null){
                top.state++;
            }else{
                st.push(new Pair(top.node.left, 1));
                top.state++;
            }
        }
        else if(top.state==2){
            in+=top.node.data + " ";
            
            if(top.node.right==null){
                top.state++;
            }else{
                st.push(new Pair(top.node.right, 1));
                top.state++;
            }
        }
        else if(top.state==3){
            post+= top.node.data + " ";
            st.pop();
        }
    }
    System.out.println(pre + "\n" + in + "\n" + post);
  }