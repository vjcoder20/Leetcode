class Solution {
    public List<Integer> findKDistantIndices(int[] arr, int key, int k) {
        List<Integer> ans = new ArrayList<>();
         List<Integer> li = new ArrayList<>();
       for(int i=0;i<arr.length;i++){
           if(arr[i]==key)
              li.add(i);
       }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<li.size();j++){
                if(Math.abs(i-li.get(j))<=k){
                    ans.add(i);
                    break;
                }
            }
        }
        
        return ans;
    }
}