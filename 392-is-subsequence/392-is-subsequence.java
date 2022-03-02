class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; //for s
        int j = 0; //for t
        
        while(j<t.length() && i<s.length()){
            if(s.charAt(i)==t.charAt(j))
                i++;
            
            j++;
        }
        
        if(i==s.length())
            return true;
        
        return false;
    }
}