class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();
        
        if(n>m){
            return false;
        }
        
        int[] freq1 = new int[26];
        
        for(int i=0;i<n;i++){
            char ch = s1.charAt(i);
            freq1[ch-'a']++;
        }
        
        for(int i=0;i<=m-n;i++){
            boolean flag = true;
            
            String str = s2.substring(i,i+n);
            int[] freq2 = new int[26];
            for(int j=0;j<str.length();j++){
            char ch = str.charAt(j);
            freq2[ch-'a']++;
        }
        for(int idx = 0; idx < 26; idx++)
                if(freq1[idx] != freq2[idx]){
                    flag = false;
                    break;
                }
            if(flag) return true;
        }
        return false;
    }
}