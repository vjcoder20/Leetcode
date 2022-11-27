class Solution {
    public int appendCharacters(String s, String t) {
        
         int m = t.length();
        int j = 0;
        
        for(int i=0;i<s.length();i++){
            if(j<m && s.charAt(i)==t.charAt(j)){
                j++;
            }
        }
        
       return m-j;
        
    }
}