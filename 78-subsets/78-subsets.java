class Solution {
    List<List<Integer>> li = new ArrayList<>();
    public void fun(int[] arr,int idx,List<Integer> al){
        if(idx==arr.length){
            li.add(new ArrayList<>(al));
            return;
        }
        
        al.add(arr[idx]);
        fun(arr,idx+1,al);
        al.remove(al.size()-1);
        fun(arr,idx+1,al);
    }
    public List<List<Integer>> subsets(int[] arr) {
        fun(arr,0,new ArrayList<>());
        return li;
    }
}