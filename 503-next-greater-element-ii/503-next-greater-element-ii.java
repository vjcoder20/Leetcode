class Solution {
    public int[] nextGreaterElements(int[] arr) {
       int n = arr.length;
   Stack<Integer> st = new Stack<>();
   int[] arr2 = new int[n];
   int m = arr2.length;
   arr2[m-1] = -1;
   st.push(arr[n-1]);
   for(int i=n-2;i>=0;i--){
       while(st.size()>0 && st.peek()<=arr[i]){
           st.pop();
       }
         st.push(arr[i]);
   }
       for(int i=n-1;i>=0;i--){
       while(st.size()>0 && st.peek()<=arr[i]){
           st.pop();
       }
             if(st.size()==0){
           arr2[i]=-1;
       }
       else{
         arr2[i] = st.peek();  
       } 
         st.push(arr[i]);
   }
       
       

     
   
   return arr2;
    }
}