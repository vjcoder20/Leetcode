class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
       boolean[] visited = new boolean[arr.length];
        fun(arr,new ArrayList<>(),ans,visited);
        return ans;
    }
    public void fun(int[] arr,List<Integer> al,List<List<Integer>> ans,    boolean[] visited){
        if(al.size()==arr.length){
            ans.add(new ArrayList<>(al));
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
               visited[i] = true;
                al.add(arr[i]);
                fun(arr,al,ans,visited);
                al.remove(al.size()-1);
              visited[i] = false;
            }
        }
    }
}
