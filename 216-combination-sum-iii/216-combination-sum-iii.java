class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public void solve(int[] arr,int idx,int sum,int k,List<Integer> al){
        if(sum==0 && al.size()==k){
            li.add(new ArrayList<>(al));
            return;
        }
        
        if(al.size()>k || sum<0 || idx>=arr.length)
            return;
        
        al.add(arr[idx]);
        solve(arr,idx+1,sum-arr[idx],k,al);
        al.remove(al.size()-1);
        solve(arr,idx+1,sum,k,al);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        List<Integer> al = new ArrayList<>();
        solve(arr,0,n,k,al);
        return li;
    }
}