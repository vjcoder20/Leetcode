class Solution {
   static class Pair implements Comparable<Pair>{
  int ones;
  int row;
 
  
  Pair(int ones,int row){
  this.ones = ones;
  this.row = row;
  }
  
  public int compareTo(Pair o){
      if(this.ones!=o.ones)
  return this.ones-o.ones;
      else
    return this.row-o.row;
  }
}
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[k];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for(int i=0;i<mat.length;i++){
            int ones = 0;
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1)
                    ones++;
                else
                break;
            }
           pq.add(new Pair(ones,i));
        }
        
    int i = 0;
    while(i!=k){
        Pair rp = pq.remove();
        arr[i++] = rp.row;
    }
        return arr;
    }
}