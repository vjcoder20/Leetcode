class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        int n = rocks.length;
        int[] arr = new int[n];
        
        for(int i=0;i<n;i++)
            arr[i] = capacity[i]-rocks[i];
        
        Arrays.sort(arr);
        
        int total = 0;
        
        for(int i=0;i<n;i++){
            if(additionalRocks>=arr[i]){
                total++;
                additionalRocks-=arr[i];
            }
        }
        
        return total;
        
    }
}