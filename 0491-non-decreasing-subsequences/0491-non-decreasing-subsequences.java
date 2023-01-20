class Solution {
 
    public List<List<Integer>> findSubsequences(int[] nums) {
        
        
       List<Integer> li = new ArrayList<>();
       HashSet<List<Integer>> set = new HashSet<>();
        
        solve(li,nums,0,set);
       
           return new ArrayList<>(set);
        
    }
    
    
public void solve(List<Integer> li,int[] nums,int i,HashSet<List<Integer>> set){
        
        
        if(i==nums.length){
            
              if(li.size()>=2)
            set.add(new ArrayList<>(li));
            
            return;
        }
        
      
        
        if(li.size()==0 || li.get(li.size()-1)<=nums[i]){
            li.add(nums[i]);
            solve(li,nums,i+1,set);
           li.remove(li.size()-1);
        }
         
        solve(li,nums,i+1,set);
        
        
    }
    
}