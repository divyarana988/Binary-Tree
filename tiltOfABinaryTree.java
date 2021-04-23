 static int tilt = 0;
  public static int tilt(Node node){
    // write your code here to set the tilt data member
    if(node == null){
        return 0;
    }
    int lsum = tilt(node.left);
    int rsum = tilt(node.right);
    
    tilt += Math.abs(lsum-rsum);
    return lsum+rsum+node.data;
  }