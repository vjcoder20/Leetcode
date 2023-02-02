class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(int i=0;i<order.length();i++){
            map.put(order.charAt(i),i);
        }
        
        if(words.length==1)
            return true;
        
        
        for(int i=1;i<words.length;i++){
            
            String prev = words[i-1];
            String curr = words[i];
            
            
            if(!prev.equals(curr)){
            
            char ch1 = prev.charAt(0);
            char ch2 = curr.charAt(0);
            
            if(ch1!=ch2){
                if(map.get(ch1)>map.get(ch2))
                    return false;
            }
            
            else{
                
                int j = 1;
                int k = 1;
                
                while(j<prev.length() && k<curr.length()){
                    
                    ch1 = prev.charAt(j);
                    ch2 = curr.charAt(k);
                    
                    if(map.get(ch1)>map.get(ch2))
                    return false;
                    
                    
                    j++;
                    k++;
                }
                
                if(k==curr.length() && map.get(ch1)>=map.get(ch2))
                    return false;
                
            }
                
            }
            
        }
        
        return true;
        
    }
}