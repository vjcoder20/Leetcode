class Solution {
    public boolean canConstruct(String str1, String str2) {
         HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch:str1.toCharArray())
            map.put(ch,map.getOrDefault(ch,0)+1);
        
        for(char ch:str2.toCharArray()){
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                if(freq==1)
                    map.remove(ch);
                else
                map.put(ch,freq-1);
            }
            
            if(map.size()==0)
                return true;
            
        }
        
        return map.size()==0;
        
    }
}