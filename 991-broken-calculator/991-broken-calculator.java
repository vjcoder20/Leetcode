class Solution {
    public int brokenCalc(int startValue, int target) {
        //we are going backward i.e. from target to startValue
        //because it is lot easier to divide and add to reach optimmally
        
        
        //So instead of subtraction i am doing addition
        //similarly instead of multiplication i am doing division
        
        int ans = 0;
        while(target>startValue){
            if(target%2!=0)
                target++;
            
            else
            target/=2;
            
            ans++;
        }
        return ans+startValue-target;
    }
}