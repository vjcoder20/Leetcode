class Solution {
    public List<List<Integer>> permute(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        fun(arr,0,ans);
        return ans;
    }
    public void fun(int[] arr,int idx,List<List<Integer>> ans){
      if(idx==arr.length){
         ArrayList<Integer> al = new ArrayList<>();
          for(int i=0;i<arr.length;i++){
              al.add(arr[i]);
          }
          ans.add(new ArrayList<>(al));
          return;
      }
        
        for(int i=idx;i<arr.length;i++){
            swap(idx,i,arr);
            fun(arr,idx+1,ans);
             swap(idx,i,arr);
        }
}
    public void swap(int i,int j,int[] arr){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}

