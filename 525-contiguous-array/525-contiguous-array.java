class Solution {
    public int findMaxLength(int[] arr) {
         HashMap<Integer,Integer> map = new HashMap<>(); //c0-c1 vs first index occuring of this pair
      
      map.put(0,-1);
      int oans = 0;
      int c0 = 0;
      int c1 = 0;
      
      for(int i=0;i<arr.length;i++){
          if(arr[i]==0){
              c0++;
          }
          else{
              c1++;
          }
          
          int state = c0-c1;
          
          if(map.containsKey(state)){
              int ans = i-map.get(state);
              oans = Math.max(oans,ans);
          }
          else{
              map.put(state,i);
          }
      }

        return oans;
    }
}