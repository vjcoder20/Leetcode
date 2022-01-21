class Solution {
    public boolean isUgly(int n) {
        if(n<=0 || n==2147483647){
            return false;
        }
        
        if(n==1){
            return true;
        }
         for(int i=2;i*i<=n;i++){
      while(n%i==0){
        if(i!=2 && i!=3 && i!=5){
            return false;
        }
        n = n/i;
      }
  }
    
    if(n>1 && n!=2 && n!=3 && n!=5){
            return false;
        }
       
    
    return true;
    }
   
}