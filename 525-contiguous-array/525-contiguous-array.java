class Solution {
    public int findMaxLength(int[] arr) {
        
      
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);   //sum-index ka key value pair
        
        int sum = 0;
        for(int i=0;i<arr.length;i++){
          if(arr[i]==0){
              sum+=-1;
          }
            else{
                sum+=arr[i];
            }
            if(map.containsKey(sum)){
                int idx = map.get(sum);
                count = Math.max(count,i-idx);
            }
            else{
                map.put(sum,i);
            }
        }
        return count;
    }
}