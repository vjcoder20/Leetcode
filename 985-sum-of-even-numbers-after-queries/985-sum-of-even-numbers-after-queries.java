class Solution {
    public int[] sumEvenAfterQueries(int[] arr, int[][] queries) {
         int[] ans = new int[queries.length];
        
        int total = 0;
      
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                total+=arr[i];
            }
        }
        
    for(int i=0;i<queries.length;i++){
        int val = queries[i][0];
        int idx = queries[i][1];
        
        int get = arr[idx];
        int put = get+val;
        if(put%2==0 && get%2==0){
            total-=get;
            total+=put;
        }
        else if(put%2==0)
            total+=put;
        else if(get%2==0)
            total-=get;
        arr[idx] = put;
        
        ans[i] = total;
    }
        
        return ans;
    }
}