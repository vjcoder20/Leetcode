class Solution {
    public int compress(char[] chars) {
        
        
        int count = 1;
        int index = 1;
        
        for(int i=1;i<chars.length;i++){
            char prev = chars[i-1];
            char curr = chars[i];
            
            if(prev==curr)
                count++;
            
            else{
                if(count>1){
                   String ans = count+"";
                   int t = 0;
                    while(t!=ans.length())
                        chars[index++] = ans.charAt(t++);
                }
                chars[index++] = curr;
                count = 1;
            }
                
        }
        
        if(count>1){
       String ans = count+"";
                   int t = 0;
                    while(t!=ans.length())
                        chars[index++] = ans.charAt(t++);
                }

        
        
        return index;
        
    }
}