//----------------------------------------------------Technique-1 ---> Very High time complexity O(n!*n) Brute Force-----------------------------------------------------------
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


//------------------------------------------------Optimal One O(n) Solution || Explanation Striver solution--------------------------------------------------------------------------------------------------
class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> li = new ArrayList<>();
        int fact = 1;
        
        for(int i=1;i<n;i++){
            fact = fact*i;
            li.add(i);
        }
        li.add(n);
        k = k-1;
        String ans="";
        while(true){
            ans+=li.get(k/fact);
            li.remove(k/fact);
            if(li.size()==0){
                break;
            }
            k = k%fact;
            fact = fact/li.size();
        }
        return ans;
        
    }
}
