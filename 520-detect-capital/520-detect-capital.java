class Solution {
    public boolean detectCapitalUse(String word) {
        /* NOOB CODE
        if(word.length()==1){
            return true;
        }
        
       
           if((word.charAt(0)>='A' && word.charAt(0)<='Z') && (word.charAt(1)>='A' && word.charAt(1)<='Z') ){
                for(int i=2;i<word.length();i++){
                if(word.charAt(i)>='a' && word.charAt(i)<='z'){
                return false;
            }
        }
           }
           else if((word.charAt(0)>='A' && word.charAt(0)<='Z') && (word.charAt(1)>='a' && word.charAt(1)<='z')){
                for(int i=2;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                return false;
            }
        }
           }
            else if(word.charAt(0)>='a'){
             for(int i=1;i<word.length();i++){
            if(word.charAt(i)>='A' && word.charAt(i)<='Z'){
                return false;
            }
        }
    
            }
        return true;
    }
*/
        //Smart Code
        if(word.length()<2){
            return true;
        }
        if(word.toUpperCase().equals(word)) return true;
        if(word.substring(1).toLowerCase().equals(word.substring(1))) return true;
        return false;
    }  
}