class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
           if(i%2==0){
               al1.add(nums[i]);
           }
            else{
                al2.add(nums[i]);
            }
        }
        Collections.sort(al2, Collections.reverseOrder());
        Collections.sort(al1);
        
        int j=0,k=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = al1.get(j++);
            }
            else{
                arr[i] = al2.get(k++);
            }
        }
        return arr;
    }
}