class Solution {
    public int twoCitySchedCost(int[][] arr) {
        int n = arr.length;
        int ans = 0;
        
        //Here the greedy factor is loss visiting city B over city A            i.e. costA - costB
        
        //negative value simply means it is valuable to choose cityA           over cityB and vice versa
        
        Arrays.sort(arr, (a, b) -> {
            return (a[0] - a[1]) - (b[0] - b[1]);
        }); 
        
        // System.out.println(Arrays.deepToString(arr));
       
        for(int i=0;i<n;i++){
            ans+=i<n/2?arr[i][0]:arr[i][1];
        }      
        
        return ans;
    }
}