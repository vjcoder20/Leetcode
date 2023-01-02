class Solution {
    public boolean detectCapitalUse(String word) {
        int countc = 0;
        boolean temp = false;
        int n = word.length();
        
       for(int i=0;i<n;i++){
           
           char ch = word.charAt(i);
           
           if(ch>=65 && ch<=90){
               if(i==0){
                   temp = true;
               }
               countc++;
           }
           
           
       }
        
        
        if(countc==n || countc==0)
            return true;
        
        else if(temp==true && countc==1)
            return true;
        
        return false;
        
        
            
        
        
    }
}