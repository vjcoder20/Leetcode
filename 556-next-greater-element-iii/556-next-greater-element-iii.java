class Solution {
    //is question ka Logic go to question no. 31
    public int nextGreaterElement(int n) {
        String str = n+"";
        char[] arr = str.toCharArray();
        
          int i = arr.length-2;
        while(i>=0 && arr[i]>=arr[i+1])
            i--;
        
        if(i==-1)
            return i;
        
            if(i>=0){  
            int j = arr.length-1;
            while(arr[i]>=arr[j])
            j--;
            
            swap(arr,i,j);
        }
         reverse(arr,i+1,arr.length-1);
        
        StringBuilder sb = new StringBuilder();
        for(char elem:arr){
           sb.append(elem);
        }
        long val = Long.parseLong(sb.toString());
        return (val <= Integer.MAX_VALUE) ? (int) val : -1;
    }
      public void reverse(char[] arr,int i,int j){
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
    
    public void swap(char[] arr,int i,int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}