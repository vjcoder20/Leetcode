class Solution {
    public int minimumDeviation(int[] arr) {
        
        TreeSet<Integer> set = new TreeSet<>();
        for(int elem:arr){
            if(elem%2==1){
                set.add(elem*2);
            }
            else{
                set.add(elem);
            }
        }
        
        int diff = Integer.MAX_VALUE;
        while(true){
            int max = set.last();
            int min = set.first();
            diff = Math.min(diff,max-min);
            if(max%2==0){
                set.remove(max);
                set.add(max/2);
            }
            else{
                
                //answer found;
               return diff;
            }
        }
    }
}