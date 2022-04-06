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
                
                int k = target - i - j;  //as (i+j+k==target)
                
                if(k<0 || k>100)
                    continue;
                
    //nC3 (as all same numbers able to meet the target Ex: arr [1,1,1,1,1,1,1] , target=3) Case:{1,1,1} 
                if (i == j && j == k)  
                    ans += freq[i] * (freq[i] - 1) * (freq[i] - 2) / 6;  //after simplfying nc3 you will get this
                
 //nC2 (as one number is different and 2 are same in contributing to achieve the target Ex: [1,1,1,1,1,2,2,2,2], target = 5) Case:{1,2,2}
                
                else if (i == j && j != k)   
            ans += freq[i] * (freq[i] - 1) / 2 * freq[k];    //after simplfying nc2 you will get this * different ones freq have to multiply
                
//nC1 (as all number are different in contributing to achieving the target Ex: [1,1,1,1,1,3,3,3,4,4,4,4], target=8)  Case:{1,3,4}
//also why i am writing this condition (i<j && j < k) because so that you don't add more answers for cases like permuation of {2,3,4} -> {2,4,3} you just have to add once only           

                else if (i<j && j < k)    
                    ans += freq[i] * freq[j] * freq[k];   //after simplfying nc1 you will get this
            }
        
        return (int)(ans % (1e9 + 7));
    

    }
}