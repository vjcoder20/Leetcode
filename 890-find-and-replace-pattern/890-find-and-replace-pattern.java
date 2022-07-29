class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> ans = new ArrayList<>();
        
        String s = normalize(pattern);
        
        
        for(int i=0;i<words.length;i++){
            String word = words[i];
            
            if(s.equals(normalize(word)))
                ans.add(word);
        }
        
        
        
        return ans;
        
    }
    
    public String normalize(String word){
        
        String s = "";
        
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char ch:word.toCharArray()){
            map.put(ch,map.getOrDefault(ch,map.size()));
            s+=map.get(ch);
        }
        
        return s;
        
        
    }
}