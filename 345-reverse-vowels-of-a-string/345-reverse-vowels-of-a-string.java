class Solution {
    public void swap(StringBuilder sb,int i,int j){
        char chi = sb.charAt(i);
        char chj = sb.charAt(j);
        sb.setCharAt(i,chj);
        sb.setCharAt(j,chi);
    }
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length()-1;
        StringBuilder sb = new StringBuilder(s);
        
       while(i<j){
           char chi = sb.charAt(i);
           char chj = sb.charAt(j);
           
           if((chi=='a' || chi=='e' || chi=='i' || chi=='o' || chi=='u' || chi=='A' || chi=='E' || chi=='I' || chi=='O' || chi=='U') && (chj=='a' || chj=='e' || chj=='i' || chj=='o' || chj=='u' || chj=='A' || chj=='E' || chj=='I' || chj=='O' || chj=='U')){
           swap(sb,i,j);
           i++;j--;
           }
           
           else if(chi=='a' || chi=='e' || chi=='i' || chi=='o' || chi=='u'|| chi=='A' || chi=='E' || chi=='I' || chi=='O' || chi=='U'){
               j--;
           }
           
           else if(chj=='a' || chj=='e' || chj=='i' || chj=='o' || chj=='u' || chj=='A' || chj=='E' || chj=='I' || chj=='O' || chj=='U' ){
               i++;
           }
           
           else{
               i++;j--;
           }
       }
        return sb.toString();
    }
}