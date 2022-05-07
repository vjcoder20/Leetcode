class Solution {
    public boolean find132pattern(int[] arr) {
     //Brute Force you know O(n^3) solution
        /*Better Solution O(n^2)
        
        if(arr.length<3){
            return false;
        }
        
    
        int min = arr[0];
        for(int j=1;j<arr.length-1;j++){
        
            for(int k=j+1;k<arr.length;k++){
                if(arr[k]>min && arr[k]<arr[j])
                   return true;
            }
            
            min = Math.min(min,arr[j]);
           
            
        }
        return false;*/
        //Optimal O(n)
        Stack<Integer> st = new Stack<>();
        int thirdElem = Integer.MIN_VALUE;
        int n = arr.length;
        
        for(int i=n-1;i>=0;i--){
            if(arr[i]<thirdElem) return true;
            while(st.size()!=0 && st.peek()<arr[i])
                thirdElem = st.pop();
            
            st.push(arr[i]);
        }
        return false;
    }
}