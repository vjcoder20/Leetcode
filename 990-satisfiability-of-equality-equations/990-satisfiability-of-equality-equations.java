class Solution {
      int[] parent;
      int[] rank;
    public boolean equationsPossible(String[] equations) {
       parent = new int[26];
       rank = new int[26];
          
    for(int i=0;i<26;i++){
        parent[i] = i;
    }
          
//Step-1: Apply DSU using equality equations
          
          for(int i=0;i<equations.length;i++){
              String eqn = equations[i];
              if(eqn.charAt(1)== '='){
                  char op1 = eqn.charAt(0);
                  char op2 = eqn.charAt(3);
                  
                  union(op1,op2);
              }
          }
          
//Step-2:  Verification using inequalities equation
            for(int i=0;i<equations.length;i++){
              String eqn = equations[i];
              if(eqn.charAt(1)== '!'){
                  char op1 = eqn.charAt(0);
                  char op2 = eqn.charAt(3);
                  
                  if(find(op1-'a')==find(op2-'a')){
                      return false;
                  }
                  
                 
              }
          }
          return true;
    
    }
    
    public void union(char op1,char op2){
        int v1 = op1-'a';
        int v2 = op2-'a';
        
        int sl1 = find(v1);
        int sl2 = find(v2);
        
        if(sl1!=sl2){
     if(rank[sl1]<rank[sl2]){
                    parent[sl1] = sl2;
                }

                else if(rank[sl2]<rank[sl1]){
                    parent[sl2] = sl1;
                }

                else{
                    parent[sl2] = sl1;
                    rank[sl1]++;
                }
        }
    }
    
    public int find(int x){
        if(parent[x]==x){
            return x;
        }
        
        int sl = find(parent[x]);
        parent[x] = sl;
        
        return sl;
    }
}