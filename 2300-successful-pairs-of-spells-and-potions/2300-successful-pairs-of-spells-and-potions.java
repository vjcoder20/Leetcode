class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int[] arr = new int[spells.length];
        Arrays.sort(potions);
        
        for(int i=0;i<spells.length;i++){
            long val = spells[i];
            
            int low = 0;
            int high = potions.length-1;
            
            
            while(low<=high){
                int mid = low+(high-low)/2;
                
                if(potions[mid]*val>=success)
                    high = mid-1;
                
                else if(potions[mid]*val<success)
                    low = mid+1;
            }
            
            
            arr[i] = potions.length-low;
            
        }
        
        return arr;
        
    }
}