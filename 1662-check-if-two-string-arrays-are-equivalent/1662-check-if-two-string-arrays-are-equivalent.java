class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
       String str1 = "";
       String str2 = "";
     
        for(int i=0;i<word1.length;i++){
            String s = word1[i];
            str1+=s;
        }
        
        for(int i=0;i<word2.length;i++){
            String s = word2[i];
            str2+=s;
        }
        
        if(str1.equals(str2))
            return true;
        
        return false;
        
        
    }
}