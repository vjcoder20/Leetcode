class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        /*brute force
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=2;i<arr.length;i++){
            if(arr[i]-arr[i-1]!=diff){
                return false;
            }
        }
        return true;
        */
        //O(n)
        
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                smin = min;
                min = arr[i];
            }
            else if(arr[i]<smin){
               smin = arr[i]; 
            }
            set.add(arr[i]);
        }
        int cd = smin-min;
        if(cd==0){
            return set.size()==1;
        }
        
        int term = min;
        for(int i=0;i<arr.length;i++){
            if(!set.contains(term)){
                return false;
            }
            term+=cd;
        }

        return true;
    }
}