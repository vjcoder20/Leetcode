class Solution {
    public int firstUniqChar(String s) {
       
       HashMap<Character,Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
      
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!set.contains(ch)){
                map.put(ch,i);
                set.add(ch);
            }
            else
                map.remove(ch);
           
        }
        
        
       
        if(map.size()==0)
            return -1;
        
         int ans = Integer.MAX_VALUE;
        
        
        for(char key:map.keySet()){
            int get = map.get(key);
            if(get<ans)
                ans = get;
        }
        
        return ans;
        
    }
}