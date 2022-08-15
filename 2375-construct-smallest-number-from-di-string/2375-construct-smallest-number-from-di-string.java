class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder res = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        
        for(int i=0;i<=pattern.length();i++){
            temp.append((char)('1'+i));
            if(i==pattern.length() || pattern.charAt(i)=='I'){
                res.append(temp.reverse());
                temp = new StringBuilder();
            }
        }
        
        return res.toString();
    }
}