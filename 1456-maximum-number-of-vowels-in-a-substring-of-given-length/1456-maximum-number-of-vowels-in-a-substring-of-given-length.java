class Solution {
    public int maxVowels(String s, int k) {
        String vowel = "aeiou";
        int j = 0;
        int vow = 0;
        int max = 0;
        
        int i = 0;
        for(;i<k;i++){
             char ch = s.charAt(i);
             if(vowel.contains(ch+"")){
                vow++;
            }
        }
        
        
        while(i<s.length()){
            
            
            char ch = s.charAt(i);
            
            char vh = s.charAt(j);
            
            max = Math.max(max,vow);
            
           if(vowel.contains(vh+"")){
               vow--;
           }
            
            if(vowel.contains(ch+"")){
                vow++;
            }
            
            i++;
            j++;
            
    }
    
    max = Math.max(max,vow); 
    return max;
}
}