class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] arr) {
        ArrayList<Integer> al = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        fun(arr,0,al,set);
        return res;
    }
    public void fun(int[] arr,int idx,ArrayList<Integer> al,HashSet<List<Integer>> set){
        if(idx==arr.length){
            if(!set.contains(al))
            res.add(new ArrayList<>(al));
            set.add(al);
            return;
        }
        
        al.add(arr[idx]);
        fun(arr,idx+1,al,set);
        al.remove(al.size()-1);
        fun(arr,idx+1,al,set);
    }
}