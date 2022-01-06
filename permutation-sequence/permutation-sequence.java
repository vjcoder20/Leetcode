class Solution {
    String ans = "";
    int res = 1;
    public String getPermutation(int n, int k) {
        int j = n;
        int[] arr = new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = j;
            j--;
        }
         boolean[] visited = new boolean[arr.length];
        fun(arr,new ArrayList<>(),k,visited);
        return ans;
    }
    
    public void fun(int[] arr,List<Integer> al,int k,boolean[] visited){
        if(al.size()==arr.length){
           if(res==k){
               for(int i:al){
                   ans+=i;
               }
           }
            res++;
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
               visited[i] = true;
                al.add(arr[i]);
                fun(arr,al,k,visited);
                al.remove(al.size()-1);
              visited[i] = false;
            }
        }
    }
    
   
}
