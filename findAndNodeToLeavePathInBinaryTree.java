public static boolean find(Node node, int data){
    // write your code here
    if(node==null){
        return false;
    }
    if(node.data == data){
        return true;
    }
    if(find(node.left, data)){
        return true;
    }
    if(find(node.right, data)){
        return true;
    }
    return false;
  }

  public static ArrayList<Integer> nodeToRootPath(Node node, int data){
    // write your code here
    if(node == null){
        return new ArrayList<Integer>();
    }
    if(node.data == data){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(node.data);
        return al;
    }
    ArrayList <Integer> lrres = nodeToRootPath(node.left,data);
    if(lrres.size()>0){
        lrres.add(node.data);
        return lrres;
    }
    
    ArrayList <Integer> rrres = nodeToRootPath(node.right,data);
    if(rrres.size()>0){
        rrres.add(node.data);
        return rrres;
    }
    
    return new ArrayList <Integer>();
  }