class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n = name.length();
        int t = typed.length();
        
        if(t<n){
            return false;
        }
        
        
        int i=0;
        int j=0;
        
        while(j<typed.length()){
            if(i<name.length() && name.charAt(i)==typed.charAt(j)){
                i++;
                j++;
            }
            else if(j>=1 && typed.charAt(j)==typed.charAt(j-1))
                j++;
            
            else
                return false;
        }
        if(i==n)
        return true;
        else
        return false;
    }
}