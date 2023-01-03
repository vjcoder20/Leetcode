class Solution {
    public int minDeletionSize(String[] strs) {
        
       int col = strs[0].length();
        int j = 0;
        int count = 0;
        
        for(int i=0;i<col;i++){

            for(j=1;j<strs.length;j++){
                
                char curr = strs[j].charAt(i);
                char prev = strs[j-1].charAt(i);
                
                if(curr<prev){
                    break;
                }
                
            }
            
            if(j!=strs.length)
                count++;
            
        }
            
        
            return count;
        
    }
}