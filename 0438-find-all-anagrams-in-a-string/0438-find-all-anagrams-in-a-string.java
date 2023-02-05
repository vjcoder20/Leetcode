class Solution {
    
     public int[] frequency(String s1){
        
        int[] freq = new int[26];
        
        
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }
        
        return freq;
        
    }
    
    public List<Integer> findAnagrams(String s1, String s2) {
        List<Integer> ans = new ArrayList<>();
        
        int[] freq = frequency(s2);
        
        
        for(int i=0;i<=s1.length()-s2.length();i++){
            
            String temp = s1.substring(i,i+s2.length());
            int[] freq2 = frequency(temp);
            
            if(Arrays.equals(freq, freq2))
                ans.add(i);
            
        }
        
        
        return ans;
    }
}