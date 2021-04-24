
public static ArrayList<Node> nodeToRootPath(Node node, int data){
    // write your code here
    if(node == null){
        return new ArrayList<Node>();
    }
    if(node.data == data){
        ArrayList<Node> al = new ArrayList<>();
        al.add(node);
        return al;
    }
    ArrayList <Node> lrres = nodeToRootPath(node.left,data);
    if(lrres.size()>0){
        lrres.add(node);
        return lrres;
    }
    
    ArrayList <Node> rrres = nodeToRootPath(node.right,data);
    if(rrres.size()>0){
        rrres.add(node);
        return rrres;
    }
     return new ArrayList <Node>();
  }
  
  public static void printKLevelsDown(Node node, int k){
    // write your code here
    if(node == null){
        return;
    }
   
   if(k==0){
        System.out.println(node.data );
        return;
        
   }
        
     printKLevelsDown(node.left, k-1);
     printKLevelsDown(node.right, k-1);
    
    
     
   
  public static void printKNodesFar(Node node, int data, int k) {
    // write your code here
    ArrayList<Node> list = nodeToRootPath(node, data);
    printKLevelsDown(list.get(0), k);
    
    for(int idx=1; idx<list.size(); idx++){
        int rdis = k-idx;
        Node curr = list.get(idx);
        Node prev = list.get(idx-1);
        
        if(rdis == 0){
            System.out.println(curr.data);
            return;
        }else{
            if(prev == curr.left){
                printKLevelsDown(curr.right, rdis-1);
            }else{
                printKLevelsDown(curr.left, rdis-1);
            }
        }
    }
  }
