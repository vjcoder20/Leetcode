class Solution {
    
    public int count(String s,char ch){
        int c = 0;
        
        for(char chh:s.toCharArray()){
            if(chh==ch)
                c++;
        }
        
        return c;
    }
    
    public boolean subset(String s,int[] freq){
        for(char c ='a';c<'z';c++){
            if(count(s,c)<freq[c-'a'])
                return false;
        }
        
        return true;
    }
    
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> li = new ArrayList<>();
        
        int[] freq = new int[26];
        
        for(String word:words2){
            for(char i='a';i<'z';i++){
                freq[i-'a'] = Math.max(freq[i-'a'],count(word,i));
            }
        }
        
       
        for(String s:words1){
            if(subset(s,freq))
                li.add(s);
        }
        
        return li;
    }
}