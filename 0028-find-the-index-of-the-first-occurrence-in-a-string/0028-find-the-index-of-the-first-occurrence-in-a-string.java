class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = needle.length();
        int index = -1;
        for(int i=0;i<haystack.length()-n+1;i++){
            String s = haystack.substring(i,i+n);
            if(s.equals(needle)){
                index = i;
                break;
            }
        }
        
        return index;
    }
}