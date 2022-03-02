class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = -1;  //acquire
        int j = -1; //release
        
        int ans = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        
        while(i<s.length()-1){
            
            //acquire
            while(i<s.length()-1){
                i++;
                char ch = s.charAt(i);
                
                map.put(ch,map.getOrDefault(ch,0)+1);
                
                if(map.get(ch)==2)
                    break;
                
                else{
                    int len = i-j;  //ans--> j+1 to i
                  ans = Math.max(ans,len);
                }
            }
            
            //release
            while(j<i){
                j++;
                char ch = s.charAt(j);
                map.put(ch,map.get(ch)-1);
                
                  if(map.get(ch)==1)
                    break;
                
            }
        }
        
        return ans;
    }
}