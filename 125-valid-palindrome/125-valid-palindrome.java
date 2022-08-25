class Solution {
    public boolean isPalindrome(String s) {
       String str = "";
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z' || ch>='A' && ch<='Z' || ch>='0' && ch<='9'){
                if(ch>='A' && ch<='Z'){
                    str+=(char)(ch+32);
                }
                else
                str+=ch;
            }
        }
        
      
        int i = 0;
        int j = str.length()-1;
        
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        
        return true;
    }
}