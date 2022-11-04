class Solution {
    public boolean vowel(char ch){
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U');
    }
    
    public String reverseVowels(String s) {
        
        StringBuilder sb = new StringBuilder(s);
        
        
        int i = 0;
        int j = sb.length()-1;
        
        while(i<j){
            char chi = sb.charAt(i);
            char chj = sb.charAt(j);
            
            if(vowel(chi)==true && vowel(chj)==true){
                sb.setCharAt(i,chj);
                sb.setCharAt(j,chi);
                i++;
                j--;
            }
            
            else if(vowel(chi)==true){
                j--;
            }
            
            else if(vowel(chj)==true){
                i++;
            }
            
            else{
                i++;
                j--;
            }
        }
        
       
        return sb.toString();
        
    }
}