class Solution {
  
    public int longestPalindrome(String[] words) {
        
        HashMap<String,Integer> map = new HashMap<>();
        
        
        int ans = 0;
        
        for(String word:words){
            String rev = ""+word.charAt(1)+word.charAt(0);
            if(map.getOrDefault(rev,0)>0){
                ans+=4;
                map.put(rev,map.get(rev)-1);
            }
            else{
                map.put(word,map.getOrDefault(word,0)+1);
            }
        }
        
        for(String word:words){
            if(map.getOrDefault(word,0)>0 && word.charAt(0)==word.charAt(1)){
                ans+=2;
                break;
            }
        }
      return ans;
        
        
    }
}