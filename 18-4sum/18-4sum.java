class Solution {
    public List<List<Integer>> twoSum(int[] arr,int idx, int target) {
   List<List<Integer>> ans = new ArrayList<>();
   
   int i = idx;
   int j = arr.length-1;
   
   while(i<j){
       if(i!=idx && arr[i]==arr[i-1]){  //to avoid duplicates
           i++;
           continue;
       }
       
       if(arr[i]+arr[j]==target){
           ArrayList<Integer> pair = new ArrayList<>();
           pair.add(arr[i]);
           pair.add(arr[j]);
           ans.add(pair);
           i++;
           j--;
       }
       else if(arr[i]+arr[j]<target){
           i++;
       }
       else
       j--;
   }
   
   return ans;
  }
    public List<List<Integer>> threeSum(int[] arr,int idx,int target) {
        List<List<Integer>> ans = new ArrayList<>();

        
        for(int i=idx;i<arr.length-2;i++){
            if(i>idx && arr[i-1]==arr[i]){
                continue;
            }
           
            List<List<Integer>> temp = twoSum(arr,i+1,target-arr[i]);
            
            for(int k=0;k<temp.size();k++){
                temp.get(k).add(arr[i]);
                ans.add(temp.get(k));
            }
                
            }
        return ans;
        }
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        for(int i=0;i<arr.length-3;i++){
            if(i-1>=0 && arr[i-1]==arr[i]){
                continue;
            }
            
             List<List<Integer>> temp = threeSum(arr,i+1,target-arr[i]);
             for(int k=0;k<temp.size();k++){
                temp.get(k).add(arr[i]);
                ans.add(temp.get(k));
            }
                
            }
        return ans;
            
           
        }
        
    }
