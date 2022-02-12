class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        
        for(int i=0;i<asteroids.length;i++){
            int val = asteroids[i];
            if(st.size()>0 && st.peek()>0 && val<0){
                while(st.size()>0 && st.peek()>0 && st.peek()<-val){
                    st.pop();
                }
                if(st.size()>0 && st.peek()==-val){
                    st.pop();
                }
                else if(st.size()>0 && st.peek()>-val){
                    continue;
                }
                else{
                    st.push(val);
                }
            }
            else{
                st.push(val);
            }
        }
        
       
        int[] arr = new int[st.size()];
         int i = arr.length-1;
        while(st.size()>0){
            arr[i--] = st.pop();
        }
        return arr;
    }
}