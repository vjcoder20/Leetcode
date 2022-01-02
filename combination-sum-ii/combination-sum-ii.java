class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(candidates);
        HashSet<List<Integer>> set = new HashSet<>();
        fun(candidates,0,0,al,target,set);
        return li;
    }
    
public void fun(int[] candidates,int idx,int ssf,ArrayList<Integer> al,int target, HashSet<List<Integer>> set){
    if(ssf>target){
        return;
    }
        if(idx==candidates.length){
            if(ssf==target && (!set.contains(al))){
                li.add(new ArrayList<>(al));
                set.add(al);
            }
            return;
        }
           
        if(candidates[idx]<=target){
        al.add(candidates[idx]);
        fun(candidates,idx+1,ssf+candidates[idx],al,target,set);
        al.remove(al.size()-1);
        }
    
            idx++;
        while (idx < candidates.length && candidates[idx - 1] == candidates[idx])
            idx++;
        
        fun(candidates,idx,ssf,al,target,set);
    }
}
/*
for(int i=index;i<arr.length;i++){             
if((i == index || arr[i] != arr[i-1]) && tar-arr[i]>=0){                         temp.add(arr[i]);                 
findSum(i+1,arr, tar-arr[i], al, temp);                 
temp.remove(temp.size()-1);             
}         
}
*/