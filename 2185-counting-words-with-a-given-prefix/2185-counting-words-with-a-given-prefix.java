class Solution {
    public int prefixCount(String[] words, String pref) {
        int len = pref.length();
        int count = 0;
        for(int i=0;i<words.length;i++){
            String temp = words[i];
            if(temp.length()>=len){
            if(temp.substring(0,len).equals(pref))
            count++;
            }
        }
        return count;
    }
}