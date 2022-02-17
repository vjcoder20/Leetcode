class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ArrayList<Integer> al = new ArrayList<>();
        fun(candidates,0,0,al,target);
        return li;
    }
    
public void fun(int[] candidates,int idx,int ssf,ArrayList<Integer> al,int target){
        if(idx==candidates.length || ssf>target){
            return;
        }
            if(ssf==target){
                li.add(new ArrayList<>(al));
                return;
            }
        
        al.add(candidates[idx]);
        fun(candidates,idx,ssf+candidates[idx],al,target);
        al.remove(al.size()-1);
        fun(candidates,idx+1,ssf,al,target);
    }
}
