class Solution {
    
    public int[] frequency(String s1){
        
        int[] freq = new int[26];
        
        
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            freq[ch-'a']++;
        }
        
        return freq;
        
    }
    
    public boolean checkInclusion(String s1, String s2) {
        
       
        
        if(s1.length()>s2.length())
            return false;
        
         int[] freq = frequency(s1);
        
        
        for(int i=0;i<s2.length()-s1.length()+1;i++){
            
            String temp = s2.substring(i,i+s1.length());
            int[] freq2 = frequency(temp);
            
            if(Arrays.equals(freq, freq2))
                return true;
            
        }
        
        return false;
        
    }
}