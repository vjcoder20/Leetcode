/*BFS Approach 

Here you just have to reverse the graph and change outdegree to indegree respectively
and apply topo sort

*/

class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        
        List<Integer> al = new ArrayList<>();
        int n = graph.length;
        
        List<List<Integer>> li = new ArrayList<>();
        
        for(int i=0;i<n;i++)
            li.add(new ArrayList<>());
        
        
        int[] indegree = new int[n];
        
        for(int i=0;i<n;i++){
            for(int elem:graph[i]){
               li.get(elem).add(i);
                indegree[i]++;
            }
        }
        
        // System.out.println(li);
        // System.out.println(Arrays.toString(indegree));
    
        Queue<Integer> q = new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            if(indegree[i]==0)
            q.add(i);
        }
        
      
        while(q.size()>0){
            int rem = q.remove();
            al.add(rem);
            
            for(int elem:li.get(rem)){
                indegree[elem]--;
                if(indegree[elem]==0)
                q.add(elem);
            }
        }
        
        Collections.sort(al);
        return al;
        
}
    
}