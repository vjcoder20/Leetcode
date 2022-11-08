class Solution {
    public boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        
        while(i<=j){
            char chi = s.charAt(i);
            char chj = s.charAt(j);
            
if(Character.isLetterOrDigit(chi)==true && Character.isLetterOrDigit(chj)==true){
                chi = Character.toLowerCase(chi);
                chj = Character.toLowerCase(chj);
                
                if(chi!=chj)
                    return false;
                
                i++;
                j--;
            }
            
else if(Character.isLetterOrDigit(chi)==false && Character.isLetterOrDigit(chj)==false){
                i++;
                j--;
            }
            
            else if(Character.isLetterOrDigit(chi)==false){
                i++;
            }
            
            else
                j--;
            
        }
        
        return true;
    }
}