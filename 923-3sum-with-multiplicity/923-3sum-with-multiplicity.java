class Solution {
    public int threeSumMulti(int[] arr, int target) {
        /*Naive Approach
        Arrays.sort(arr);
        
         long M = 1000000007;
         long ans = 0;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                for(int k=j+1;k<arr.length;k++){
                    if(arr[i]+arr[j]+arr[k]==target){
                        ans = (ans+1)%M;
                    }
                }
            }
        }
        return (int)ans;
        */
        //Optimal
        
        /*Idea:
        Count the occurrence of each number.
        using array.

        Loop i on all numbers,
        loop j on all numbers,
        check if k = target - i - j is valid.

        Add the number of this combination to result.
        3 cases covers all possible combination:

        i == j == k     ways to select 3 numbers from array 
        i == j != k     ways to select 2 numbers from array 
        i < k && j < k  ways to select 1 number from array
        
        */
       
        long[] freq = new long[101];
        int max = 0;
        for (int a : arr) {
            freq[a]++;
            max = Math.max(max,a);
        }
        
        long ans = 0;
        for (int i = 0; i <= max; i++)
            for (int j = i; j <= max; j++) {
                
                int k = target - i - j;
                
                if (k > 100 || k < 0) continue;
                
                if (i == j && j == k)  //nC3
                    ans += freq[i] * (freq[i] - 1) * (freq[i] - 2) / 6;
                
                else if (i == j && j != k)  //nC2
                    ans += freq[i] * (freq[i] - 1) / 2 * freq[k];
                
                else if (j < k)  //nC1
                    ans += freq[i] * freq[j] * freq[k];
            }
        
        return (int)(ans % (1e9 + 7));
    

    }
}