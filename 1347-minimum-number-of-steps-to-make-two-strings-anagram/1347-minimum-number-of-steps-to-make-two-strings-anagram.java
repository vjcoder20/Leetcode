class Solution {
    public int minSteps(String s, String t) {
        int ans = 0;
        
        HashMap<Character,Integer> map1 = new HashMap<>();
         HashMap<Character,Integer> map2 = new HashMap<>();
        
        for(char ch:s.toCharArray())
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        
        for(char ch:t.toCharArray())
            map2.put(ch,map2.getOrDefault(ch,0)+1);
        
        
        for(char ch:map1.keySet()){
            int freq1 = map1.get(ch);
            if(map2.containsKey(ch)){
                int freq2 = map2.get(ch);
                if(freq2<freq1)
                    ans+=freq1-freq2;
            }
            
            else
                ans+=freq1;
            
        }
        
        
        
        return ans;
    }
}