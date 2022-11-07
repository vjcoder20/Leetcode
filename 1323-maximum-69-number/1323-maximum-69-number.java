class Solution {
    public int maximum69Number (int num) {
        
        int n = num;
        int index = -1;
        int i = 0;
        
        while(n!=0){
            if(n%10==6)
                index = i;
            
            n = n/10;
            i++;
            
        }
        
        
        
        if(index==-1)
            return num;
        
        return num+3*(int)(Math.pow(10,index));
        
    }
}