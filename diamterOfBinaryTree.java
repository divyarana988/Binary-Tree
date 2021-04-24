 static int dia=0;

  public static int diameter1(Node node) {
    // write your code here
    if(node == null) return -1;
    
    int lht = diameter1(node.left);
    int rht = diameter1(node.right);
    
    if(lht+rht+2>dia){
        dia = lht+rht+2;
    }
    return Math.max(lht, rht) +1;
  }