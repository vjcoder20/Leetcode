class Solution {
    public List<List<Integer>> permuteUnique(int[] arr) {
          List<List<Integer>> ans = new ArrayList<>();
          Set<List<Integer>> set = new HashSet<>();
       boolean[] visited = new boolean[arr.length];
        fun(arr,new ArrayList<>(),ans,visited,set);
        return ans;
    }
     public void fun(int[] arr,List<Integer> al,List<List<Integer>> ans,boolean[] visited,Set<List<Integer>> set){
        if(al.size()==arr.length){
            if(!set.contains(al)){
            ans.add(new ArrayList<>(al));
                set.add(al);
            }
            return;
        }
        
        for(int i=0;i<arr.length;i++){
            if(visited[i]==false){
               visited[i] = true;
                al.add(arr[i]);
                fun(arr,al,ans,visited,set);
                al.remove(al.size()-1);
              visited[i] = false;
            }
        }
}
}