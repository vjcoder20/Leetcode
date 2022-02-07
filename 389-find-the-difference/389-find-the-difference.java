class Solution {
    public char findTheDifference(String s, String t) {
        int n = t.length();
        char ch = t.charAt(n-1);
        for(int i=0;i<n-1;i++){
           ch^=t.charAt(i);
            ch^=s.charAt(i);
        }
        return ch;
    }
}