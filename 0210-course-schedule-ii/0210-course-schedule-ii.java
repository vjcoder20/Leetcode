class Solution {
    public int[] findOrder(int n, int[][] arr) {
        
        int[] res = new int[n];
        
         int[] indegree = new int[n];
        
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=0;i<n;i++){
            li.add(new ArrayList<>());
        }
        
        
        for(int i=0;i<arr.length;i++){
            li.get(arr[i][1]).add(arr[i][0]);
        }
        
        for(int i=0;i<n;i++){
            for(int elem:li.get(i)){
                indegree[elem]++;
            }
        }
        
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
            q.add(i);
        }
        
        int i = 0;
        
        while(q.size()>0){
            int rem = q.remove();
            res[i++] = rem;
            
            for(int elem:li.get(rem)){
                indegree[elem]--;
                if(indegree[elem]==0)
                q.add(elem);
            }
        }
        
        if(i==n)
       return res;
        
        return new int[]{};
        
    }
}