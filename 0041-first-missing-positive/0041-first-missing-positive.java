class Solution {
    public int firstMissingPositive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        
        int temp = 1;
        while(set.contains(temp)==true){
            temp++;
        }
        return temp;
    }
}